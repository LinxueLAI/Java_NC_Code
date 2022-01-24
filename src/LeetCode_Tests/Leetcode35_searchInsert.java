package LeetCode_Tests;

public class Leetcode35_searchInsert {
    public static void main(String[] args) {

    }
    /*
    给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
    请必须使用时间复杂度为 O(log n) 的算法。
     */
    public int searchInsert(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        if(nums[0]>target)
            return 0;
        if(high==0){
            return nums[0]<target?1:0;
        }
        while(low<high){
            mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }

        return nums[low]>=target?low:low+1;
    }
}
