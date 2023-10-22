class Solution {
    public int maximumScore(int[] nums, int k) {
        int l = k , r = k;
        int minElement=nums[k];
        int maxPorduct = nums[k];
        while(l > 0 || r < nums.length-1)
        {
            int left = (l>0)? nums[l-1] : 0;
            int right = (r<nums.length-1)? nums[r+1] : 0;
            
            if(left > right)
            {
                l-=1;
                minElement = Math.min(nums[l],minElement);
            }
            else
            {
                r+=1;
                minElement = Math.min(nums[r],minElement);
            }
            maxPorduct = Math.max(maxPorduct,minElement*(r-l+1));
        }
        return maxPorduct;
    }
}