package src.datastructure.tree;

public class BinaryTree {
    TreeNode root;
    BinaryTree() {
        root = null;
    }
    public boolean findElement(TreeNode rootnode, int element){
        if(rootnode!=null) {
            if (rootnode.getKey()== element)
                return true;
            else
                return (findElement(rootnode.getLeft(),element) || findElement(rootnode.getRight(),element));
        }
        return false;
    }

     public static void main(String args[]) {
        BinaryTree tree = new BinaryTree();
        tree.root = new TreeNode(2);
        tree.root.setLeft(new TreeNode(7));
        tree.root.setRight(new TreeNode(5));
        tree.root.getLeft().setLeft(new TreeNode(2));
        tree.root.getLeft().setRight(new TreeNode(6));
        tree.root.getLeft().getRight().setLeft(new TreeNode(5));
         tree.root.getLeft().getRight().setRight(new TreeNode(11));
         tree.root.getRight().setRight(new TreeNode(5));
         tree.root.getRight().setRight(new TreeNode(9));
         tree.root.getRight().getRight().setLeft(new TreeNode(4));
         System.out.println(tree.findElement(tree.root,7));

     }

}

