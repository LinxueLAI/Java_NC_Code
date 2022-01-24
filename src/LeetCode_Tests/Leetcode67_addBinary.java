package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode67_addBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        String res = addBinary(a, b);
        System.out.println(res);
    }

    private static String addBinary(String a, String b) {
        int aLen = a.length() - 1;
        int bLen = b.length() - 1;
        StringBuilder sb = new StringBuilder();

        int m = 0;
        while (aLen >= 0 && bLen >= 0) {
            if (a.charAt(aLen) == '0' && b.charAt(bLen) == '0') {
                sb.append(m);
                m = 0;
            } else if (a.charAt(aLen) == '1' && b.charAt(bLen) == '1') {
                sb.append(m);
                m = 1;
            } else {
                if (m > 0) {
                    sb.append(0);
                    m = 1;
                } else {
                    sb.append(1);
                    m = 0;
                }
            }
            aLen--;
            bLen--;
        }
        while (aLen >= 0) {
            if (a.charAt(aLen) == '1' && m == 1) {
                sb.append(0);
                m = 1;
            } else {
                sb.append(Integer.parseInt(a.substring(aLen, aLen + 1)) + m);
                m = 0;
            }
            aLen--;
        }
        while (bLen >= 0) {
            if (b.charAt(bLen) == '1' && m == 1) {
                sb.append(0);
                m = 1;
            } else {
                sb.append(Integer.parseInt(b.substring(bLen, bLen + 1)) + m);
                m = 0;
            }
            bLen--;
        }
        if (m > 0)
            sb.append(1);
        return sb.reverse().toString();
    }
}
