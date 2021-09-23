package NC_Codes;

import java.util.Scanner;

public class NC56_isPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean res = isPalindrome(sc.nextInt());
        System.out.println(res);
    }

    private static boolean isPalindrome(int x) {
        if (x < 0) return false;
        if (x < 10) return true;
        if (x < 100) {
            return x % 10 == (x / 10);
        } else {
            int n = 0, y = x;
            while (y != 0) {
                n += 1;
                y /= 10;
            }
            int left = (int) (x / Math.pow(10, n-1));
            System.out.println("left = " + left);
            System.out.println("right = " + x % 10);
            boolean out = (left == x % 10);
            System.out.println("out =" + out);
            return out && isPalindrome((int) ((x % Math.pow(10, n-1)) / 10));
        }
    }
}
