package LeetCode_Tests;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Leetcode3_lengthOfLongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(lengthOfLongestSubstring(str));

    }

    public static int lengthOfLongestSubstring(String s) {

        StringBuilder subStr = new StringBuilder();
        int ptr = 0;
        int end = ptr;
        int res = 0;
        while (ptr < s.length()) {//pwwkew
            if (!subStr.toString().contains(s.substring(ptr, ptr + 1))) {
                subStr.append(s.charAt(ptr));
                System.out.println(subStr.toString());
                ptr++;
            } else {
                res = Math.max(res, subStr.length());
                ptr = subStr.toString().indexOf(s.charAt(ptr)) + 1 + end;
                subStr.delete(0, subStr.length());
                end = ptr;
            }
        }
        if(s.length()==subStr.length())
            return s.length();
        return res;
    }
}
