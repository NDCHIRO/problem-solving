class Solution {
    public int numSpecial(int[][] mat) {
        int count=0;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1 && checkRow(mat,i) && checkCol(mat,j))
                    count++;
            }
        }
        return count;
    }
    
    public boolean checkRow(int[][] mat,int row)
    {
        int countOnes=0;
        for(int i=0;i<mat[0].length;i++)
            if(mat[row][i]==1)
                countOnes++;
        if(countOnes==1)
            return true;
        return false;
    }
    
    public boolean checkCol(int[][] mat,int col)
    {
        int countOnes=0;
        for(int i=0;i<mat.length;i++)
            if(mat[i][col]==1)
                countOnes++;
        if(countOnes==1)
            return true;
        return false;
    }
}