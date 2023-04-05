class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;
        int mid=(l+r)/2;;
        while(r>=l)
        {
            mid = (l+r)/2;
            /*if(l >= r && nums[mid] != target)
                return -1;*/
            if(nums[mid] == target)
                return mid;
            else if(nums[mid] > target)
                r = mid-1;
            else if(nums[mid] < target)
                l = mid+1;
        }
        if(l >= r && nums[mid] != target)
            return -1;
        return mid;
    }
    
    
}

/*
    public int search(int[] nums, int target) 
    {
        int l = 0;
        int r = nums.length-1;
        int result = binarySearch(nums,l,r,target);
        return result;
    }
        
    int binarySearch(int[] nums, int l ,int r,int target)
    {
        if(l>r)
            return -1;
        int mid = (l+r)/2;
        if(nums[mid] == target)
            return mid;
        else if (nums[mid] < target)
        {
            l = mid+1;
            return binarySearch(nums,l,r,target);
        }
        else 
        {
            r = mid-1;
            return binarySearch(nums,l,r,target);
        }
    }
*/