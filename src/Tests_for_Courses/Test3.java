package Tests_for_Courses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nums = new int[N];
        String[] strNum = br.readLine().trim().split(" ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(strNum[i]);
        }
        int[] result = seqAfterN(nums);
        System.out.println(result);
    }

    private static int[] seqAfterN(int[] nums) {
        int n = nums.length;
        String b = String.valueOf(nums[0]);
        String b_new = "";
        int[] res = new int[n];
        for (int i = 1; i < n; i++) {
            b_new = b.concat(" "+String.valueOf(nums[i]));
            System.out.println(b_new.length());
            int[] b_tmp = new int[b.length()+1];
            String[] strNum = b_new.trim().split(" ");
            System.out.println(strNum.length);

            for (int j = b_tmp.length-1;j>=0;j--) {
                b_tmp[j] = Integer.parseInt(strNum[j]);
            }
            b = b_new;
            res = b_tmp;
        }


        return res;

    }
}
