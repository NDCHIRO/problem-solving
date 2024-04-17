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
    String smallestString = "";
    public String smallestFromLeaf(TreeNode root) {
        dfs(root,"");
        return smallestString;
    }
    
    public void dfs(TreeNode root, String cur)
    {
        if(root == null)
            return;
        cur = (char)('a'+root.val)+cur;
        if(root.left == null && root.right == null)
            if(smallestString.isEmpty() || smallestString.compareTo(cur) > 0 )
                smallestString = cur;
        
        if(root.left != null)
            dfs(root.left,cur);
        
        if(root.right != null)
            dfs(root.right,cur);
        
    }
}