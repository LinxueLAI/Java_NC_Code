package Java_fromZeroToExpert;

import java.util.Arrays;

public class Chapter6_Array {
    public static void main(String[] args) {
        /*
        Arrays 类的使用
         */
        // 填充替换数组元素
        int arr[] = new int[5];
        Arrays.fill(arr, 8);
        Arrays.fill(arr, 1, 3, 5);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the " + i + "th number is:" + arr[i]);
        }

        // 数组的排序算法：
        Arrays.sort(arr);
        System.out.println("After sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("the " + i + "th number is:" + arr[i]);
        }

        // 复制数组
        System.out.println("Copy to new array:");
        int newArray[] = Arrays.copyOf(arr, 4);
        for (int i = 0; i < newArray.length; i++) {
            System.out.println("the " + i + "th number is:" + newArray[i]);
        }
        System.out.println("Copy to the second new array:");
        int newArray2[] = Arrays.copyOfRange(arr, 2, 5);
        for (int i = 0; i < newArray2.length; i++) {
            System.out.println("the " + i + "th number is:" + newArray2[i]);
        }

        /*
        排序算法 : 1 - 3 为初级排序 4 - 6 为高级排序
         */
        int arrayInitial[] = {63, 4, 24, 1, 3, 15};
        // 1.冒泡排序
        System.out.print("冒泡排序：");
        BubbleSort(arrayInitial);
        for (int value : arrayInitial
        ) {
            System.out.print(value + " ");

        }
        System.out.println();
        // 2.直接选择排序
        System.out.print("直接选择排序：");
        int arrayInitial2[] = {63, 4, 24, 1, 3, 15};
        SelectSort(arrayInitial2);
        for (int value : arrayInitial2
        ) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 3. 插入排序
        System.out.print("插入排序：");
        int arrayInitial3[] = {63, 4, 24, 1, 3, 15};
        InsertSort(arrayInitial3);
        for (int value : arrayInitial3
        ) {
            System.out.print(value + " ");
        }
        System.out.println();


        // 4.归并排序
        System.out.println("归并排序：");
        int arrayInitial4[] = {63, 4, 24, 1, 3, 15};

        MergeSort(arrayInitial4);
        for (int value : arrayInitial4
        ) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 5.快速排序
        /*
        快速排序可以理解为归并排序的一种反义。归并排序是先将数组按照无序的方式二分，然后在递归到底的时候再进行排序合成。
        快排是先取出数组的一个元素（比如第一个）按照这个元素进行对数组的切分--将比这个元素小的放在左边，比其大的放在右边。
        我们以开始的元素作为切分元素举例：
        在开始的元素下一个元素处放置一个索引i，在该数组末尾放置一个索引j。让i递增，如果遇到一个比切分元素大的元素则停止；
        让 j递减，如果遇到一个比切分元素小的元素则停止。交换i和j索引指示的元素内容，继续重复上一步操作，直到j在i的左边。
        这个时候，交换切分元素和j索引指向的元素。这个切分点是j，将j之前的子数组调用该方法递归下去，j之后的也调用该方法递归。

         */
        System.out.println("快速排序：");
        int arrayInitial5[] = {63, 4, 24, 1, 3, 15};

        for (int value : arrayInitial5
        ) {
            System.out.print(value + " ");
        }
        System.out.println("");
        QuickSort(arrayInitial5);
        for (int value : arrayInitial5
        ) {
            System.out.print(value + " ");
        }
        System.out.println();

        // 堆排序
        /*
        什么是堆 - heap ？
        堆是用数组实现的二叉树，所以它没有父指针或者子指针。
        堆根据”堆属性"来排序，这决定了树中节点的位置

        常用方法：
        1) 构建优先序列
        2)支持堆排序
        3) 快速找出一个集合中的最小值或者最大值

         */
        System.out.println("堆排序：");
        int arrayInitial6[] = {63, 4, 24, 1, 3, 15};

        HeapSort(arrayInitial6);
        for (int value : arrayInitial6
        ) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private static void HeapSort(int[] arrayInitial6) {
        arrayInitial6 = buildMaxHeap(arrayInitial6);//初始建堆，array[0]为第一趟最大的元素

        for (int i = arrayInitial6.length - 1; i >= 1; i--) {
            //将堆顶元素和堆底元素交换，即得到当前最大元素正确的排序位置
            swap(arrayInitial6, 0, i);
            //整理，将剩余元素整理为大顶堆
            adjustHeap2(arrayInitial6, 0, i);
        }
    }

    // 自下而上构建大顶堆，将array看成完全二叉树的顺序存储结构
    private static int[] buildMaxHeap(int[] arrayInitial6) {
        // 从最后一个节点array.length-1 的父节点 (array.length-1-1) /2 开始，直到根节点0，反复调整
        for (int i = (arrayInitial6.length - 2) / 2; i >= 0; i--) {
            adjustHeap2(arrayInitial6, i, arrayInitial6.length);
        }
        return arrayInitial6;

    }

    // 自上而下调整大顶堆 （非递归）
    private static void adjustHeap(int[] arrayInitial6, int k, int length) {
        int tmp = arrayInitial6[k]; // 堆顶节点
        for (int i = 2 * k + 1; i <= length - 1; i = 2 * i + 1) {
            //i 为初始化为节点K的左孩子 沿着节点较大的子节点进行调整
            if (i + 1 < length && arrayInitial6[i] < arrayInitial6[i + 1])// 如果左孩子小于右孩子
                i++;//向右孩子方向调整
            if (tmp > arrayInitial6[i]) //对比堆顶和左右孩子中的较大者
                break;
            else {
                arrayInitial6[k] = arrayInitial6[i];// 堆顶赋值为较大者
                k = i; // 修改k值，以便继续向下调整
            }

            arrayInitial6[k] = tmp;
        }
    }

    // 自上而下调整大顶堆 （递归）
    private static void adjustHeap2(int[] arrayInitial6, int k, int length) {
        int k_child = 2 * k + 1;
        if (k_child < length - 1 && arrayInitial6[k_child] < arrayInitial6[k_child + 1])
            k_child++;
        if (k_child > length - 1 || arrayInitial6[k] >= arrayInitial6[k_child])
            return;
        else {
            swap(arrayInitial6, k, k_child);
            adjustHeap2(arrayInitial6, k_child, length);
        }
    }

    private static void QuickSort(int[] arrayInitial5) {
        if (arrayInitial5 == null)
            return;
        quickSort(arrayInitial5, 0, arrayInitial5.length - 1);
    }

    private static void quickSort(int[] arrayInitial5, int low, int high) {
        if (low >= high)
            return;
        int i = low, j = high;
        int pivot = arrayInitial5[i];

        while (i < j) {
            while (arrayInitial5[j] >= pivot && i < j) // 从右到左遍历，直到找到第一个小于pivot的位置
                j--;
            while (arrayInitial5[i] <= pivot && i < j) // 从左到右遍历，直到找到第一个大于pivot的位置
                i++;
            //交换
            swap(arrayInitial5, i, j);
        }
        swap(arrayInitial5, low, j);
        for (int elm: arrayInitial5
             ) {
            System.out.print(elm+" ");
        }
        System.out.println(" ");
        quickSort(arrayInitial5, low, j - 1);
        quickSort(arrayInitial5, j + 1, high);
    }

    private static void MergeSort(int[] arrayInitial4) {
        if (arrayInitial4 == null)
            return;
        mergeSort(arrayInitial4, 0, arrayInitial4.length - 1);
    }

    private static void mergeSort(int[] arrayInitial4, int start, int end) {
        if (start >= end)
            return;

        // 找中间索引
        int mid = start + (end - start >> 1);
        mergeSort(arrayInitial4, start, mid);
        mergeSort(arrayInitial4, mid + 1, end);

        merge(arrayInitial4, start, mid, end);
    }

    private static void merge(int[] arrayInitial4, int start, int mid, int end) {
        System.out.println("length =" + arrayInitial4.length);
        int[] arrayTmp = new int[arrayInitial4.length];// 额外空间用了O（N）

        int start1 = start, start2 = mid + 1;
        int tmp = start1;
        int begin = start1;
        while (start1 <= mid && start2 <= end) {
            if (arrayInitial4[start1] < arrayInitial4[start2])
                arrayTmp[tmp++] = arrayInitial4[start1++];
            else
                arrayTmp[tmp++] = arrayInitial4[start2++];
        }

        while (start1 <= mid) {
            arrayTmp[tmp++] = arrayInitial4[start1++];
        }
        while (start2 <= end) {
            arrayTmp[tmp++] = arrayInitial4[start2++];
        }
        while (begin <= end) {
            arrayInitial4[begin] = arrayTmp[begin];
            begin++;
        }
    }

    private static void InsertSort(int[] arrayInitial3) {
        int length = arrayInitial3.length;
        ;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (arrayInitial3[j] < arrayInitial3[j - 1]) {
                    int tmp = arrayInitial3[j];
                    arrayInitial3[j] = arrayInitial3[j - 1];
                    arrayInitial3[j - 1] = tmp;
                }
            }
        }
    }

    private static void SelectSort(int[] arrayInitial2) {

        // 区别于冒泡排序， 不是交换相邻的元素，而是把满足条件的元素与指定元素交换
        for (int i = 1; i < arrayInitial2.length; i++) {
            int index = 0;
            for (int j = 0; j <= arrayInitial2.length - i; j++) {
                if (arrayInitial2[j] > arrayInitial2[index])
                    index = j;
            }
            int temp = arrayInitial2[arrayInitial2.length - i];
            arrayInitial2[arrayInitial2.length - i] = arrayInitial2[index];
            arrayInitial2[index] = temp;
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    private static void BubbleSort(int[] arrayInitial) {
        // 比较相邻的两个数，大的往后冒泡，该算法复杂度为 O(N^2)
        for (int i = 1; i < arrayInitial.length; i++) {
            //比较相邻的两个数，较大的往后面冒泡
            for (int j = 0; j < arrayInitial.length - i; j++) {
                if (arrayInitial[j] > arrayInitial[j + 1]) {
                    int temp = arrayInitial[j];
                    arrayInitial[j] = arrayInitial[j + 1];
                    arrayInitial[j + 1] = temp;
                }
            }
        }
    }
}
