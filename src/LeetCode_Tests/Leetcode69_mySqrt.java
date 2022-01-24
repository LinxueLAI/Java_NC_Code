package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode69_mySqrt {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int res = mySqrt(x);
        System.out.println(res);
    }

    private static int mySqrt(int x) {

        if (x <= 1)
            return x;

        long left = 1;
        long right = x;
        long mid = (left + right) / 2;
        while (true) {
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x) { //只有满足这两个条件的时候才输出mid
                return (int) mid;
            } else if (mid * mid > x) {// mid的选取太大，往左边看
                right = mid - 1;
                mid = (int) (left + right) / 2;
                System.out.println("left ="+left);
                System.out.println("mid = "+mid);
                System.out.println("now right = " + right);
            } else {// mid的选取太小，往右边看
                left = mid + 1;
                mid = (int) (left + right) / 2;
                System.out.println("now left = " + left);
                System.out.println("mid = "+mid);

                System.out.println("right = "+right);
            }
        }
    }
}
