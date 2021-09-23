package NC_Codes;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Scanner;

public class NC72_Mirror {
    public TreeNode root = null;

    public NC72_Mirror(int[] arr, int index) {
        root = createBinaryTree(arr, index);
    }

    private TreeNode createBinaryTree(int[] arr, int index) {

        TreeNode treeNode = null;
        if (index < arr.length) {
            treeNode = new TreeNode(arr[index]);
            treeNode.left = createBinaryTree(arr, 2 * index + 1);
            treeNode.right = createBinaryTree(arr, 2 * index + 2);
        }
        return treeNode;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        // create binary Tree
        PrintTree binaryTree = new PrintTree(a, 0);
        // print "z"

        System.out.println(binaryTree.root.toString());
        TreeNode result = mirror(binaryTree.root);
        System.out.println(result.toString());

    }

    private static TreeNode mirror(TreeNode root) {
        if (root==null) return root;
        else {

            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            mirror(root.left);
            mirror(root.right);
            return root;
        }
    }
}
