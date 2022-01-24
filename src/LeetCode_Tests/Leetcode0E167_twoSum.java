package LeetCode_Tests;

import java.util.HashMap;

public class Leetcode0E167_twoSum {
    public static void main(String[] args) {

    }

    /*
    法一：用HashMap
     */
    public int[] twoSum(int[] numbers, int target) {

        HashMap<Integer,Integer> map = new HashMap<>();
        int index = 0;
        int[] res = new int[2];
        while(index<numbers.length){
            if(map.containsKey(numbers[index])){
                res[0] = map.get(numbers[index]);
                res[1] = index+1;
            }
            else {
                map.put(target - numbers[index],index+1);
            }
            index++;
        }
        return  res;
    }

    /*
    法二：用双指针
     */
    public int[] twoSum2(int[] numbers, int target) {
        for(int i= 0,j = numbers.length -1; i<j;){
            int sum = numbers[i]+numbers[j];
            if(sum == target) return new int[]{i+1,j+1};
            else if(sum>target) j--;
            else i++;
        }
        return null;
    }
}
