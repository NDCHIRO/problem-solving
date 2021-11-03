#include <iostream>
#include <vector>
using namespace std;
class Solution {

    void dfs(int i, int j , vector<vector<int>>& grid , vector<vector<bool>>& visited ,int &ans, int noOfZeros,int noOfAllZeros, int m , int n)
    {
        
        //mark the current cell as visited
        visited[i][j] = 1;
        //if current cell is not obsticale add 1 
        if(grid[i][j]==0)
            noOfZeros++;
        //check if it's the ending cell 
        if( grid[i][j] == 2)
        {
            //check if the current no of zeros is equal to the total no of zeros so 
            //that means all cells were visited 
            if(noOfZeros == noOfAllZeros)
                //if true add 1 to the answer
                ans++;
            //mark the current cell as not visited again
            visited[i][j] = 0;
            return;
        }
        //up
        if(i>=1 && visited[i-1][j] != 1 && grid[i-1][j] != -1)
            dfs(i-1, j, grid, visited, ans, noOfZeros, noOfAllZeros, m, n);

        //down
        if(i<m-1 && visited[i+1][j] != 1 && grid[i+1][j] != -1)
            dfs(i+1, j, grid, visited, ans, noOfZeros, noOfAllZeros, m, n);

        //left
        if(j>=1 && visited[i][j-1] != 1 && grid[i][j-1] != -1)
            dfs(i, j-1, grid, visited, ans, noOfZeros, noOfAllZeros, m, n);

        //right
        if(j<n-1 && visited[i][j+1] != 1 && grid[i][j+1] != -1)
            dfs(i, j+1, grid, visited, ans, noOfZeros, noOfAllZeros, m, n);     

        visited[i][j] = 0;      
        
    }
    public:
    int uniquePathsIII(vector<vector<int>>& grid) 
    {
        int z=0;
        int noOfAllZeros=0;
        int ans=0;
        int x,y;
        int m=grid.size();
        int n=grid[0].size();
        
        vector<vector<bool>> visited(m,vector<bool>(n,0));

        for(int i=0;i<m;i++)
            for(int j=0 ; j<n; j++)
            {
                if(grid[i][j] == 0)
                    noOfAllZeros++;
                else if (grid[i][j] == 1)
                {
                    x=i;
                    y=j;
                }
            }
        dfs(x,y,grid, visited , ans, 0 , noOfAllZeros, m, n);
        return ans;

    }
};

int main()
{
    vector<vector<int> > grid{ { 1, 0, 0, 0 },
                               { 0, 0, 0, 0 },
                               { 0, 0, 2, -1 } };
    /*vector<vector<int> > grid{ { 1, -1},
                                { 0, 2} };*/
    
    Solution s;
    cout << s.uniquePathsIII(grid);
    //return 1;
    
}
