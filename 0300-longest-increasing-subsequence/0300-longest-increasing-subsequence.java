class Solution {
    int[] memo;
    public int lengthOfLIS(int[] nums) {
        memo = new int[2501];
        for(int i=0;i<memo.length;i++)
            memo[i]=-1;
        return getLongestSubsequance(nums,-1,0);
    }
    
    int getLongestSubsequance(int[] nums, int prev , int i)
    {
        if(i>=nums.length)
            return 0;
        if(memo[prev+1]!=-1)
            return memo[prev+1];
        
        int dontTake = getLongestSubsequance(nums,prev,i+1);
        int take = 0;
        if(prev==-1 || nums[prev]<nums[i])
            take = 1 + getLongestSubsequance(nums,i,i+1);
        memo[prev+1] = Math.max(take,dontTake);
        return memo[prev+1];
        
    }
}