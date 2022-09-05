class Solution {
public:
    void merge(vector<int>& nums1, int m, vector<int>& nums2, int n) {
        int j=0;
        for(int i=m+n-1;i>m-1;i--)
        {
            if(nums1[i]==0)
                nums1[i]=nums2[j++];
            else
                break;
        }
        sort(nums1.begin(),nums1.end());
        for(int i=0;i<nums1.size();i++)
            cout<<nums1[i];
    }
};
