package Tests_for_Courses;

import java.util.Scanner;
import java.util.Stack;

// 点击消除： 栈的应用
public class Test4_1_eliminateDuplicateLetters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        System.out.println(eliminateDuplicateLetters(input));
    }

    public static String eliminateDuplicateLetters(String str) {
        if (str.length() < 1) return "0";
        if (str.length() == 1) return str;
        Stack<Character> testStack = new Stack<>();
        testStack.add(str.charAt(0));
        int index = 1;
        while (index < str.length()) {
            if(testStack.isEmpty()) testStack.add(str.charAt(index));
            else if (testStack.peek() == str.charAt(index)) {
                testStack.pop();
            } else testStack.add(str.charAt(index));
            index += 1;
        }
        if(testStack.isEmpty()) return "0";
        else {
            StringBuilder res = new StringBuilder();
            while (!testStack.isEmpty())
                res.append(testStack.pop());

            return res.reverse().toString();
        }
    }
}


