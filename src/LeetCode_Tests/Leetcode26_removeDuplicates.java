package LeetCode_Tests;

public class Leetcode26_removeDuplicates {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3};
        int res = removeDuplicates(arr);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 2) return nums.length;
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
        }
        return index + 1;
    }
}
