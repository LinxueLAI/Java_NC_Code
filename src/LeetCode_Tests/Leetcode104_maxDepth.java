package LeetCode_Tests;

import com.sun.source.tree.Tree;

import java.util.Deque;
import java.util.LinkedList;

public class Leetcode104_maxDepth {

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        int res = maxDepth(root); // 递归的方法
        System.out.println(res);

    }

    /*
    使用了递归的方法，时间效率很高，但是空间占用比较大
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.3 MB, 在所有 Java 提交中击败了51.47%的用户
     */
    public static int maxDepth(TreeNode root) {
        return root == null ? 0 : 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }

    /*
    method2: BFS广度优先遍历，使用双端队列deque（性能比较高）。遍历每一层
     执行用时：1 ms, 在所有 Java 提交中击败了20.64%的用户
    内存消耗：38.1 MB, 在所有 Java 提交中击败了89.74%的用户
     */

    public static int maxDepth_BFS(TreeNode root) {
        if (root == null)
            return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        /*
        deque用来储存每一层的节点，大循环取某一层的节点数量，子循环遍历这些父节点，从队列中删除它们自己
        并且将他们的孩子节点加入队列中（如果孩子节点存在）
         */
        int level = 0;
        deque.add(root);// 首先加入root， deque的大小=1
        while (!deque.isEmpty()) {
            int size = deque.size();
            level++; //层数加一
            for (int i = 0; i < size; i++) {
                TreeNode node = deque.remove();//逐一删除某一层的每个Node
                if (node.left != null) deque.add(node.left);
                if (node.right != null) deque.add(node.right);
            }
        }
        return level;
    }


    /*
    method3:DFS - 深度优先搜索，利用递归的栈，借助level标记当前层，由于每个节点只访问一次，所以时间复杂度是O（n)
    执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
    内存消耗：38.2 MB, 在所有 Java 提交中击败了66.04%的用户
     */
    int maxLevel = 0;

    public int maxDepth_DFS(TreeNode root) {
        if (root == null)
            return 0;
        dfs(root, 1);
        return maxLevel;

    }

    private void dfs(TreeNode root, int level) {
        if (root == null)
            return;
        if (level > maxLevel) maxLevel = level;
        dfs(root.left, level + 1);
        dfs(root.right, level + 1);
    }
}
