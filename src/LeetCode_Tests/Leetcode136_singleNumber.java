package LeetCode_Tests;

import java.util.Scanner;

public class Leetcode136_singleNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strs = input.substring(1,input.length()-1).split(",");
        int[] nums = new int[strs.length];
        for (int i = 0; i < strs.length; i++) {
            nums[i] = Integer.parseInt(strs[i]);
        }
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        int res = nums[0];
        int tmp = 1;
        while(tmp<nums.length){
            res= res ^ nums[tmp++];
        }
        return res;
    }
}
