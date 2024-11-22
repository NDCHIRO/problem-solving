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
    List<Integer> list;
    List<Integer> list2;
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        list = new ArrayList<>();
        getLeafs(root1,list);
        list2 = new ArrayList<>();
        getLeafs(root2,list2);
        if(list.size() != list2.size())
            return false;
        for(int i=0;i<list.size();i++)
        {
            if(! list.get(i).equals(list2.get(i)))
            {
                return false;
            }
        }
        return true;
    }
    void getLeafs(TreeNode root, List<Integer> list)
    {
        if(root==null)
            return;
        if(root.left == null && root.right == null)
            list.add(root.val);
        getLeafs(root.left,list);
        getLeafs(root.right,list);
    }
}