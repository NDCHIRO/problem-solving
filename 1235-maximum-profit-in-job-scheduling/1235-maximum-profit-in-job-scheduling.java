class Solution 
{
    public int jobScheduling(int[] s, int[] e, int[] p) 
    {
        int n = s.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; ++i)
            jobs[i] = new int[] {s[i], e[i], p[i]};

        Arrays.sort(jobs, (x, y) -> x[0]-y[0] != 0 ? x[0]-y[0] : x[1]-y[1]);
                
        int[] dp = IntStream.range(0, n+1).map(j -> 0).toArray();
        for (int i = n-1; i >= 0; --i)
        {
            int k = Arrays.binarySearch(jobs, new int[]{jobs[i][1], 0, 0}, 
                                        Comparator.comparingInt(j -> j[0]));
            k = (k>=0) ? k : -k-1;
            dp[i] = Math.max(dp[i+1], dp[k] + jobs[i][2]);
        }
        
        return dp[0];
    }
}