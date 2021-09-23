package NC_Codes;

import java.util.Scanner;

public class NC38_SpiralMatrix {
    public static void main(String[] args) {
        /*
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int a[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[n][m] = sc.nextInt();
            }

        }

         */
        int a[][] = new int[2][2];
        int init = 1;
        a[0][0] = 1;
        a[0][1] = 2;
        a[1][0] = 3;
        a[1][1] = 4;
        spiralMatrix(a);

    }

    private static void spiralMatrix(int[][] a) {

        int n = a.length;
        int m = a[0].length;
        System.out.println("n ="+n+",m = "+m);

        // top line
        for (int i = 0; i <= m - 1; i++) {
            System.out.println("top");
            System.out.println(a[0][i]);
        }
        // right line

        for (int i = 1; i <= n - 1; i++) {
            System.out.println("right");
            System.out.println(a[i][m - 1]);
        }

        // bottom line
        if (n > 1) {
            for (int i = m - 2; i >= 0; i--) {
                System.out.println("bottom");
                System.out.println(a[n - 1][i]);
            }
        }

        // left line
        if (m > 1) {
            for (int i = n - 2; i >0; i--) {
                System.out.println("left");
                System.out.println(a[i][0]);
            }
        }

        int sub_n = n - 2;
        int sub_m = m - 2;
        if (sub_m > 0 && sub_n > 0) {
            System.out.println("new a : ");
            int sub_a[][] = new int[sub_n][sub_m];
            for (int i = 0; i <= n - 3; i++) {
                for (int j = 0; j <= m - 3; j++) {
//                    System.out.println("pos : "+(i+1)+","+ (j+1));
//                    System.out.println(a[i+1][j+1]);
                    sub_a[i][j] = a[i + 1][j + 1];
                }
            }
            spiralMatrix(sub_a);
        }


    }

}
