package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode7_reverseNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int result = reverse(n);
        System.out.println(result);
    }

    private static int reverse(int x) {
        long res = 0;
        while(x!=0){
            res = res*10+x%10;
            x/=10;
        }
        return (int)res==res?(int)res:0;
    }

}
