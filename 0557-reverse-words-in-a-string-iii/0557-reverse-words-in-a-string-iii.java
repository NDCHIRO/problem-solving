class Solution {
    public String reverseWords(String s) {
        String s1="";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                temp+=s.charAt(i);
                s1+=reverseChars(temp);
                temp="";
            }
            else
            {
                temp+=s.charAt(i);
            }
        }
        s1+=reverseChars(temp);
        return s1;
    }
    
    public String reverseChars(String chunkOfString)
    {
        String res="";
        for(int i=0;i<chunkOfString.length();i++)
        {
            if(chunkOfString.charAt(i)==' ')
            {
                res+=' ';
                return res;
            }
            res=chunkOfString.charAt(i)+res;
        }
        return res;
    }
}