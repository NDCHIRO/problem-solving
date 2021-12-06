class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        vector<int> res(2);
        int j=nums.size()-1;
        for(int i=0;i<nums.size();)
        {
            if(nums[i]+nums[j] == target)
            {
                res[0]=i+1;
                res[1]=j+1;
                //cout<<res[0]<<res[1]<<endl;
                return res;
            }
            else if(nums[i]+nums[j] > target)
                j--;
            else
                i++;
        }
        
        return res;
    }
};
