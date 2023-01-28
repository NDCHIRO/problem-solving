class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        map <int,int> umap;
        vector<int> res(2);
        int rem;
        for(int i=0;i<nums.size() ; i++)
        {
            rem=target - nums[i];
            if(umap.find(rem) != umap.end())
            {
                res[0]=umap.at(rem);
                res[1]=i;
                /*cout<<res[0]<<endl;
                cout<<res[1]<<endl;*/
                return res;
            }
            umap.insert({nums[i],i});
            
        }
        return res;
    }
};