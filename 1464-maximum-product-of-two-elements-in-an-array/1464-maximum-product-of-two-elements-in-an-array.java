class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        return (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        /*int max=0;
        int index1=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(max<=nums[i])
            {
                max = nums[i];
                index1 = i;
            }
        }
        
        int max2=0;
        for(int i=0;i<nums.length;i++)
        {
            if(max2<=nums[i] && index1!=i)
                max2 = nums[i];
        }

        return (max-1)*(max2-1);*/
    }
}