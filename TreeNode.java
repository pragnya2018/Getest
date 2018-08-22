package src.datastructure.tree;

public class TreeNode {
    private int key;
    private TreeNode left;
    private TreeNode right;
    public TreeNode(int value){
        this.key = value;
        left=right=null;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public int getKey() {
        return key;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
