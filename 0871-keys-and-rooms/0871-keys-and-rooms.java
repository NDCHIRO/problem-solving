class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {   
        boolean[] visited = new boolean[rooms.size()];
        int count = 0;
        dfs(0, visited,rooms);
        
        for(int i=0;i<rooms.size();i++)
            if(visited[i] != true)
                return false;
        
        return true;

    }
    
    
    void dfs(int room, boolean[] visited, List<List<Integer>> rooms)
    {
        if (visited[room]) return; 
        visited[room] = true;
        for (int key : rooms.get(room)) 
            dfs(key, visited, rooms);
    }
}