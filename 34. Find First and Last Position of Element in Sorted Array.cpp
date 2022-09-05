class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res(2,-1);
        res = binarySearch(nums, 0,nums.size()-1 , target);
        return res;
        
    }
    vector<int> binarySearch(vector<int>& nums, int min, int max, int target)
    {
        vector<int> res(2,-1);
        int mid;
        while(min<=max)
        {
            //start + (end - start)/2);
            mid = (max+min)/2;
            if(nums[mid] == target)
            {
                if(nums.size()!=1 &&  ((mid+1)<=(nums.size()-1)) && nums[mid+1] == target)
                {
                   while( (mid-1)>=0 && nums[mid-1] == target)
                        mid--;
                    res[0] = mid;
                    while( ((mid+1)<=(nums.size()-1)) && nums[mid+1] == target)
                        mid++;
                    res[1] = mid;
                    return res;
                }
                else if(nums.size()!=1 && (mid-1)>=0 && nums[mid-1] == target)
                {
                    while( (mid-1)>=0 && nums[mid-1] == target)
                        mid--;
                    res[0] = mid;
                    while( ((mid+1)<=(nums.size()-1)) && nums[mid+1] == target)
                        mid++;
                    res[1] = mid;
                    return res;
                }
                else
                {
                    res[0] = mid;
                    res[1] = mid;
                    return res;   
                }
            }
            else if(nums[mid] > target)
                max=mid-1;
            else
                min = mid+1;
        }
        return res;
    }
};
