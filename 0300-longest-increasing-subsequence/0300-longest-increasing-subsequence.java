class Solution {
    int []memo;
    public int lengthOfLIS(int[] nums) {
        memo = new int[2502];
        for(int i=0;i<memo.length;i++)
            memo[i]=-1;
        return getLongestSubsequence(nums,0,-1);
    }
    
    public int getLongestSubsequence(int nums[], int i,int prev){
        if(i>=nums.length)
            return 0;
        if(memo[prev+1]!=-1)
            return memo[prev+1];
        int dontTake = getLongestSubsequence(nums,i+1,prev);
        int take = 0;
        if(prev == -1 || nums[i] > nums[prev])
            take = 1+getLongestSubsequence(nums,i+1,i);
        memo[prev+1] = Math.max(take,dontTake);
        return memo[prev+1];
        //totalSum = Math.max(totalSum,Sum);
    }
}