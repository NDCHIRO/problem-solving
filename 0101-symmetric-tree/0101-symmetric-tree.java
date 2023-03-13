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
    public boolean isSymmetric(TreeNode root) {
        if(root == null)
            return true;
        return checkSymmetric(root.left,root.right);
    }
    boolean checkSymmetric(TreeNode left , TreeNode right)
    {
        if(left == null || right == null)
            return left==right;
        else
        {
            if(left.val == right.val)
                return checkSymmetric(left.left, right.right) 
                && checkSymmetric(left.right, right.left);
            else
                return false;
        }
    }
}