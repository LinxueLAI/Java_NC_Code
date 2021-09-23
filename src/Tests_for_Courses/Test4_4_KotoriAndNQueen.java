package Tests_for_Courses;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// hash set 的应用， 数学公式
public class Test4_4_KotoriAndNQueen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Integer> setLine = new HashSet<>();
        Set<Integer> setCol = new HashSet<>();
        Set<Integer> setLeft = new HashSet<>();
        Set<Integer> setRight = new HashSet<>();

        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            if (setLine.contains(x) || setCol.contains(y) || setLeft.contains(x - y) || setRight.contains(x + y)) {
                if (num[i] == 0)
                    num[i] += 1;
            }
            setLine.add(x);
            setCol.add(y);
            setLeft.add(x-y);
            setRight.add(x+y);
        }

        int check_nb = sc.nextInt();
        for (int i = 0; i < check_nb; i++) {
            if(num[sc.nextInt()-1]>0)
                System.out.println("Yes");
            else System.out.println("No");
        }
    }
   /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] xi = new int[n];
        int[] yi = new int[n];
        int max_x = 0;
        int max_y = 0;

        for (int i = 0; i < n; i++) {
            xi[i] = sc.nextInt();
            max_x = Math.max(max_x, xi[i]);
            yi[i] = sc.nextInt();
            max_y = Math.max(max_y, yi[i]);
        }
        int size = Math.max(max_x, max_y);
        System.out.println("Size = " + size);
        int[][] matrix_queen = new int[size + 2][size + 2];

        System.out.println("max_x = " + matrix_queen.length);
        System.out.println("max_y = " + matrix_queen[0].length);


        String[] result = new String[n];
        result[0] = "No";
        for (int i = 0; i < n; i++) {
            matrix_queen[xi[i]][yi[i]] = 1;
            if (i > 0 &&
                    (readLine(matrix_queen, xi[i], yi[i])
                            +
                            readCol(matrix_queen, xi[i], yi[i])

                            +
                            readLeft(matrix_queen, xi[i], yi[i])

                            + readRight(matrix_queen, xi[i], yi[i])
                    )
                            > 0)
                result[i] = "Yes";
            else if (i > 0) result[i] = "No";
        }

        int ask_n = sc.nextInt();
        for (int i = 0; i < ask_n; i++) {
            System.out.println(result[sc.nextInt() - 1]);
        }


    }
    */

    private static int readLine(int[][] matrix_queen, int x, int y) {
        int line = 0;
        for (int i = 0; i < matrix_queen[0].length; i++) {
            if (i != y)
                line += matrix_queen[x][i];
        }
        return line;
    }


    private static int readCol(int[][] matrix_queen, int x, int y) {
        int col = 0;
        for (int i = 0; i < matrix_queen.length; i++) {
            if (i != x)
                col += matrix_queen[i][y];
        }
        return col;
    }


    private static int readLeft(int[][] matrix_queen, int x, int y) {
        int line = 0;
        int xi = x;
        int yi = y;
        do {
            xi -= 1;
            yi -= 1;
            line += matrix_queen[xi][yi];
        } while (xi > 0 && yi > 0);

        int xj = x;
        int yj = y;
        do {
            xj += 1;
            yj += 1;
            System.out.println("x = " + xj);
            System.out.println("y = " + yj);
            line += matrix_queen[xj][yj];
        } while (xj < matrix_queen.length - 1 && yj < matrix_queen[0].length - 1);


        return line;
    }


    private static int readRight(int[][] matrix_queen, int x, int y) {
        int line = 0;
        int xi = x;
        int yi = y;
        do {
            xi -= 1;
            yi += 1;
            line += matrix_queen[xi][yi];

        } while (xi > 0 && yi < matrix_queen[0].length - 1);

        int xj = x;
        int yj = y;
        do {
            xj += 1;
            yj -= 1;
            line += matrix_queen[xj][yj];

        } while (xj < matrix_queen.length - 1 && yj > 0);

        return line;
    }


}
