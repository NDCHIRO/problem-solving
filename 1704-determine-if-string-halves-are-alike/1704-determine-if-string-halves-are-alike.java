class Solution {
    public boolean halvesAreAlike(String s) {
        String s1 = s.substring(0,s.length()/2);
        String s2 = s.substring(s.length()/2,s.length());
        
        int count1=0;
        s1=s1.toLowerCase();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i) == 'a' || s1.charAt(i) == 'e' ||s1.charAt(i) == 'i' || s1.charAt(i) == 'o'                      || s1.charAt(i) == 'u')    
                count1++;
        }
        
        int count2=0;
        s2=s2.toLowerCase();
        for(int i=0;i<s2.length();i++)
        {
            if(s2.charAt(i) == 'a' || s2.charAt(i) == 'e' ||s2.charAt(i) == 'i' || s2.charAt(i) == 'o'                      || s2.charAt(i) == 'u')    
                count2++;
        }
        
        if(count1 == count2)
            return true;
        return false;
    }
}