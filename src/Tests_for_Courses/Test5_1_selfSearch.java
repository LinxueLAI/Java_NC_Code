package Tests_for_Courses;

import java.util.Scanner;

public class Test5_1_selfSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        double max = 5,min = 1;
        if (n == m) {
            System.out.printf("%.5f", min);
            System.out.print(" ");
            System.out.printf("%.5f", max);
        } else {

            float sum = 0;
            for (int i = 0; i < n - m; i++) {
                sum += sc.nextInt();
            }
            System.out.println(sum);


            double result1 = (sum + m) / n;
            double result2 = (sum + 5 * m) / n;


            System.out.printf("%.5f", result1);
            System.out.print(" ");
            System.out.printf("%.5f", result2);
        }
    }
}
