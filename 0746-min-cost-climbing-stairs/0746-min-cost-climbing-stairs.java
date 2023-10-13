class Solution {
    int []dp;
    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        return Math.min(getMinCost(cost,1,0,0),getMinCost(cost,0,0,0));
    }
    public int getMinCost(int[] cost,int index,int sum,int localSum){
        if(index>=cost.length)
            return 0;
        if(dp[index]==0)
        {
            sum+=cost[index]+Math.min(getMinCost(cost,index+1,sum,localSum),
                      getMinCost(cost,index+2,sum,localSum));
            dp[index]=sum;
        }
        else
            return dp[index];

        return sum;
    }
}