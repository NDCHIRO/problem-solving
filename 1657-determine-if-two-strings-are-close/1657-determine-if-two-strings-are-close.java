class Solution {
    public boolean closeStrings(String word1, String word2) {
        int[] freq1 = new int[26];
        int[] freq2 = new int[26];
        boolean[] charSet1 = new boolean[26];
        boolean[] charSet2 = new boolean[26];
        
       // Count frequencies and record character presence
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
            charSet1[c - 'a'] = true;
        }
        
        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
            charSet2[c - 'a'] = true;
        }
        
        // Check if both strings have the same set of characters
        for (int i = 0; i < 26; i++) {
            if (charSet1[i] != charSet2[i]) return false;
        }
        
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        
        for(int i=0;i<26;i++)
            if(freq1[i]!=freq2[i])
                return false;
        
        return true;
    }
}