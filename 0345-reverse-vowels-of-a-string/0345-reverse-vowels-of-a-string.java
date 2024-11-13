class Solution {
    public String reverseVowels(String s) {
        String vowels = "AaEeIiOoUu";
        ArrayList<Character> list = new ArrayList<>();
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(vowels.contains(cur+""))
            {
                list.add(cur);
            }
        }
        
        int vowel = 0;
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(vowels.contains(cur+""))
            {
                res+=list.get(list.size()-vowel-1);
                vowel++;
            }
            else
                res+=cur;
        }
        return res;
            
        
            
            }
}