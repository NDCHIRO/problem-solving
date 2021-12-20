class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int res = binarySearch(nums,0,nums.size()-1 , target);
        return res;
    }
    
    int binarySearch(vector<int>& nums,int min, int max , int target )
    {
        int mid;
        while(min<=max)
        {
            mid = min+((max-min)/2);
            if(nums[mid] == target)
                return mid;
            else if(min == max)
            {
                if(nums[mid] < target)
                    return mid+1;
                else
                    return mid;
            }
            else if(nums[mid] > target)
                max = mid-1;
            else
                min = mid+1;
        }
        
        return mid;
    }
};
