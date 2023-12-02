class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] freq = new int[26];
        int res=0;
        for(int i=0;i<chars.length();i++)
            freq[chars.charAt(i)-'a']++;
        
        for(String word:words)
        {
            int[] freqForWord = new int[26];
            for(int j=0;j<word.length();j++)
                freqForWord[word.charAt(j)-'a']++;
            
            boolean good = true;
            for(int k=0;k<26;k++)
            {
                if(freq[k]<freqForWord[k])
                {
                    good = false;
                    break;
                 
                }
            }
            if(good)
                res+=word.length();
        }
        return res;
    }
}