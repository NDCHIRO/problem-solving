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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        DFS(res, root);
        return res;
        
    }
    
    void DFS(List<Integer> res, TreeNode cur)
    {
        if(cur == null)
            return;
        DFS(res,cur.left);
        DFS(res,cur.right);
        res.add(cur.val);
    }
}