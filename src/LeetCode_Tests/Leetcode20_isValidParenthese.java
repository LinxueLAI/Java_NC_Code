package LeetCode_Tests;

import java.util.Scanner;
import java.util.Stack;

public class Leetcode20_isValidParenthese {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(isValid(str));
        System.out.println(isValid2(str));
    }

    private static boolean isValid2(String str) {
        Stack<Character> stack = new Stack<>();
        int index = 0;
        while (index < str.length()) {
            char tmp = str.charAt(index++);
            if (stack.isEmpty())
                stack.add(tmp);
            else {
                if (
                        tmp == ')' && stack.peek() == '('
                                || tmp == ']' && stack.peek() == '['
                                || tmp == '}' && stack.peek() == '{'
                )
                    stack.pop();
                else {
                    stack.add(tmp);
                }
            }
        }

        return stack.isEmpty();
    }

    private static boolean isValid(String str) {

        while (str.contains("()") || str.contains("[]") || str.contains("{}")) {
            str = str.replace("()", "");
            str = str.replace("[]", "");
            str = str.replace("{}", "");
        }

        return str.equals("");
    }
}
