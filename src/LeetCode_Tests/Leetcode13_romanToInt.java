package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode13_romanToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int res = romanToInt(s);
        System.out.println(res);

        int res2 = romanToInt2(s);
        System.out.println(res2);
    }

    public static int romanToInt2(String s) {
        s = s.replace("IV","a");
        s = s.replace("IX","b");
        s = s.replace("XL","c");
        s = s.replace("XC","d");
        s = s.replace("CD","e");
        s = s.replace("CM","f");

        int res = 0;
        for (int i = 0; i < s.length(); i++) {
            res += getValue(s.charAt(i));
        }
        return res;
    }

    public static int getValue(char c) {
        switch(c) {
            case 'I': return 1;
            case 'V': return 5;
            case 'X': return 10;
            case 'L': return 50;
            case 'C': return 100;
            case 'D': return 500;
            case 'M': return 1000;
            case 'a': return 4;
            case 'b': return 9;
            case 'c': return 40;
            case 'd': return 90;
            case 'e': return 400;
            case 'f': return 900;
        }
        return 0;
    }

    private static int romanToInt(String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {

            if (s.equals("V")) {
                return 5;
            }
            if (s.equals("X")) {
                return 10;
            }
            if (s.equals("L")) {
                return 50;
            }
            if (s.equals("C")) {
                return 100;
            }
            if (s.equals("D")) {
                return 500;
            }
            if (s.equals("M")) {
                return 1000;
            }
            return 1;

        } else {
            // s.length >=2
            String subStr = s.substring(0, 2);
            if (subStr.equals("CD")) {
                return 400 + romanToInt(s.substring(2));
            }
            if (subStr.equals("CM")) {
                return 900 + romanToInt(s.substring(2));
            }
            if (subStr.equals("XL")) {
                return 40 + romanToInt(s.substring(2));
            }
            if (subStr.equals("XC")) {
                return 90 + romanToInt(s.substring(2));
            }
            if (subStr.equals("IV")) {
                return 4 + romanToInt(s.substring(2));
            }
            if (subStr.equals("IX")) {
                return 9 + romanToInt(s.substring(2));
            }

            if (s.charAt(0) == 'V') {
                return 5 + romanToInt(s.substring(1));
            }
            if (s.charAt(0) == 'X') {
                return 10 + romanToInt(s.substring(1));
            }
            if (s.charAt(0) == 'L') {
                return 50 + romanToInt(s.substring(1));
            }
            if (s.charAt(0) == 'C') {
                return 100 + romanToInt(s.substring(1));
            }
            if (s.charAt(0) == 'D') {
                return 500 + romanToInt(s.substring(1));
            }
            if (s.charAt(0) == 'M') {
                return 1000 + romanToInt(s.substring(1));
            }
            return 1 + romanToInt(s.substring(1));

        }
    }
}
