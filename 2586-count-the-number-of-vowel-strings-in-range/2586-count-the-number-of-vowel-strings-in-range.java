class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count=0;
        for(int i=left;i<=right;i++)
            count+=chechVowel(words[i]);
        return count;
    }
    public int chechVowel(String s)
    {
        if((s.charAt(0) == 'a'|| s.charAt(0) == 'e' || s.charAt(0) == 'i' 
            || s.charAt(0) == 'o' || s.charAt(0) == 'u')
            && (s.charAt(s.length()-1) == 'a'|| s.charAt(s.length()-1) == 'e' 
            ||s.charAt(s.length()-1) == 'i' || s.charAt(s.length()-1) == 'o' 
            || s.charAt(s.length()-1) == 'u'))
            return 1;
        return 0;
    }
}