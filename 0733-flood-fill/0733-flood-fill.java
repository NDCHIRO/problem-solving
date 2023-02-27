class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int[][] colors = new int[image.length][image[0].length];
        int oldColor = image[sr][sc];
        image[sr][sc]=color;
        if(oldColor == color)
           return image; 
        DFS(image,sr,sc,color,oldColor);
        return image;
    }
    public void DFS(int[][] image, int sr, int sc,int color, int oldColor)
    {
        if( (sr+1) < image.length && image[sr+1][sc]==oldColor)
        {
            image[sr+1][sc]=color;
            DFS(image,sr+1,sc,color,oldColor);
        }
        if((sr-1) >=0 && image[sr-1][sc]==oldColor)
        {
            image[sr-1][sc]=color;
            DFS(image,sr-1,sc,color,oldColor); 
        }
        if((sc+1) < image[0].length && image[sr][sc+1]==oldColor)
        {
            image[sr][sc+1]=color;
            DFS(image,sr,sc+1,color,oldColor);
        }
        if((sc-1) >=0 && image[sr][sc-1]==oldColor)
        {
            image[sr][sc-1]=color;
            DFS(image,sr,sc-1,color,oldColor);
        }
    }
}