class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder strS = new StringBuilder();
        StringBuilder strT = new StringBuilder();
        
        s = deleteBackSpace(s);
        t = deleteBackSpace(t);
        
        if(s.equals(t))
            return true;
        return false;
    }
    
    public String deleteBackSpace(String s)
    {
        StringBuilder strS = new StringBuilder();
        for(int i=0;i<s.length();i++)
            if(strS.length()!=0 && s.charAt(i)=='#')
                strS.deleteCharAt(strS.length()-1);
            else if(s.charAt(i)!='#')
                    strS.append(s.charAt(i));
        return strS.toString();
    }
}