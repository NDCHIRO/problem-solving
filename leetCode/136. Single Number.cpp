class Solution {
public:
    int singleNumber(vector<int>& nums) {
        // nums.size() == 2 is not a valid test case but i handled it anyway
        if(nums.size() == 1 || nums.size() == 2)
            return nums[0];
        sort(nums.begin(),nums.end());
        int i=0;
        while(true)
        {
            if(i<=0)
                if(nums[i] != nums[i+1])
                    return nums[i];
            
            if(i >= nums.size()-1)
                if(nums[i] != nums[i-1])
                    return nums[i];
            
            if(nums[i] != nums[i+1] && nums[i] != nums[i-1])
                return nums[i];
            i++;
        }
    }
};
