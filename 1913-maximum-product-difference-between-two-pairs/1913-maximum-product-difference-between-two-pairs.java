class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);
        int first = nums[nums.length-1]*nums[nums.length-2];
        int second = nums[0]*nums[1];
        return first - second;
        
    }
}