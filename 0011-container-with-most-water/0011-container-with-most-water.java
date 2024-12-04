class Solution {
    public int maxArea(int[] height) {
        int i = 0, j= height.length-1;
        int maxSize = 0;
        while(i<j)
        {
            int localSize = 0;
            localSize = (j-i) * (Math.min(height[i],height[j]));
            maxSize = Math.max(localSize, maxSize);
            if(height[i] < height[j])
                i++;
            else
                j--;
        }
        return maxSize;
        
    }
}