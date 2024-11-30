class Solution {
    public int equalPairs(int[][] grid) {
        List<String> rows = new ArrayList<>();
        
        for(int i=0;i<grid.length;i++)
        {
            StringBuilder builder = new StringBuilder();
            
            for(int j=0;j<grid.length;j++)
                builder.append(grid[i][j]).append(",");
        
            rows.add(builder.toString());
        }
        
        int count = 0;
        
        for(int i=0;i<grid.length;i++)
        {
            StringBuilder builder = new StringBuilder();
            for(int j=0;j<grid.length;j++)
                builder.append(grid[j][i]).append(",");
            
            for(int j=0;j<rows.size();j++)
                if(rows.get(j).equals(builder.toString()))
                    count++;
        }
        
        
        return count;
    }
}