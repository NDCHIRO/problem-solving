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
    int maxLevel;
    public int deepestLeavesSum(TreeNode root) {
        if(root == null)
            return 0;
        calculateDepth(0,root);
        return sum;
    }
    
    public void calculateDepth(int currentLevel ,TreeNode root )
    {
        if(root == null)
            return;
        if(currentLevel > maxLevel)
        {
            maxLevel = currentLevel;
            sum=0;
        }
        
        if(currentLevel == maxLevel)
            sum+=root.val;
    calculateDepth(currentLevel+1,root.left);
    calculateDepth(currentLevel+1,root.right);
    }
}