class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        
        int count1=convert(s1);
        int count2=convert(s2);
        
        if(count1 == count2)
            return true;
        return false;
    }
    
    int convert(String s)
    {
        int count=0;
        s=s.toLowerCase();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i) == 'a' || s.charAt(i) == 'e' ||s.charAt(i) == 'i' || s.charAt(i) == 'o'                      || s.charAt(i) == 'u')    
                count++;
        }
        return count;
    }
}