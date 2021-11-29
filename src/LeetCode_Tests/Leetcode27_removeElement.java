package LeetCode_Tests;

public class Leetcode27_removeElement {
    public static void main(String[] args) {

        int[] arr = {0, 0, 0, 1, 1, 2, 2, 3, 3, 3};
        int val = 3;
        int res = removeElement(arr,val);

        System.out.println(res);
    }

    private static int removeElement(int[] nums,int val) {
        if(nums==null) return 0;

        int index = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]!=val){
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}
