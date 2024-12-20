package Problems;
// https://leetcode.com/problems/insert-into-a-binary-search-tree/
public class InsertintoaBinarySearchTree {
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
    public TreeNode insertIntoBST(TreeNode node, int value) {
        if(node == null){
            node = new TreeNode(value);
            return node;
        }

        if(value < node.val){
            node.left = insertIntoBST(node.left,value);
        }
        if(value > node.val){
            node.right = insertIntoBST(node.right,value);
        }

        return node;
    }
}
