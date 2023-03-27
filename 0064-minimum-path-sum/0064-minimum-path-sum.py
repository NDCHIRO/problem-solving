class Solution:
    def minPathSum(self, grid: List[List[int]]) -> int:
        m = len(grid)
        n = len(grid[0])

        @cache
        def dfs(i=0, j=0):
            if i == m or j == n:
                return inf
            if i == m-1 and j == n-1:
                return grid[i][j]
            return min(dfs(i+1, j), dfs(i, j+1)) + grid[i][j]
        
        return dfs()