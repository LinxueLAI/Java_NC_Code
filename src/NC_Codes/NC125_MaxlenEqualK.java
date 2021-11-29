package NC_Codes;

import java.util.HashMap;
import java.util.Scanner;

public class NC125_MaxlenEqualK {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();
//        int result = maxlenEqualK(a, k);
        int result = maxlenEqualK2(a, k);
        System.out.println(result);
    }
    private static int maxlenEqualK2(int[] a, int k) {
        if (a.length == 0) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int len = a.length;
        int preArray[] = new int[len + 1];
        preArray[0] = 0;
        for (int i = 1; i <= len; i++) {
            preArray[i] = preArray[i - 1] + a[i - 1];
            if (!map.containsKey(preArray[i]))
                map.put(preArray[i], i);
        }

        int res = 0;
        for (int i = len; i >= 0; i--) {
            int target = preArray[i] - k;
            if (map.containsKey(target)) {
                res = Math.max(Math.max(res, i - map.get(target)),Math.max(res, i - map.get(target)) -i);
            }
        }
        return res;
    }

    //运行超时
    private static int maxlenEqualK(int[] a, int k) {
        int len = 0;
        for (int i = 0; i < a.length; i++) {
            int curr = a[i];
            int tmp_len = 0;
            for (int j = i + 1; j < a.length - len; j++) {
                curr += a[j];
                tmp_len += 1;
                if (curr == k) {
                    len = Math.max(len, tmp_len);
                }

            }
        }
        return len;
    }
}
