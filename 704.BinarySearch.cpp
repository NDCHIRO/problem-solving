#include <iostream>
#include <vector>
using namespace std;
class Solution {
public:
    int search(vector<int>& nums, int target) {
        int min = 0;
        int max = nums.size()-1;
        int res = getTarget(nums, min, max , target);
        return res;
    }
    
    int getTarget(vector<int>& nums, int min, int max , int target)
    {
        if(min > max)
            return -1;
        int mid = (min+max)/2;
        if(nums[mid] == target)
            return mid;
        else if (target < nums[mid])
        {
            max = mid-1;
            return getTarget(nums,min, max ,target);
        }
        else
        {
            min = mid+1;
            return getTarget(nums,min, max ,target);
        }
    }
};

int main()
{
    Solution s;
    vector<int> nums = {-1,0,3,5,9,12};
    cout<<s.search(nums, 5)<<endl;
}