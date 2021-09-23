package NC_Codes;

import java.util.Scanner;

public class NC92_LongestCommonSubSeq {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String result = LCS(str1, str2);
        System.out.println(result);
    }

    private static String LCS(String str1, String str2) {

        int len1 = str1.length();
        int len2 = str2.length();
        if (len1 == 0 || len2 == 0)
            return "-1";
        int[][] dp = new int[len1 + 1][len2 + 1];
        int result = 0;
        for (int i = 1; i <= len1; i++) {
            for (int j = 1; j <= len2; j++) {
                if (i == 0 || j == 0)
                    dp[i][j] = 0;
                else if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
            }
        }


        StringBuilder new_str = new StringBuilder();

        while (len1 != 0 && len2 != 0) {

            if (str1.charAt(len1 - 1) == str2.charAt(len2 - 1)) {
                new_str.append(str1.charAt(len1 - 1));
                len1--;
                len2--;
            } else {
                if (dp[len1 - 1][len2] > dp[len1][len2 - 1]) {
                    len1--;
                } else
                    len2--;
            }
        }
        if (new_str.length() == 0)
            return "-1";
        return new_str.reverse().toString();
    }
}
