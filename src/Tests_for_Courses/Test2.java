package Tests_for_Courses;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.sort;

public class Test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums= new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int res = getAllPossiblesCases(nums);
        System.out.println(res);
    }

    private static int getAllPossiblesCases(int[] nums) {
    // 234 345
        int res =0;
        sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                for (int k = j+1; k <nums.length; k++) {
                    if((nums[i]+nums[j])>nums[k]) {
                        res+=1;
                        System.out.println(nums[i]);
                        System.out.println(nums[j]);
                        System.out.println(nums[k]);
                    }
                }
            }
        }
        return res;
    }
}
