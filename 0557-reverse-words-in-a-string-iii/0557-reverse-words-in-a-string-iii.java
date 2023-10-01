class Solution {
    public String reverseWords(String s) {
        String s1="";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                s1+=temp+' ';
                temp="";
            }
            else
                temp=s.charAt(i)+temp;
            
        }
        s1+=temp;
        return s1;
    }
    
    /*public String reverseChars(String chunkOfString)
    {
        String res="";
        for(int i=0;i<chunkOfString.length();i++)
            res=chunkOfString.charAt(i)+res;
        return res;
    }*/
}