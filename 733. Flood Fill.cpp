class Solution {
public:
    int val;
    vector<vector<int>> floodFill(vector<vector<int>>& image, int sr, int sc, int newColor) {
        // if the cuurent color is equal to the new color just return for not go into infinite loop
        if(image[sr][sc] == newColor)
            return image;
        vector<vector<int>> res = DFS(image , sr ,sc , newColor, image[sr][sc]);
        return res;
    }
    
    vector<vector<int>> DFS(vector<vector<int>>& image, int sr, int sc, int newColor, int oldColor) {
        image[sr][sc] = newColor;
        
        if((sr+1) < image.size() && image[sr+1][sc] == oldColor)
            DFS(image,sr+1, sc, newColor, oldColor);
        
        if((sr-1) >= 0 && image[sr-1][sc] == oldColor)
            DFS(image,sr-1, sc, newColor, oldColor);
        
        if((sc+1) < image[0].size() && image[sr][sc+1] == oldColor)
            DFS(image,sr, sc+1, newColor, oldColor);
        
        if((sc-1) >= 0 && image[sr][sc-1] == oldColor)
            DFS(image,sr, sc-1, newColor, oldColor);

        return image;
    }
};
