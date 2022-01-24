package LeetCode_Tests;

import static LeetCode_Tests.Leetcode104_maxDepth.maxDepth;

public class Leetcode110_isBalanced {

    public void main(String[] args) {
        TreeNode root = new TreeNode();
        boolean res = isBalanced(root);
        System.out.println(res);
    }


    /*
    平衡二叉树需要满足两个条件：
    1）根节点的左右子树的高度差不大于1
    2）左右子树也是平衡二叉树
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        return Math.abs(maxDepth(root.left) - maxDepth(root.right)) <= 1 && isBalanced(root.left) && isBalanced(root.right);

    }

    public int maxDepth(TreeNode root) {
        return root == null ? 0 : Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

    int maxLevel = 0;

    public int maxDepth_dfs(TreeNode root) {
        if (root == null)
            return 0;

        dfs(root, 1);
        return maxLevel;
    }

    public void dfs(TreeNode root, int level) {
        if (root == null)
            return;

        maxLevel = Math.max(level, maxLevel);
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
