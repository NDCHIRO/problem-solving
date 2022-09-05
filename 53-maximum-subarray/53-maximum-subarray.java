class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=-10001;
        int currentSum=0;
        if(nums.length==1)
            return nums[0];
        for(int i=0;i<nums.length;i++)
        {
            if(currentSum<0)
                currentSum=0;
            currentSum+=nums[i];
            maxSum=Math.max(currentSum,maxSum);
        }
        return maxSum;
    }
}