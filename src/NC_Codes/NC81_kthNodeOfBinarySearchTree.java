package NC_Codes;


import java.util.ArrayList;

public class NC81_kthNodeOfBinarySearchTree {
    public ArrayList<TreeNode> list =  new ArrayList<>();
    public static void main(String[] args) {
//        kthNodeOfResearchTree()
//        System.out.println(kthNodeOfBinarySearchTree());
    }

    public TreeNode kthNodeOfBinarySearchTree(TreeNode pRoot, int k) {
        OrderTraversal(pRoot);
        if(k<1|| list.size()<k)
            return null;
        else return list.get(k-1);
    }

    private void OrderTraversal(TreeNode pRoot) {
        if(pRoot!=null){
            OrderTraversal(pRoot.left);
            list.add(pRoot);
            OrderTraversal(pRoot.right);
        }
    }
}
