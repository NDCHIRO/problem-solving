class Solution {
    public int longestSubarray(int[] nums) {
        int l = 0;
        int zeroCount = 0;
        int maxRes = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
                zeroCount++;
           
            while(zeroCount > 1)
            {
                if(nums[l] == 0)
                    zeroCount--;
                l++;
            }
            
            maxRes = Math.max(maxRes , (i-l));
        }
        return maxRes;
    }
}