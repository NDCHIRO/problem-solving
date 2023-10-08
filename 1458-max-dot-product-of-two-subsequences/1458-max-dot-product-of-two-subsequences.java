class Solution {
    int [][]memo;
    public int maxDotProduct(int[] nums1, int[] nums2) {
        if(Arrays.stream(nums1).max().getAsInt()<0 && Arrays.stream(nums2).min().getAsInt()>0)
            return Arrays.stream(nums1).max().getAsInt()* Arrays.stream(nums2).min().getAsInt();
        
        if(Arrays.stream(nums2).max().getAsInt()<0 && Arrays.stream(nums1).min().getAsInt()>0)
            return Arrays.stream(nums2).max().getAsInt()* Arrays.stream(nums1).min().getAsInt();
        
        memo = new int[nums1.length][nums2.length];
        return dp(0,0,nums1,nums2);
    }
    public int dp(int i,int j,int[] nums1, int[] nums2)
    {
        if(i==nums1.length || j==nums2.length)
            return 0;
        if(memo[i][j]!=0)
            return memo[i][j];
        int use = nums1[i]*nums2[j]+dp(i+1,j+1,nums1,nums2);
        use = Math.max(use , Math.max(dp(i+1,j,nums1,nums2),dp(i,j+1,nums1,nums2)));
        memo[i][j]=use;
        return use;
    }
}