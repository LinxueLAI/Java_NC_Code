package NC_Codes;

import java.util.Scanner;

public class NC107_findPeak {
    // idea1  :  traverse from right to left, find the biggest index of the peak element
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(findPeak(a));
    }

    private static int findPeak(int[] a) {
        int n = a.length - 1;
        for (int i = n; i >= 0; i--) {
            if (i == n && a[i] >= a[i - 1] || i == 0 && a[i] >= a[i + 1]) {
                return i;
            } else if (a[i] >= a[i - 1] && a[i] >= a[i + 1])
                return i;

        }

        return -1;
    }
}
