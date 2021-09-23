package NC_Codes;

import java.util.HashMap;
import java.util.Scanner;

public class NC73_MoreThanHalfNum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int result = moreThanHalfNum(a);
        System.out.println(result);


    }

    private static int moreThanHalfNum(int[] a) {
        int length = a.length;
        if(length==1) return a[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int value : a
        ) {
            if (!map.containsKey(value))
                map.put(value, 1);
            else {
                int frequency = map.get(value) + 1;
                map.replace(value, frequency);
                if (frequency * 2 > length)
                    return value;
            }
        }
        return -1;
    }
}
