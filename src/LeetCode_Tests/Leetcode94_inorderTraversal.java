package LeetCode_Tests;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Leetcode94_inorderTraversal {

    public static void main(String[] args) {


        TreeNode root = new TreeNode();
        //如何建立一个树？

        List<Integer> res = inorderTraversal(root);
    }

    // 基于栈的中序遍历， 非递归方法， 性能更优。
    /*
    这里在Leetcode的测试环境下，我们使用ArrayList的代码运行结果显示性能要优于LinkedList，可以思考一下为什么。
     */
    private static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();//arrayList 和LinkedList的区别？使用ArrayList要比使用LinkedList性能更优。
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (cur != null || !stack.isEmpty()){
            if(cur!=null){ // [1,null,2,3]
                stack.push(cur); //push 1
                cur = cur.left; // cur = null; 无left
            }
            else {
                cur = stack.pop(); //pop left -> cur = root
                res.add(cur.val); //加入到list中
                cur = cur.right; // 遍历root的右子树
            }
        }
        return res;
    }


    // 递归法和非递归法？
    List<Integer> res = new LinkedList<>();

    private List<Integer> inorderTraversal1(TreeNode root) {

        if (root == null) return res;
        else {
            inorderTraversal1(root.left);
            res.add(root.val);
            inorderTraversal1(root.right);
            return res;
        }

    }
}
