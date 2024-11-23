class Solution {
    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        int count = 0;
        for(int i=0;i<isConnected.length;i++)
        {
            if(!visited[i])
            {
                count++;
                dfs(i, visited,isConnected);
            }
        }
        return count;
    }
    
    
    void dfs(int index, boolean[] visited, int[][] isConnected)
    {
        visited[index] = true;
        for(int i=0;i<isConnected.length;i++)
        {
            if(isConnected[index][i] == 1 && !visited[i])
                dfs(i, visited,isConnected);
        }
    }
}