package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode28_strStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String haystack = sc.next();
        String needle = sc.next();
        int res = strStr(haystack, needle);
        System.out.println(res);
    }

    private static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int i = 0, j = 0;
        int start = 0, len = 0;
        while (i <= (haystack.length() - needle.length()) && j < needle.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                start = i;
                System.out.println("i="+i);
                System.out.println("j="+j);
                while (j<needle.length()) {
                    if(haystack.charAt(i++) == needle.charAt(j++)){
                        len++;
                    }
                }
                System.out.println("len = "+len);
                if (len == needle.length())
                    return start;
                else{
                    i = start;
                    j = 0;
                    len = 0;
                }
            }
            i++;
        }
        return -1;
    }
}
