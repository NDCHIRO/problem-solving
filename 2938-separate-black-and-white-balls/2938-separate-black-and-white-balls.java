class Solution {
    public long minimumSteps(String s) {
        long countZeros=0;
        long count = 0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='0')
                countZeros++;
            else
            {
                if(countZeros>0)
                {
                    count+=(long)countZeros;
                }
            }
        }
        return count;
    }
}