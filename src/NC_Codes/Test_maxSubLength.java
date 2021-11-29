package NC_Codes;

import java.util.Arrays;
import java.util.Scanner;

public class Test_maxSubLength {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split("=");
        String[] str1 = str[1].substring(2, str[1].length() - 1).split(",");

        int[] nums = new int[str1.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(str1[i]);
            System.out.println(nums[i]);
        }

        int res = maxSubLength(nums);
        System.out.println(res);
        //nums = [10,9,2,5,3,7,101,18]
    }

    private static int maxSubLength(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); //dp[i]用来储存前i个最长递增子序列的数量。
                }
            }
        }

        int res = 0;
        int k = 0;
        while (k < dp.length) {
            res = Math.max(res, dp[k]);
            k++;

        }

        return res;
    }
}
