class Solution {
    public String gcdOfStrings(String str1, String str2) {
        int len1= str1.length();
        int len2= str2.length();
        int minLen = len1>len2? len2:len1;
        boolean res = false;
        for(int i=minLen; i>=1;i--)
        {
            if(valid(str1,str2,i))
                return str1.substring(0,i);
        }
        
        return "";
    }
    
    private boolean valid(String str1, String str2, int k)
    {
        if(str1.length()%k !=0 || str2.length()%k !=0)
            return false;
        
        String base = str1.substring(0, k);
        return str1.replace(base,"").isEmpty() && str2.replace(base,"").isEmpty();
    }
}