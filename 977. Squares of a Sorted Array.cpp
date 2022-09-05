class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        vector<int> v(nums.size(),0);
        int i=0, j=nums.size()-1;
        for(int n=nums.size()-1;n>=0;n--)
        {
            if((nums[i]*nums[i]) > (nums[j]*nums[j]))
            {
                v[n]=nums[i]*nums[i];
                i++;
            }
            else
            {
                v[n]=nums[j]*nums[j];
                j--;
            }
        }
        return v;
    }
};
