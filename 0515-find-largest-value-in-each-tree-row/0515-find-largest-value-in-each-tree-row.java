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
    
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        
        if(root==null)
            return list;
        getLargestValues(root,list);
        return list;
    }
    
    public void getLargestValues(TreeNode curr, List<Integer> list)
    {
        if(curr == null)
            return;
        Queue<TreeNode> queue = new ArrayDeque<TreeNode>();
        queue.add(curr);
        while(!queue.isEmpty())
        {
            int qLength = queue.size();
            int curMax = Integer.MIN_VALUE;
            for(int i=0;i<qLength;i++)
            {
                TreeNode node = queue.remove();
                curMax=Math.max(curMax,node.val);
                if(node.left!=null)
                    queue.add(node.left);
                if(node.right!=null)
                    queue.add(node.right);
            }
            list.add(curMax); 
        }
    }
}