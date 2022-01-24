package LeetCode_Tests;

public class Leetcode112_hasPathSum {
    public static void main(String[] args) {

    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;

        if (root.left == null && root.right == null)// 判断是不是叶子节点
            return targetSum == root.val;

        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }

    boolean ans = false;
    public boolean hasPathSum2(TreeNode root, int targetSum) {
        if(root==null)
            return false;
        dfs(root,targetSum);
        return ans;
    }
    private void dfs(TreeNode root, int sum){
        if(root==null)
            return;
        if(root.left ==null && root.right ==null)
            if(sum == root.val)
                ans = true;
        dfs(root.left, sum - root.val);
        dfs(root.right,sum -  root.val);
    }

}
