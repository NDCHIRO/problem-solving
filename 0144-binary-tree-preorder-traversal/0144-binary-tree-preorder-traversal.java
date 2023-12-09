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
    List<Integer>  list;
    public List<Integer> preorderTraversal(TreeNode root) {
        
     list = new ArrayList<Integer>();
        DFS(root);
        return list;
    }
    
    private void DFS(TreeNode curr)
    {
        if(curr == null)
            return;
        list.add(curr.val);
        DFS(curr.left);
        DFS(curr.right);
       
        
        
    }
}