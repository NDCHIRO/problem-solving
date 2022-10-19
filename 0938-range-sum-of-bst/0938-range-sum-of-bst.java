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
    public int rangeSumBST(TreeNode root, int low, int high) {
           scanTree(root,low,high);
        return  sum;
    }
    public void scanTree(TreeNode root,int low,int high)
    {
        if(root==null)
            return;
        if(root.val<=high && root.val>=low)
            sum+=root.val;
        scanTree(root.left,low,high);
        scanTree(root.right,low,high);
    }
}