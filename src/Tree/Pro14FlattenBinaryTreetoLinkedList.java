package Tree;
// https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
public class Pro14FlattenBinaryTreetoLinkedList {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public void flatten(TreeNode root) {
        TreeNode current = root;

        while (current != null){
            if(current.left != null){
                TreeNode temp = current.left;
                while (temp != null){
                    temp = temp.right;
                }

                temp.right = current.right;
                current.right = current.left;
                current.left = null;
            }
            current = current.right;
        }
    }
}
