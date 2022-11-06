class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] width = new int[grid.length];
        int[] height = new int[grid.length];
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[i].length;j++)
            {
                width[i] = Math.max(width[i],grid[i][j]);
                height[i] = Math.max(height[i],grid[j][i]);
            }
        }
        
        int score = 0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid.length;j++)
                score+= Math.min(width[i],height[j]) - grid[i][j] ;
         
        return score;
        }                            
}