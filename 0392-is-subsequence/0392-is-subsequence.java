class Solution {
    public boolean isSubsequence(String s, String t) {
        int j =0;
        if(s.length() > t.length())
            return false;
        for(int i=0;i<t.length();i++)
        {
            if( j<s.length() && s.charAt(j)==t.charAt(i))
                j++;
        }
        System.out.println(j);
        return j==s.length()?true:false;
    }
}