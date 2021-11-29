package NC_Codes;

import java.util.Scanner;

public class NC17_getLongestPalindrome {
    // 求最长的回文子串： 用动态规划方法做
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int result = getLongestPalindrome(str, str.length());
        System.out.println(result);
    }

    private static int getLongestPalindrome(String str, int n) {
        if (n < 2) return str.length();


        boolean[][] dp = new boolean[n][n];
        int maxLength = 1;
        for (int right = 1; right < str.length(); right++) {

            for (int left = 0; left <= right; left++) {

                if (str.charAt(left) != str.charAt(right))
                    continue; // 跳过此次循环

                System.out.println("test: left = " + left + "str[left] = " + str.charAt(left));
                System.out.println("test: right = " + right + "str[right]=" + str.charAt(right));

                if (right == left) {
                    dp[left][right] = true;
                } else if (right - left <= 2) {
                    dp[left][right] = true;
                } else {
                    dp[left][right] = dp[left + 1][right - 1];
                }

                if (dp[left][right] && right - left + 1 > maxLength) {
                    maxLength = right - left + 1;
                }
            }
        }
        return maxLength;
    }
}
