class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] width = new int[grid.length];
        int[] height = new int[grid.length];
        
        for(int i=0;i<grid.length;i++)
        {
            int max = 0;
            for(int j=0;j<grid[i].length;j++)
            {
                max = Math.max(max,grid[i][j]);
            }
            width[i]=max;
        }
        for(int i=0;i<grid.length;i++)
        {
            int max = 0;
            for(int j=0;j<grid[i].length;j++)
            {
                max = Math.max(max,grid[j][i]);
            }
            height[i]=max;
        }
        int increase = 0;
        int score = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid.length;j++)
            {
                increase = Math.min(width[i],height[j]);
                if(increase != grid[i][j])
                    score+= increase - grid[i][j] ;
            }
        }
        
        return score;
        }                            
}