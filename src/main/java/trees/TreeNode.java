package trees;

import java.util.LinkedList;
import java.util.Queue;

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



        System.out.println("In order traversal");
        inOrderTraversal(root);

        System.out.println("\nPre order traversal");
        preOrderTraversal(root);

        System.out.println("\nPost order traversal");
        postOrderTraversal(root);

        System.out.println("\n Level order traversal");
        levelOrderTraversal(root);
    }

    public static void inOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }

        inOrderTraversal(root.left);
        System.out.print(root.val+" -> ");
        inOrderTraversal(root.right);
    }

    public static void preOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }

        System.out.print(root.val+" -> ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    public static void postOrderTraversal(TreeNode root){
        if (root == null){
            return;
        }

        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" -> ");
    }


    public static void levelOrderTraversal(TreeNode root){
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        treeNodeQueue.add(root);

        while (!treeNodeQueue.isEmpty()){
            TreeNode treeNode = treeNodeQueue.poll();

            System.out.print(treeNode.val+" -> ");

            if (treeNode.left != null){
                treeNodeQueue.add(treeNode.left);
            }

            if (treeNode.right != null){
                treeNodeQueue.add(treeNode.right);
            }
        }
    }
}
