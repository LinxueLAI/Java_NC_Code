package NC_Codes;

import java.util.Scanner;

public class NC106_ProduitMaximal {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        long result = maxProduit(a);
        System.out.println(result);

    }

    private static long maxProduit(int[] a) {

        long first = Integer.MIN_VALUE,second = Integer.MIN_VALUE,third = Integer.MIN_VALUE;
        long min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min1) {//更新最小值
                min2 = min1;
                min1 = a[i];
            } else if (a[i] < min2) {//更新第二小
                min2 = a[i];
            }

            if (a[i] > third) {
                first = second;
                second = third;
                third = a[i];
            } else if (a[i] > second) {
                first = second;
                second = a[i];
            } else if (a[i] > first) {
                first = a[i];
            }
        }

        return Math.max((first * second * third), min1 * min2 * third);
    }
}
