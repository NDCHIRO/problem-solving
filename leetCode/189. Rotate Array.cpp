class Solution {
public:
    void rotate(vector<int>& nums, int k) {
        vector<int> v(nums.size());
        for(int i=0;i<nums.size();i++)
        {
            v[i] = nums[i];
        }
        
        for(int i=0 ;i<nums.size(); i++)
        {
            nums[(i+k)%nums.size()] = v[i];
        }
    }
};
