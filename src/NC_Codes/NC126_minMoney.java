package NC_Codes;

import java.util.Arrays;
import java.util.Scanner;

public class NC126_minMoney {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int aim = sc.nextInt();
        int result = minMoneyDp(a, aim);
        System.out.println(result);
    }

    private static int minMoneyDp(int[] a, int aim) {
        int dp[] = new int[aim + 1];
        Arrays.fill(dp, aim + 1);

        dp[0] = 0;
        for (int i = 1; i <= aim; i++) {
            for (int j = 0; j < a.length; j++) {
                if (a[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - a[j]] + 1); // dp[3] = 21, dp[3-2]+1 = dp[1]+1 = 21 => dp[3] = 21 ;  dp[3] = 21 ,dp[0]+1 = 1 => dp[3] = 1
                    System.out.println("dp[" + i + "] =" + dp[i]);
                }
            }
        }

        return dp[aim] > aim ? -1 : dp[aim];
    }
}
