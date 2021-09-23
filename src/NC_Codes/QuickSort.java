package NC_Codes;

import java.util.Scanner;

public class QuickSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        quickSort(arr);

        System.out.println("result :");
        for (int value : arr
        ) {
            System.out.print(value+" ");
        }
    }

    private static void quickSort(int[] arr) {
        middle_swap(arr, 0, arr.length - 1);
    }

    int index = 0;
    private static void middle_swap(int[] arr, int low, int high) {
        int i = low, j = high;
        if (i >= j)
            return;
        int pivot = arr[i]; // take the first elm as the pivot
        while (i < j) {
            // traverse from right to left, find the first elm which is smaller then pivot
            while (arr[j] >= pivot && i < j) {
                j--;
            }
            // traverse from left to right, find the first elm which is bigger then pivot
            while (arr[i] <= pivot && i < j) {
                i++;
            }
            // swap them
            swap(arr, i, j);
        }

        swap(arr, low, i);
        for (int value : arr
        ) {
            System.out.print(value+" ");
        }
        System.out.println();
        middle_swap(arr, low, j - 1);
        middle_swap(arr, j + 1, high);
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
