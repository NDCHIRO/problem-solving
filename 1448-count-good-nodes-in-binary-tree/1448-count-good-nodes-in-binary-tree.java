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
    int count = 1;
    public int goodNodes(TreeNode root) {
        if(root == null)
            return 0;
        
        return countPaths(root,root.val);
    }
    
    private int countPaths(TreeNode node,int maxSoFar) {
        if (node == null) {
            return 0;
        }

        int count = 0;

        // If the current node's value matches the remaining target sum, we found a path
        if (node.val >= maxSoFar) {
            count++;
        }
        int newMax = Math.max(node.val ,maxSoFar);

        // Continue the path with the left and right child
        count += countPaths(node.left, Math.max(node.val ,newMax ));
        count += countPaths(node.right, Math.max(node.val ,newMax ));

        return count;
    }
}
