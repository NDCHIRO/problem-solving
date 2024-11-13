class Solution {
    public String reverseVowels(String s) {
        ArrayList<Character> list = new ArrayList<>();
        String res = "";
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(cur == 'A' || cur == 'a'
              || cur == 'E' || cur == 'e'
              ||cur == 'I' || cur == 'i'
              ||cur == 'O' || cur == 'o'
              ||cur == 'U' || cur == 'u')
            {
                list.add(cur);
            }
        }
        
        int vowel = 0;
        for(int i=0;i<s.length();i++)
        {
            char cur = s.charAt(i);
            if(cur == 'A' || cur == 'a'
              || cur == 'E' || cur == 'e'
              ||cur == 'I' || cur == 'i'
              ||cur == 'O' || cur == 'o'
              ||cur == 'U' || cur == 'u')
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