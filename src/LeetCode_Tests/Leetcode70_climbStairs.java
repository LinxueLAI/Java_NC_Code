package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode70_climbStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int res = climbStairs(n);
        System.out.println(res);
    }

    private static int climbStairs(int n) {
        if (n <= 2)
            return n;
        int first = 1;
        int second = 2;
        int third = first + second;// dp[3] = dp[1]+dp[2]
        int i = 4;
        while(i<=n){
            first = second;
            second = third;
            third = first+second;
            i++;
        }

        return third;

    }
}
