#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        return getSearch(nums,target,0,nums.size()-1);
        
    }
    int getSearch(vector<int>& nums, int target, int min , int max)
    {
        int mid = min+(max-min)/2;
        if(min>max)
            if(target < nums[0])
                return 0;
            else if(target > nums[mid-1])
                return mid;
            else if(target < nums[mid-1])
                return mid-1;
        
        if(nums[mid] == target)
            return mid;
        else if(nums[mid] < target)
        {
            min = mid+1;
            return getSearch(nums, target,  min ,  max);
        }
        else 
        {
            max = mid-1;
            return getSearch(nums, target,  min ,  max);
        }
    }
};


int main()
{
    Solution s;
    vector<int> nums = {1,3,5,6};
    cout<<s.searchInsert(nums, 2)<<endl;
}