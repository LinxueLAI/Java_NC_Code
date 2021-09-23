package NC_Codes;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class NC156_foundOnceNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int k = sc.nextInt();

        int result = foundOnceNumber(a,k);
        System.out.println(result);

    }

    private static int foundOnceNumber(int[] a, int k) {
        HashMap<Integer,Boolean> map = new HashMap<>();
        for (int i = 0; i <a.length ; i++) {
            if(map.containsKey(a[i]))
                map.put(a[i],true);
            else
                map.put(a[i],false);
        }

        Set<Integer> keys = map.keySet();
        for (int key:
                keys
             ) {
            if(map.get(key)==false)
                return key;
        }
        return -1;
    }
}
