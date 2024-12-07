class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0, r = 0;
        int zeroCount = 0;
        int maxRes = 0;
        for(int i=0;i<nums.length;i++)
        {
            r++;
            if(nums[i]==0)
                zeroCount++;
            
            while(zeroCount > k)
            {
                if(nums[l] == 0)
                {
                    zeroCount--;
                }
                l++;
            }
            maxRes = Math.max(maxRes , (i-l+1));
        }
        return maxRes;
    }
}