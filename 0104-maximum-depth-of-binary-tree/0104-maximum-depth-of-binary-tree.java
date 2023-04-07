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
    int noOfNodes =0;
    public int maxDepth(TreeNode root) {
        return DFS(root);
    }
    
    public int DFS(TreeNode root)
    {
        if(root == null)
            return 0;
        int l = DFS(root.left);
        int r = DFS(root.right);
        return 1+ Math.max(l,r);
    }
}