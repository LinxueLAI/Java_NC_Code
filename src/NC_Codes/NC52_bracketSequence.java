package NC_Codes;

import java.util.Scanner;
import java.util.Stack;

public class NC52_bracketSequence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(bracketSequenceIsValid(str));
    }

    private static boolean bracketSequenceIsValid(String str) {
        if (str.isEmpty() || str.length() % 2 == 1)
            return false;
        Stack<Character> stack = new Stack<>();
        for (char s : str.toCharArray()
        ) {
            if (stack.empty())
                stack.push(s);
            else if (s == ')' && stack.peek() == '(') {
                stack.pop();
            }
            else if (s==']' && stack.peek()=='[')
                stack.pop();
            else if(s=='}'&&stack.peek()=='{')
                stack.pop();
            else stack.push(s);
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
