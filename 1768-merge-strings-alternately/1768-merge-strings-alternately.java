class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1Len = word1.length();
        int s2Len = word2.length();
        int minLen = s1Len<=s2Len? s1Len: s2Len;
        String merge = "";
        for(int i=0;i<minLen;i++)
        {
            merge+=word1.charAt(i);
            merge+=word2.charAt(i);
        }
        if(s1Len==s2Len)
            return merge;
        else if(s1Len>s2Len)
            for(int i=minLen;i<s1Len;i++)
                merge+=word1.charAt(i);
        else
            for(int i=minLen;i<s2Len;i++)
                merge+=word2.charAt(i);
        return merge;
    }
}