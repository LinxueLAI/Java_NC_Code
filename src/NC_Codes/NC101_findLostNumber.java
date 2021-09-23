package NC_Codes;

import java.util.Scanner;

public class NC101_findLostNumber {
    // calculate the sum of 0 to n then minus the sum o f element values in the list.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findLostNUmber(a));
    }

    private static int findLostNUmber(int[] a) {
        int length = a.length;
        int sum = 0;
        while (length > 0) {
            sum += length;
            length--;
        }

        int real_s = 0;
        for(int value : a){
            real_s+=value;
        }


        return sum-real_s;
    }
}
