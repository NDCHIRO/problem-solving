class Solution {
    public int findDuplicate(int[] nums) {
        int res=0;
        int sum=0;
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==nums[i+1])
                return nums[i];
        }
        return sum;
    }
}
