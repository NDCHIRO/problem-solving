class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = Integer.MIN_VALUE;
        double localSum = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(i<k)
            {
                localSum+=nums[i];
                sum=localSum;
            }
            else
            {
                localSum+=nums[i]-nums[i-k];
                System.out.println(localSum);
                sum=Math.max(sum,localSum);
            }
        }
        return sum/k;
    }
}