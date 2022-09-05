class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==1)
            return 0;
        
        int left=0,right=1;
        int maxProfit=0,profit=0;
        
        while(right < prices.length)
        {
            profit = prices[right]-prices[left];
            if(profit<0)
                left=right;
            right=right+1;
            maxProfit=Math.max(profit,maxProfit);
        }
        return maxProfit;
        
    }
}