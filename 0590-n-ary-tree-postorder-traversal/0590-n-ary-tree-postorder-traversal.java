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
    public List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if(root == null)
            return res;
        postorderHelper(res , root);
        return res;
    }
    
    void postorderHelper(List<Integer> res , Node cur)
    {
        if(cur == null)
            return;
        
        for(Node child : cur.children)
            postorderHelper(res, child);
        
        res.add(cur.val);
    }
}