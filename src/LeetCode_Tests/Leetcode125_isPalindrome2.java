package LeetCode_Tests;

import java.util.Locale;
import java.util.Scanner;

public class Leetcode125_isPalindrome2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        boolean res = isPalindrome2(str);
        System.out.println(res);
    }


    public static boolean isPalindrome2(String s) {
        s = s.toLowerCase();
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) <= 'z' && s.charAt(i) >= 'a' || s.charAt(i) <= '9' && s.charAt(i) >= '0') {
                if (s.charAt(j) <= 'z' && s.charAt(j) >= 'a' || s.charAt(j) <= '9' && s.charAt(j) >= '0') {
                    if (s.charAt(i) != s.charAt(j)) {
                        return false;
                    }
                } else {
                    i--;
                }
            } else {
                j++;
            }
        }
        return true;
    }

}