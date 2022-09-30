/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    List<Integer> res=new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        printInorder(root);
        return res;
    }
    
    void printInorder(TreeNode root)
    {
        if(root==null)
            return;
        printInorder(root.left);
        res.add(root.val);
        printInorder(root.right);
    }
}