class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double localSum = 0;
        for (int i = 0; i < k; i++) 
            localSum += nums[i]; // Sum of the first 'k' elements
        
        double maxSum = localSum; // Initialize maxSum with the first window

        
        for(int i=k;i<nums.length;i++) {  
            localSum+=nums[i]-nums[i-k];
            maxSum=Math.max(maxSum,localSum);
        }
        
        return maxSum/k;
    }
}