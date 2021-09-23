package NC_Codes;

import java.util.Scanner;

public class NC142_LongestCommonSubStr {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
        String test = "iyyurfazvnqmsazfsseqgucruxxpggkwmcrrxufhvhjhugryanunnunxphuqavgbwzlzvjqjnujywumytvyhofupqsjflvetlihaapdpqiydyplbmnzukwpbnvm";
        System.out.println(LongestCommonSubStr(test));
    }

    private static int LongestCommonSubStr(String str) {
        int max_common_len = 0;
        for (int i = 0; i < str.length(); i++) {
            char first_c = str.charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                int len = j - i;
                if (str.charAt(j) == first_c && (j + len) < str.length()) {
                    if (check(str, len, j)) {
                        max_common_len = Math.max(max_common_len, len*2);
                        System.out.println(str.substring(j,j+len));
                    }
                }
            }

        }
        return max_common_len;
    }

    private static boolean check(String str, int len, int j) {
        for (int k = 1; k < len; k++) {
            if (str.charAt(j - len + k) != str.charAt(j + k))
                return false;
        }
        return true;
    }
}
