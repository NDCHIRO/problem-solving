class Solution {
    public int maxScore(String s) {
        String right = "";
        String left = "";
        int maxSum = 0;
        int localSum = 0;
        if(s.length()==2)
        {
            maxSum+=s.charAt(0)=='0'?1:0;
            maxSum+=s.charAt(1)=='1'?1:0;
            return maxSum;
        }
        for(int i=1;i<s.length();i++)
        {
            right=s.substring(i,s.length());
            left = s.substring(0,i);
            int sumZeros=0;
            int sumOnes=0;
            for(int j=0;j<right.length();j++)
            {
                if(right.charAt(j)=='1')
                    sumOnes+=1;
            }
            for(int j=0;j<left.length();j++)
            {
                if(left.charAt(j)=='0')
                    sumZeros+=1;
            }

            localSum=sumZeros+sumOnes;
            maxSum = Math.max(localSum,maxSum);    

        }
        return maxSum;
    }
}