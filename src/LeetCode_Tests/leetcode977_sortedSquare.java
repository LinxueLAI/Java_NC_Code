package LeetCode_Tests;

public class leetcode977_sortedSquare {
    public static void main(String[] args) {

    }
/*
给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */
    public int[] sortedSquares(int[] nums) {
        int[] res = new int[nums.length];
        int left = 0, right = nums.length - 1;
        int mid = 0;
        if(nums[0]>=0){
            while(mid<res.length){
                res[mid]= nums[mid]*nums[mid];
                mid++;
            }
        }
        else if(nums[nums.length-1]<=0){
            mid = nums.length-1;
            int index = 0;
            while(mid>=0){
                res[index++]= nums[mid]*nums[mid];
                mid--;
            }
        }
        else{
            // find the first num whose abs(nums) is the smallest
            while(left<right){
                mid = (left+right)/2;
                if(nums[mid]==0){
                    left = mid;
                    right = mid;
                }
                else if(nums[mid]<0){
                    left = mid+1;
                }
                else{
                    right = mid-1;
                }
            }
            if(nums[right]>=0){
                left = right-1;
            }
            else{
                left = right;
                right++;
            }
            int index = 0;

            while(left>=0 && right<nums.length){
                if(nums[left]*nums[left]>nums[right]*nums[right]){
                    res[index++]=nums[right]*nums[right];
                    right++;
                }
                else{
                    res[index++] =nums[left]*nums[left];
                    left--;
                }
            }
            while(left>=0){
                res[index++] =nums[left]*nums[left];
                left--;
            }
            while(right<nums.length){
                res[index++]=nums[right]*nums[right];
                right++;
            }
        }
        return res;
    }
}
