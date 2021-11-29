package Other_Tests;

import java.util.Scanner;
import java.util.Stack;

public class NC_Test3ContinuePrimeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num == 2)
            System.out.println(1);
        else {
            int[] primeNumberArray = primeNum(num);
            for (int n : primeNumberArray
            ) {
                System.out.println(n);

            }
            int result = 0;
            for (int i = 0; i < primeNumberArray.length; i++) {
                int sum = 0;
                for (int j = i; j < primeNumberArray.length; j++) {
                    sum += primeNumberArray[j];
                    if (sum == num) {
                        result++;
//                    System.out.println("j="+j);
                    } else if (sum < num)
                        continue;
                    else break;
                }
            }
            System.out.println(result);
        }
    }

    private static int[] primeNum(int num) {
        Stack<Integer> stack = new Stack<>();
        stack.add(2);
        for (int i = 3; i <= num; i++) {
            if (isPrime(i))
                stack.add(i);
        }
        int[] primeArray = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            primeArray[i++] = stack.pop();
        }
        return primeArray;
    }

    private static boolean isPrime(int i) {
        Stack<Integer> stack = new Stack<>();
        for (int j = 2; j < i; j++) {
            if (i % j == 0)
                stack.add(j);
        }
        if (stack.size() > 0)
            return false;
        else return true;
    }


}
