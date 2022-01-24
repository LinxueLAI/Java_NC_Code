package LeetCode_Tests;

public class Leetcode283_moveZeros {
    public static void main(String[] args) {

    }
    /*
    给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
     */
    public void moveZeroes(int[] nums) {
        int curr = 0;
        int pos = 0;
        while(pos<nums.length){
            if(nums[pos]!=0){
                nums[curr++] = nums[pos++];
            }
            else{
                pos++;
            }
        }
        while(curr<nums.length){
            nums[curr++] = 0;
        }
    }

}
