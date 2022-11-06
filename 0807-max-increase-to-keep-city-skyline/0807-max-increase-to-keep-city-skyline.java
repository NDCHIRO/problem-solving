class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid.length];
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                row[i] = Math.max(row[i],grid[i][j]);
                col[i] = Math.max(col[i],grid[j][i]);
            }
        }
        
        int score = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid.length;j++)
                score+= Math.min(row[i],col[j]) - grid[i][j] ;
         
        return score;
    }                            
}