class Solution {
    public int findMaxK(int[] nums) {
        
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++)
            if(nums[i]<0)
                set.add(nums[i]);
        
        int ans = -1;
        
        for(int i=nums.length-1; i>=0;i--)
            if(nums[i]>ans && set.contains(-nums[i]))
                ans = nums[i];
        return ans;
    }
}