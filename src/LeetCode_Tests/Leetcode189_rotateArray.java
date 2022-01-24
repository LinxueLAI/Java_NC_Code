package LeetCode_Tests;

public class Leetcode189_rotateArray {
    public static void main(String[] args) {

    }
    /*
    方法一：使用额外空间 空间复杂度为 O（n)
    方法二：环状替换，考虑从初始值开始遍历不到的那些位置
     */
    public void rotate1(int[] nums, int k) {
        int[] res = new int[nums.length];
        int curr = 0;
        int begin = curr+k;

        while(curr<nums.length){
            res[begin%nums.length] = nums[curr++];
            begin++;
        }
        begin = 0;
        while(begin<nums.length){
            nums[begin] = res[begin++];
        }
    }

}
