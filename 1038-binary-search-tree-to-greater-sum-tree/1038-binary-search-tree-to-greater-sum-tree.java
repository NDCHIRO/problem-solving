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
    public TreeNode bstToGst(TreeNode root) {
        
        sumTree(root);
        return root;
    }
    
    public int sumTree(TreeNode cur)
    {
        if(cur==null)
            return 0;
        sumTree(cur.right);
        int temp = cur.val;
        cur.val += sum;
        sum += temp;
        sumTree(cur.left);
        return sum;
        
    }
}