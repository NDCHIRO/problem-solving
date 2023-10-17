class Solution {
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
        int root = findRoot(n,leftChild, rightChild);
        if(root==-1)
            return false;
        Set<Integer> seen = new HashSet<Integer>();
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(root);
        seen.add(root);
        while(!stack.empty())
        {
            int node = stack.pop();
         int[] children = {leftChild[node], rightChild[node]};
            
            for (int child : children) {
                if (child != -1) {
                    if (seen.contains(child)) {
                        return false;
                    }
                    
                    stack.push(child);
                    seen.add(child);
                }
            }
            
        }
        
        return seen.size() == n;
    }
    
    int findRoot(int n, int[] leftChild, int[] rightChild)
    {
        Set<Integer> childern = new HashSet<>();
        for(int node:leftChild)
            childern.add(node);
        
        for(int node:rightChild)
            childern.add(node);
        
        for(int i=0;i<n;i++)
        {
            if(!childern.contains(i))
                return i;
        }
        return -1;
    }
}