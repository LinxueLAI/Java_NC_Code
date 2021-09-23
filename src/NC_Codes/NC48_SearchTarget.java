package NC_Codes;

import java.util.Scanner;

public class NC48_SearchTarget {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int result = searchK(a, target);
        System.out.println(result);
    }

    private static int searchK(int[] a, int target) {
        int length = a.length;
        if (length == 1 && a[0] != target) return -1;
        if (length == 2) {
            if (a[0] == target) return 0;
            else if (a[1] == target) return 1;
            else return -1;
        }

        int left = 0;
        int right = length - 1;

        while (left < right - 1) {
            if (a[left] == target) return left;
            if (a[right] == target) return right;
            int mid = (left + right) / 2;
            if (a[mid] == target)
                return mid;
            else if (a[mid] > target)
                right = mid;
            else
                left = mid;
        }
        return a[left] == target ? left : -1;
    }
}
