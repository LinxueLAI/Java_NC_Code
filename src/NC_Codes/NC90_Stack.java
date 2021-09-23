package NC_Codes;

import javax.sound.midi.Soundbank;
import java.util.Scanner;
import java.util.Stack;

public class NC90_Stack<E> {

    Stack<Integer> stack_normal = new Stack<>();
    Stack<Integer> stack_min_val = new Stack<>();

    public static void main(String[] args) {

        /*
         输入:    ["PSH-1","PSH2","MIN","TOP","POP","PSH1","TOP","MIN"]
         输出:    -1,2,1,-1
         */
        NC90_Stack<Integer> test_stack = new NC90_Stack<>();
        Scanner sc = new Scanner(System.in);
        int opts = sc.nextInt();
        String str[] = new String[opts];
        for (int i = 0; i < opts; i++) {
            str[i] = sc.next();

            if (str[i].contains("PSH")) {
                String tmp = str[i].substring(3);
                System.out.println("tmp = " + tmp);
                int elm = Integer.valueOf(tmp);
                test_stack.push(elm);
            }
            if (str[i].contains("MIN")) {
                System.out.println(test_stack.min());
            }
            if (str[i].contains("TOP")) {
                System.out.println(test_stack.top());
            }
            if (str[i].contains("POP")) {
                test_stack.pop();
            }
        }

    }


    public void push(int node) {
        stack_normal.push(node);
        if (stack_min_val.isEmpty())
            stack_min_val.push(node);
        else {
            if (node < stack_min_val.peek())
                stack_min_val.push(node);
            else
                stack_min_val.push(stack_min_val.peek());
        }

    }

    public void pop() {
        stack_normal.pop();
        stack_min_val.pop();
    }

    public int top() {
        return stack_normal.peek();
    }

    public int min() {
        return stack_min_val.peek();
    }

}
