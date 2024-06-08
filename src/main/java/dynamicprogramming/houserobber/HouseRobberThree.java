package dynamicprogramming.houserobber;

public class HouseRobberThree {


    /*
    The thief has found himself a new place for his thievery again. There is only one entrance to this area, called root.

    Besides the root, each house has one and only one parent house. After a tour, the smart thief realized that all houses in this place form a binary tree.
    It will automatically contact the police if two directly-linked houses were broken into on the same night.

    Given the root of the binary tree, return the maximum amount of money the thief can rob without alerting the police.
    */

    public static void main(String[] args){

        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(9);
        TreeNode right = new TreeNode(2);
        root.left = left;
        root.right = right;
        left.left = new TreeNode(3);
        right.left = new TreeNode(8);
        right.right = new TreeNode(7);

       System.out.println(rob(root));


    }

    public static int rob(TreeNode root){
        int[] options = travel(root);
        return Math.max(options[0], options[1]);
    }

    public static int[] travel(TreeNode root){
        if (root == null){
            return new int[2];
        }

        int[] left_node_choices = travel(root.left);
        int[] right_node_choices = travel(root.right);
        int[] options = new int[2];

        options[0] = root.val + left_node_choices[1] + right_node_choices[1];

        options[1] = Math.max(left_node_choices[0],left_node_choices[1]) + Math.max(right_node_choices[0],right_node_choices[1]);

        return options;
    }
}
