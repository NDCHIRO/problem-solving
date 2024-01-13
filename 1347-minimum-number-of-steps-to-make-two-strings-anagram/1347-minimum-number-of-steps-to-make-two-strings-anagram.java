class Solution {
    public int minSteps(String s, String t) {
        int[] freq = new int[26];
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            freq[ s.charAt(i)-'a']++;
            freq[ t.charAt(i)-'a']--;
        }
        
        for(int i=0;i<26;i++)
            if(freq[i]>0)
                count+=freq[i];
        
        return count;
    }
}