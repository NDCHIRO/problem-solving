class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
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
        int index2=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(max2<=nums[i] && index1!=i)
                max2 = nums[i];
        }
       System.out.println(max+" "+max2);
        return (max-1)*(max2-1);
    }
}