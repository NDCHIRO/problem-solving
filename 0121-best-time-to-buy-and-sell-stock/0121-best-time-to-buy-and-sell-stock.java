class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = 10001;
        int maxProfit = -10001;
        for(int i=0;i<prices.length;i++)
        {
            minPrice = Math.min(minPrice, prices[i]);
            maxProfit = Math.max(maxProfit, prices[i] - minPrice);
        }
        return maxProfit;
    }
}