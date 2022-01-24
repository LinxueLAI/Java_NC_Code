package LeetCode_Tests;

import java.awt.desktop.PreferencesEvent;
import java.util.Arrays;
import java.util.Scanner;

public class Leetcode557_reverseWord {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println(reverseWords(input));
    }
/*

给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。

python yyds 就一行:         return ' '.join(i[::-1] for i in s.split())
java:利用了StringBuilder的内置函数
 */
    public static String reverseWords(String s) {
        String[] split = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            if(i<split.length-1) {
                sb.append(reverseString(split[i]));
                sb.append(" ");
            }
            else{
                sb.append(reverseString(split[i]));
            }
        }
        return sb.toString();
    }

    private static String reverseString(String str) {
        StringBuilder sb = new StringBuilder();
        for (char a: str.toCharArray()
             ) {
            sb.append(a);

        }
        return sb.reverse().toString();
    }
}
