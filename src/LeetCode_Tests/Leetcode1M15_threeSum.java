package LeetCode_Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1M15_threeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (nums[i] > 0) return result;

            if (i > 0 && nums[i] == nums[i - 1]){
                continue; // 不考虑重复的a
            }

            int left = i + 1;// b
            int right = nums.length - 1;// c
            // 由于nums已经被排序过，，必然有a<=b<=c
            while (right > left){
                int sum = nums[i] + nums[left] + nums[right];
                if (sum > 0) right--;
                else if (sum < 0) left++;
                else{
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    while (right > left && nums[right] == nums[right - 1]) right--;//去重
                    while (right > left && nums[left] == nums[left + 1]) left++;

                    right--;
                    left++;
                }
            }
        }
        return result;
    }
}
