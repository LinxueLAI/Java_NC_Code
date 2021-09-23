package NC_Codes;

import java.util.Scanner;

public class NC55_longestCommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        System.out.println(longestCommonPrefix(str));
    }

    private static String longestCommonPrefix(String[] str) {
        StringBuilder res = new StringBuilder();

        int check_length = str[0].length();
        for (int i = 0; i < check_length; i++) {

            Boolean check = true;
            char tmp_c = str[0].charAt(i);
            for (String s:
                    str
                 ) {
                if(i>=s.length())
                    check = false;
                else if(s.charAt(i)!=tmp_c)
                {
                    check = false;
                    break;
                }
            }
            if(check==true)
                res.append(tmp_c);
        }
        return res.toString();
    }
}
