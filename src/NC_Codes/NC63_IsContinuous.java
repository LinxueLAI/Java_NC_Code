package NC_Codes;

import java.util.Scanner;

public class NC63_IsContinuous {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b[] = new int[n];
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextInt();
        }
        boolean result = isContinuous(b);

        System.out.println(result);
    }

    private static boolean isContinuous(int[] b) {
        int arr[] = new int[14];
        int max = b[0], min = 14;

        for (int value : b) {
            arr[value]++;
            max = Math.max(max, value);
            if (value > 0) {
                if (arr[value] > 1) return false;
                min = Math.min(min, value);
            }
        }

        System.out.println("max = " + max);
        System.out.println("min = " + min);
        if (arr[0] == 4) return true;
        if (arr[0] > 4) return false;
        if (max - min <= 4) return true;
        return false;
    }
}
