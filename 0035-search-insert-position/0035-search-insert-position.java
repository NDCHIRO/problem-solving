class Solution {
    public int searchInsert(int[] nums, int target) {
        int max = nums.length-1;
        int min = 0;
        int mid = (max+min)/2;
        while(max>=min)
        {
            mid = (max+min)/2;
            if (nums[mid] == target)
                return mid;
            if(min==max)
                return (nums[min]>target)? mid:mid+1;
            if(nums[mid]>target)
                max=mid-1;
            else if (nums[mid]<target)
                min=mid+1; 
        }
        return mid;
    }
}