class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int minLen = n<=m? n: m;
        String merge = "";
        int i=0,j=0;
        while(i<n || j<m)
        {
            if(i<n)
                merge+=word1.charAt(i++);
            if(j<m)
                merge+=word2.charAt(j++);
        }
        return merge;
    }
}