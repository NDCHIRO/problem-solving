class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder strS = new StringBuilder();
        StringBuilder strT = new StringBuilder();
        
        for(int i=0;i<s.length();i++)
        {
            if(strS.length()!=0 && s.charAt(i)=='#')
                strS.deleteCharAt(strS.length()-1);
            else
                if(s.charAt(i)!='#')
                    strS.append(s.charAt(i));
        }
        
        for(int i=0;i<t.length();i++)
        {
            if(strT.length()!=0 && t.charAt(i)=='#')
                strT.deleteCharAt(strT.length()-1);
            else
                if(t.charAt(i)!='#')
                    strT.append(t.charAt(i));
        }
        System.out.println(strS);
        System.out.println(strT);
        if(strT.toString().equals(strS.toString()))
            return true;
        return false;
    }
}