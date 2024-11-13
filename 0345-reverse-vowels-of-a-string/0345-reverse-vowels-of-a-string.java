class Solution {
    public String reverseVowels(String s) {
        String vowels = "AaEeIiOoUu";
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(vowels.contains(s.charAt(i)+""))
                if(vowels.contains(s.charAt(j)+""))
                {
                    s=swap(s,i,j);
                    i++;
                    j--;
                }
                else
                    j--;
            else
                i++;
        }
        return s;
    }
    
    
    private String swap(String s,int i, int j)
    {
        StringBuilder res = new StringBuilder(s);
        char temp = s.charAt(i);
        res.setCharAt(i,s.charAt(j));
        res.setCharAt(j,temp);
        return res.toString();
    }
    
}