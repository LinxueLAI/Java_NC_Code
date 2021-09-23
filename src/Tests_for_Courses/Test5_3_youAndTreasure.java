package Tests_for_Courses;

import java.awt.*;
import java.util.Scanner;

public class Test5_3_youAndTreasure {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[][] arr = new int[n][2];
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        double result = 1e9;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                result = Math.min(
                        result, Math.sqrt(arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1])
                                + Math.sqrt(arr[j][0] * arr[j][0] + arr[j][1] * arr[j][1])
                                + Math.sqrt(
                                (arr[i][0] - arr[j][0]) * (arr[i][0] - arr[j][0]) + (arr[i][1] - arr[j][1])
                                        * (arr[i][1] - arr[j][1])
                        )
                );
            }
            System.out.println(String.format("%.6f",result));


        }
    }
}
