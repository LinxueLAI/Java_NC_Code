package NC_Codes;

import java.util.Date;
import java.util.Scanner;

public class NC34_uniquePaths {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long startTime = new Date().getTime();

        int result = uniquePaths(m, n);
        System.out.println(result);
        long entTime1 = new Date().getTime();
        System.out.println(entTime1 - startTime);

        int result2 = uniquePaths2(m, n);
        System.out.println(result2);
        long entTime2 = new Date().getTime();
        System.out.println(entTime2 - startTime);


    }

    // method 2 :  dp
    private static int uniquePaths2(int m, int n) {

        int dp[][] = new int[m][n];
        dp[0][0] = 0;
        for (int i = 1; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int i = 1; i < n; i++) {
            dp[0][i] = 1;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m - 1][n - 1];
    }

    // method 1 : Math
    private static int uniquePaths(int m, int n) {
        // Choose m steps from (m+n) steps
        // 29 ,4
        /*
         (28+3)*..*(28+1) / 3!
         */
        int sum = m + n - 2;

        long up = 1;
        for (int i = sum; i > Math.max(m, n) - 1; i--) {
            up *= i;
        }
        long down = factorial(Math.min(m, n) - 1);
        System.out.println("up = " + up);
        return (int) (up / (down));
    }

    private static long factorial(int i) {
        if (i <= 1)
            return 1;
        return i * factorial(i - 1);
    }
}
