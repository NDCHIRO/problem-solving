class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int xor = nums.length;
        for(i=0;i<nums.length;i++)
        {
            xor = xor ^ i ^ nums[i];
        }
        return xor;
    }
}

/*
class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        int sum=nums.length;
        for(;i<nums.length;i++)
        {
            sum+=i-nums[i];
        }
        return sum;
    }
}
*/

/*
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        for(i=0;i<nums.length;i++)
        {
            if(i!=nums[i])
                return i;
        }
        return i;
    }
}
*/