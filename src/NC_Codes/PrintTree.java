package NC_Codes;

import java.util.*;

public class PrintTree {
    public TreeNode root = null;

    public PrintTree(int[] arr, int index) {
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


    public ArrayList<Integer> BfsTree(TreeNode root){
        ArrayList<Integer> lists = new ArrayList<>();
        if(root==null) return lists;
        Queue<TreeNode> queue  = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            TreeNode tree = queue.poll();
            if(tree.left!=null)
                queue.offer(tree.left);
            if (tree.right!=null)
                queue.offer(tree.right);
            lists.add(tree.val);
        }
        return lists;
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

        ArrayList result = printZTree(binaryTree.root);

    }

    private static ArrayList<ArrayList<Integer>> printZTree(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        if (pRoot == null) return res;
        Stack<TreeNode> tmp1 = new Stack<>();
        Stack<TreeNode> tmp2 = new Stack<>();
        tmp1.add(pRoot);
        while (tmp1.size() > 0 || tmp2.size() > 0) {
            ArrayList<Integer> layer = new ArrayList<>();
            if (tmp1.size() > 0) {
                System.out.println("stack 1 is not empty");
                int size = tmp1.size();
                System.out.println("the size of stack 1 is " + size);
                for (int i = 0; i < size; i++) {
                    TreeNode pop = tmp1.pop();
                    layer.add(pop.val);
                    if (pop.left != null)
                        tmp2.add(pop.left);
                    if (pop.right != null)
                        tmp2.add(pop.right);
                }
                res.add(layer);
                continue;
            }

            if (tmp2.size() > 0) {
                System.out.println("stack 2 is not empty");
                int size = tmp2.size();
                System.out.println("the size of stack 2 is " + size);
                for (int i = 0; i < size; i++) {
                    TreeNode pop = tmp2.pop();
                    layer.add(pop.val);
                    if (pop.right != null)
                        tmp1.add(pop.right);
                    if (pop.left != null)
                        tmp1.add(pop.left);
                }
                res.add(layer);
                continue;
            }
        }
        return res;
    }
}
