package NC_Codes;

import java.util.HashMap;
import java.util.Scanner;

public class NC61_twoSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int target = sc.nextInt();
        System.out.println(twoSum(a,target)[0]+","+twoSum(a,target)[1]);

    }

    private static int[] twoSum(int[] a, int target) {
        int res[] = new int[2];
        HashMap<Integer,Integer> map =new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            if(map.containsKey(a[i])){
                res[0] = Math.min(map.get(a[i]),i+1);
                res[1] = Math.max(map.get(a[i]),i+1);
                System.out.println(res[0]+","+res[1]);
            }
            else {
                map.put(target - a[i],i+1);
            }
        }
        System.out.println(res[0]+","+res[1]);
        return res;
    }
}
