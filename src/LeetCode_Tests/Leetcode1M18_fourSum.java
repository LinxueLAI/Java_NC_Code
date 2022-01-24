package LeetCode_Tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1M18_fourSum {
    public static void main(String[] args) {

        int[] sums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(sums,target));
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);
        return nSums(nums, 4, 0, target);
    }

    public static List<List<Integer>> nSums(int[] nums, int n, int start, int target){
        int size = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        // 至少是2数之和并且数组长度至少要等于目标元素的个数
        if (n < 2 || size < n){
            return result;
        }
        if (n == 2) {
            //求2数字之和，采用双指针法
            int left = start;
            int right = size - 1;
            while (left < right){
                int leftElm = nums[left], rightElm = nums[right];
                int sum = leftElm + rightElm;
                if (sum < target){
                    //左指针右移+去重
                    while (left < right && nums[left] == leftElm) left++;
                }
                else if (sum > target){
                    while (left < right && nums[right] == rightElm) right--;
                }
                else{
                    // 增加一组
                    result.add(Arrays.asList(nums[left],nums[right]));
                    while (left < right && nums[left] == leftElm) left++;
                    while (left < right && nums[right] == rightElm) right--;
                }
            }
        }
        else{
            // 大于2个数字之和，采用递归方法
            for (int i = start; i < size; i++){
                List<List<Integer>> subResult = nSums(nums, n - 1, i + 1, target - nums[i]);
                //加入当前元素
                for (List<Integer> list : subResult) {
                    ArrayList<Integer> arrayList = new ArrayList<>();
                    arrayList.add(nums[i]);
                    arrayList.addAll(list);
                    result.add(arrayList);
                }
                //去重
                while (i < size - 1 && nums[i + 1] == nums[i]) {
                    i++;
                }
            }
        }

        return result;
    }
}
