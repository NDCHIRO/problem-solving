class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i= 0;
        String res = "";
        for(i=0;i<Math.min(word1.length(),word2.length()) ; i++)
        {
            res+=word1.charAt(i);
            res+=word2.charAt(i);
        }
        for(;i<Math.max(word1.length(),word2.length()) ; i++)
            res += (Math.max(word1.length(),word2.length()) == word1.length()?  word1.charAt(i):                                word2.charAt(i));
                    
        return res;
    }
}