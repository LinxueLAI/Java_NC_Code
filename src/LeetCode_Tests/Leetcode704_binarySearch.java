package LeetCode_Tests;

public class Leetcode704_binarySearch {
    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};
        int target =9;
        int index = binarySearch(arr,target);
        System.out.println(index);
    }

    private static int binarySearch(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        if(nums.length==0 ||nums[nums.length-1]<target)
            return -1;

        int mid = 0;
        while(left<=right){
            mid = (right+left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else{
                if(nums[mid]>target){
                    right = mid-1;
                }
                else{
                    left = mid+1;
                }
            }
        }

        return -1;
    }
}
