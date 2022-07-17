class Solution {
    public int mostWordsFound(String[] sentences) {
        int res=1;
        int maxRes=1;
        for(int i=0;i<sentences.length;i++)
        {
            res=1;
            for(int j=0;j<sentences[i].length();j++)
            {
                if(sentences[i].charAt(j) == ' ')        
                    res++;
            }
            maxRes=Math.max(res,maxRes);    
        }
        return maxRes;
    }
}
