class Solution {
    public String reverseWords(String s) {
        String res="";
        String temp="";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                res+=temp+' ';
                temp="";
            }
            else
                temp=s.charAt(i)+temp;
            
        }
        res+=temp;
        return res;
    }
}