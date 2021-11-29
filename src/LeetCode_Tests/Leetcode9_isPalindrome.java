package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode9_isPalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(isPalindrome(n));
        System.out.println(isPalindrome_v2(n));
    }

    private static boolean isPalindrome_v2(int x) {
        if (x < 0)
            return false;
        else if (x < 10) {
            return true;
        } else {
            int res = 0;
            int init_x = x;
            while (init_x != 0) {
                int add = init_x % 10;
                res = res * 10 + add;
                init_x /= 10;
            }
            return res == x;
        }
    }

    private static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x < 10) {
            return true;
        } else {
            StringBuilder sb = new StringBuilder();
            while (x != 0) {
                sb.append(x % 10);
                x /= 10;
            }
            System.out.println(sb);
            System.out.println(sb.reverse());
            return sb.toString().equals(sb.reverse().toString());
        }
    }
}
