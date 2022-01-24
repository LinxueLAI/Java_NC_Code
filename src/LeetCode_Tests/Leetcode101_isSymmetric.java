package LeetCode_Tests;

public class Leetcode101_isSymmetric {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        boolean res = isSymmetric1(root); // 递归的方法
        System.out.println(res);

        boolean res2 = isSymmetric(root); // 迭代的方法？？
        System.out.println(res2);
    }

    private static boolean isSymmetric(TreeNode root) {
        return false;
    }

    //对称二叉树
    private static boolean isSymmetric1(TreeNode root) {
        if (root == null)
            return true;

        return isSymmetricLeftRight(root.left, root.right);
    }

    //方法1： 递归方法
    private static boolean isSymmetricLeftRight(TreeNode left, TreeNode right) {
        if(left==null && right==null)
            return true;
        if(left == null || right ==null || left.val!= right.val)
            return false;

        return isSymmetricLeftRight(left.left,right.right) && isSymmetricLeftRight(left.right,right.left);
    }
}
