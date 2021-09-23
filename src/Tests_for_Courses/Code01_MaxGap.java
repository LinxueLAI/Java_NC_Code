package Tests_for_Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Code01_MaxGap {

    public static void main(String[] args) throws IOException {
//        int[] nums = {17,13,19,0,23,26,29,59,99};
//        Scanner sc =  new Scanner(System.in);
//        int N = sc.nextInt();
//        int[] nums = new int[N];

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        String[] strNum = br.readLine().trim().split(" ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNum[i]);
        }
        int result = maxGap(nums);
        System.out.println(result);
    }

    private static int maxGap(int[] nums) {
        if (nums == null || nums.length < 2) {
            return 0;
        }
        int len = nums.length;
        int min = Integer.MAX_VALUE; //最小值开始等于系统最大
        int max = Integer.MIN_VALUE;//最大值开始等于系统最小
        for (int i = 0; i < len; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }
        if (min == max) {
            return 0;
        }
        //不止一种数字，min-max一定有range,len个数据，准备len+1个桶
        boolean[] hasNum = new boolean[len + 1]; //hasNum[i] i号桶是否进来过数字
        int[] maxs = new int[len + 1]; // max[i] i号桶收集桶中所有数字的最大值
        int[] mins = new int[len + 1]; // min[i] i号桶收集桶种所有数字的最小值

        int bid = 0; //桶号
        for (int i = 0; i < len; i++) {
            bid = bucket(nums[i], len, min, max); //用于计算这个数字属于第几个桶
            mins[bid] = hasNum[bid] ? Math.min(mins[bid], nums[i]) : nums[i];
            maxs[bid] = hasNum[bid] ? Math.max(maxs[bid], nums[i]) : nums[i];
            hasNum[bid] = true;
        }
        int res = 0;
        int lastMax = maxs[0]; //上一个非空桶的最大值
        int i = 1;
        for (; i <= len; i++) {
            if (hasNum[i]) {
                res = Math.max(res, mins[i] - lastMax);
                lastMax = maxs[i];
            }
        }
        return res;

    }

    //使用long防止相乘溢出
    public static int bucket(long num, long len, long min, long max) {
        return (int) ((num - min) * len / (max - min));
    }


}
