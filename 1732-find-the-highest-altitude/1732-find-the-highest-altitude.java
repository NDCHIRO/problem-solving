class Solution {
    public int largestAltitude(int[] gain) {
        int maxGain =0;
        int gain1=0;
        for(int i=0;i<gain.length;i++)
        {
            gain1+=gain[i];
            maxGain = Math.max(maxGain,gain1);
        }
        return maxGain;
    }
}