class Solution {
    int[][] memo;
    public int paintWalls(int[] cost, int[] time) {
        memo = new int[cost.length][cost.length+1];
        return dp(0,cost.length,cost,time);
    }
    int dp(int i, int remain,int[] cost,int[] time)
    {
        if(remain<=0)
            return 0;
        if (i == cost.length) {
            return (int) 1e9;
        }
        
        if (memo[i][remain] != 0) {
            return memo[i][remain];
        }
        
        int paint = cost[i]+dp(i+1,remain-1-time[i],cost,time);
        int dontPaint = dp(i+1,remain,cost,time);
        memo[i][remain] = Math.min(paint,dontPaint);
        return memo[i][remain];
    }
}