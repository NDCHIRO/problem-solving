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
    public boolean isBalanced(TreeNode root) {
        if(root==null)
            return true;
        if(height(root) == -1)
            return false;
        return true;
    }
    int height(TreeNode cur)
    {
        if(cur == null)
            return 0;
        int left = height(cur.left);
        int right = height(cur.right);
        
        if(left == -1 || right == -1) return -1;
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
    /* boolean checkBalance(TreeNode root,int count) {
         if(root==null)
             return true;
         if(count>1)
             return false;
        if(root.left==null && root.right==null)
            return true;
         if(root.left!=null && root.right==null)
            return checkBalance(root.left,count++);
        if(root.left==null && root.right!=null)
            return checkBalance(root.right,count++);
         return checkBalance(root.left,count) && checkBalance(root.right,count);
    }*/
}