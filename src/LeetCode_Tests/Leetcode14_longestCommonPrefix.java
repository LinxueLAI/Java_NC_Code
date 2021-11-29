package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode14_longestCommonPrefix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().split("=")[1];// [... ]
        System.out.println(input.substring(2, input.length() - 1));
        String[] strs = input.substring(2, input.length() - 1).split(",");

        String res = longestCommonPrefix(strs);
        System.out.println(res);
    }

    private static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int minLen = strs[0].length();
        for (String str : strs) {
            minLen = Math.min(str.length(), minLen);
        }
        for (int index = 0; index < minLen; index++) {
            char tmp = strs[0].charAt(index);
            boolean same = true;
            for (String str : strs) {
                if (str.charAt(index) != tmp) {
                    same = false;
                    return sb.toString();
                }
            }
            sb.append(tmp);
        }

        return sb.toString();
    }
}
