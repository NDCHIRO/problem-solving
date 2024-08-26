/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

class Solution {
    public List<Integer> preorder(Node root) {
    List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        preorderHelper(res , root);
        return res;
    }
    
    void preorderHelper(List<Integer> res , Node cur)
    {
        if(cur == null)
            return;
        
        res.add(cur.val);
        
        for(Node child : cur.children)
            preorderHelper(res, child);

    }
}