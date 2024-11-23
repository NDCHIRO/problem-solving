class Solution {
    public int largestAltitude(int[] gain) {
        int maxSum = 0;
        int localSum =0;
        for(int i=0;i<gain.length;i++)
        {
            localSum+=gain[i];
            maxSum = Math.max(maxSum,localSum);
        }
        return maxSum;
    }
}