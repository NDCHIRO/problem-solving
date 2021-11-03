#include <iostream>
#include <vector>
using namespace std;

class Solution {
    void dfs(int i,int j, vector<vector<int>>& grid, vector<vector<bool>>& visited ,int &result , int noOfCurrentZeros, int noOfAllZeros)
    {
        //
        int n=grid.size();
        int m = grid[0].size();
        visited[i][j]=1;
        if (grid[i][j] == 0)
            // update the count
            noOfCurrentZeros++;
        //if target found and all the possible zeros were visited 
        if(grid[i][j] == 2)
        {
            if(noOfCurrentZeros == noOfAllZeros)
                result++;
            visited[i][j] = 0;
            return;
        }
        //move top
        if( i>= 1 && !visited[i-1][j] && grid[i-1][j]!=-1)
            dfs(i-1 ,j ,grid, visited, result, noOfCurrentZeros, noOfAllZeros);
        
         // Down
         if (i < n - 1 && !visited[i + 1][j] && grid[i + 1][j] != -1)
            dfs(i + 1, j, grid, visited, result, noOfCurrentZeros, noOfAllZeros);
 
        // Left
        if (j >= 1 && !visited[i][j - 1] && grid[i][j - 1] != -1)
            dfs(i, j - 1, grid, visited, result, noOfCurrentZeros, noOfAllZeros);
 
        // Right
        if (j < m - 1 && !visited[i][j + 1] && grid[i][j + 1] != -1)
            dfs(i, j + 1, grid, visited, result, noOfCurrentZeros, noOfAllZeros);

        visited[i][j] = 0;

    }
    

public:
    int uniquePathsIII(vector<vector<int>>& grid) {
        int noOfCurrentZeros=0;
        int noOfAllZeros=0;
        int result=0;
        int m = grid.size();
        int n = grid[0].size();
        int startX;
        int startY;
        vector<vector<bool>> visited(m,vector<bool>(n,0));

        for(int i=0;i<m;i++)
        {
            for(int j= 0 ; j < n; j++)
                if(grid[i][j] == 0)
                    noOfAllZeros++;
                else if (grid[i][j] == 1)
                 {
                    startX=i;
                    startY=j;
                }
        }
        dfs(startX, startY, grid, visited, result, 0, noOfAllZeros);
        return result;
    }
};


int main()
{
  //for test
    vector<vector<int> > grid{ { 1, 0, 0, 0 },
                               { 0, 0, 0, 0 },
                               { 0, 0, 2, -1 } };
    
    Solution s;
    cout << s.uniquePathsIII(grid);
    return 0;
    return 1;
}

