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
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        return isRight(root,true);
    }
    
    public int isRight(TreeNode root,Boolean rightChild)
    {
        if(root == null)
            return sum;
        if(root.left ==null && root.right==null)
            if(rightChild)
                return sum;
            else return sum+root.val;
        return isRight(root.right,true) + isRight(root.left,false);
    }
}