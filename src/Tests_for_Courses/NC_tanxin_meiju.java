package Tests_for_Courses;

import java.util.Scanner;

public class NC_tanxin_meiju {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < 1 << n; i++) {
            int p = i;
            int sum = 0;
            for (int j = 0; j < n; j++) {
                sum += p % 2 * a[i];
                p /= 2;

            }
        }
    }
}
