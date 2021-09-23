package NC_Codes;

import java.util.Scanner;

public class NC32_sqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int result = sqrt(x);

        System.out.println(result);
    }

    private static int sqrt(int x) {
        if (x < 1)
            return 0;

        if (x == 1)
            return 1;

        double left = 1;
        double right = x;
        long mid = (int)(left + right) / 2;
        while (true) {
            if (mid * mid <= x && (mid + 1) * (mid + 1) > x)
                return (int) mid;
            else if (mid * mid > x) {
                right = mid-1;
                mid = (int) (left + right) / 2;
                System.out.println("mid*mid>x :" + mid);
            } else if (mid * mid < x) {
                left = mid+1;
                mid = (int)(left + right) / 2;
                System.out.println("(mid + 1) * (mid + 1) <= x" + mid);
            }
        }
    }
}
