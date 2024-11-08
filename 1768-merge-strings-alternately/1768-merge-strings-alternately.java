class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i= 0;
        String res = "";
        int minLength = Math.min(word1.length(),word2.length());
        int maxLength = Math.max(word1.length(),word2.length());
        
        for(i=0;i<minLength ; i++)
            res+= (word1.charAt(i)+""+word2.charAt(i));
        
        for( ;i<maxLength; i++)
            res += ( maxLength == word1.length()?  word1.charAt(i):word2.charAt(i) );
                    
        return res;
    }
}