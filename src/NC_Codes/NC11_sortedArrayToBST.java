package NC_Codes;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class NC11_sortedArrayToBST {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        PrintTree binaryTree = new PrintTree(a, 0);

        System.out.println(binaryTree.BfsTree(binaryTree.root));
        TreeNode result = sortedArrayToBST(a);
        System.out.println(binaryTree.BfsTree(result));


    }


    private static TreeNode sortedArrayToBST(int[] a) {
        if (a.length == 0) return null;
        if (a.length == 1) {
            TreeNode treeNode = null;
            treeNode = new TreeNode(0);
            return treeNode;
        }
        if (a.length == 2) {
            TreeNode treeNode = null;
            treeNode = new TreeNode(a[1]);
            TreeNode left = new TreeNode(a[0]);
            treeNode.left = left;
            return treeNode;
        }
        return createBST(a, 0, a.length - 1);
    }

    // -1, 0, 1 , 2
    /*
    1. begin  = 0 , end = 3, mid  = 1

     */
    private static TreeNode createBST(int[] a, int begin, int end) {
        TreeNode treeNode = null;
        int mid = (begin + end + 1) / 2;
        treeNode = new TreeNode(a[mid]);
        if (begin != mid) {
            treeNode.left = createBST(a, begin, mid - 1);
        }
        if (end != mid) {
            treeNode.right = createBST(a, mid + 1, end);

        }
        return treeNode;
    }
}
