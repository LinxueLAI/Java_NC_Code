package LeetCode_Tests;

public class Leetcode100_isSameTree {
    public void main(String[] args) {
        TreeNode root1 = new TreeNode();
        TreeNode root2 = new TreeNode();
        boolean res = isSameTree(root1,root2); // 递归的方法
        System.out.println(res);

    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null) return true;
        if(p==null || q==null || p.val!=q.val) return false;
        return isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
