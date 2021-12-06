class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        vector<int> res(nums.size(),0);        
        for(int i=0,j=0 ; i<nums.size(); i++)
        {
            if(nums[i] != 0)
            {
                res[j] = nums[i];
                j++;
            }
        }

        for(int i=0 ; i<nums.size(); i++)
            cout<<res[i];
    }
};
