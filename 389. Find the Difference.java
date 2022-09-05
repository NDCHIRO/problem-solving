class Solution {
    public char findTheDifference(String s, String t) {
        int res=0;
        for(int i=0;i<s.length();i++)
            res^=s.charAt(i);
        for(int i=0;i<t.length();i++)
            res^=t.charAt(i);
        
        return (char)res;
    }
}
