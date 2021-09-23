package NC_Codes;

import java.util.Scanner;

public class NC19_maxsumofSubArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int result = maxsumofSubArray(a);

        System.out.println(result);
    }

    private static int maxsumofSubArray(int[] a) {
        // when sizeOf array = 1

        int length = a.length;
        if(length==1) return a[0];
        int dp[] = new int[length];
        dp[0] = a[0];
        int max = 0;
        for (int i = 1; i < length; i++) {
            if (dp[i - 1] <= 0) {
                dp[i] = a[i];
            } else
                dp[i] = a[i] + dp[i - 1];
            max = Math.max(dp[i-1],dp[i]);
        }

        return max;

    }
}
