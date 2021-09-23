package NC_Codes;

import java.util.Scanner;

public class NC83_maxProduct {
    public static void main(String[] args) {
//[-2.5,4,0,3,0.5,8,-1]
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        float a[] = new float[n];
        for (int i = 0; i < n; i++) {
            a[n] = sc.nextFloat();
        }
        float result =  maxProduct(a);

    }

    private static float maxProduct(float[] a) {
//        float dp[][] = new float[][];
        return 0;
    }
}
