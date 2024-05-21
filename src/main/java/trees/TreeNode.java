package trees;

public class TreeNode {
    private int val;
    private TreeNode left;
    private TreeNode right;

    public TreeNode(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }


    public static void main(String[] args){


        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        TreeNode leftNode = root.left;
        TreeNode rightNode = root.right;

        leftNode.left = new TreeNode(4);
        leftNode.right = new TreeNode(5);

        rightNode.left = new TreeNode(6);
        rightNode.right = new TreeNode(7);


        System.out.println("Root node -> "+root.val);

        System.out.println("last node -> "+rightNode.right.val);
    }
}
