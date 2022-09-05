class Solution {
public:
    
    int count = 0;
    
    int maxAreaOfIsland(vector<vector<int>>& grid) {
        int m = grid.size();
       vector<vector<bool>> visited(m,vector<bool>(grid[0].size(),0));
        int max =0;
        for(int i=0;i<grid.size();i++)
        {
           for(int j=0;j<grid[0].size();j++)
           {
                if(grid[i][j] == 1)
                {
                    count = 0;
                    max = std::max(DFS(grid,visited,i,j), max);
                }
           }
        }
        return max;
    }
    
    int DFS(vector<vector<int>>& grid, vector<vector<bool>>& visited ,int i , int j)
    {
        count++;
        visited[i][j] = true;
        
        if((i+1) < grid.size() && grid[i+1][j] == 1 && visited[i+1][j] == false)
            DFS(grid, visited , i+1 , j);
        
        if((i-1)>=0 && grid[i-1][j] == 1 && visited[i-1][j] == false)
            DFS(grid, visited , i-1 , j);
        
        if((j+1)<grid[0].size() && grid[i][j+1] == 1 && visited[i][j+1] == false)
            DFS(grid, visited , i , j+1);
        
        if((j-1)>= 0 && grid[i][j-1] == 1 && visited[i][j-1] == false)
            DFS(grid, visited , i , j-1);
        
        return count;
    }
};
