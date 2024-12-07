class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int zeroCount = 0;
        int maxRes = 0;
        for(int r=0;r<nums.length;r++)
        {
            if(nums[r]==0)
                zeroCount++;
           
            while(zeroCount > 1)
            {
                if(nums[l] == 0)
                    zeroCount--;
                l++;
            }
            
            maxRes = Math.max(maxRes , (r-l));
        }
        return maxRes;
    }
}