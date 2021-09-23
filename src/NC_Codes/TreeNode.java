package NC_Codes;

public class TreeNode {
    public int val;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        super();
        this.val = val;
    }

    @Override
    public String toString() {
        return val + " ";
    }

}