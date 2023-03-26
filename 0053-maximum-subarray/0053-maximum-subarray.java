class Solution {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int totalSum =-1000000;
        
        for(int i=0;i<nums.length;i++)
        {
            if(sum<0)
                sum=0;
            sum+=nums[i];
            totalSum = Math.max(totalSum,sum);
            
        }
        return totalSum;
    }
}