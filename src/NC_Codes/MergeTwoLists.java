package NC_Codes;

public class MergeTwoLists {

    public static void main(String[] args) {

        int[] A = new int[2];
        A[0] = 2;
        int[] B = new int[1];
        B[0] = 1;
        merge(A,1,B,1);
    }

    public static void merge(int A[], int m, int B[], int n) {

        int last = m+n-1;
        int aPtr = m-1,bPtr = n-1;
        for (int ptr = last; aPtr>=0 && bPtr>=0; ptr--) {
            A[ptr] = A[aPtr]>B[bPtr]? A[aPtr--] :B[bPtr--];
        }
        while (bPtr>=0){
            A[bPtr] = B[bPtr--];
        }
    }

}
