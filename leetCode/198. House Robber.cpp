class Solution {
public:
    int rob(vector<int>& nums) {
        vector<int> dp(nums.size(),-1);
        return solve(nums, dp ,0);
    }
    
    int solve(vector<int>& nums , vector<int>& dp , int i)
    {
        if(i >= nums.size())
            return 0;
        if(dp[i] != -1)
            return dp[i];
        return dp[i] = max(solve(nums,dp,i+1) , nums[i]+solve(nums,dp,i+2));
    }
};
