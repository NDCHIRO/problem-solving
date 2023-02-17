class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0; 
        for(int i=0;i<nums.length;i++)
            sum+=nums[i];
        int leftSum = 0;
        
        for(int j=0;j<nums.length;j++)
        {
            if(leftSum==(sum-leftSum-nums[j]))
                return j;
            leftSum+=nums[j];
        }
        return -1;
    }
}