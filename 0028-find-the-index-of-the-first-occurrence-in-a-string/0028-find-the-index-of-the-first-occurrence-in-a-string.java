class Solution {
    public int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();i++)
            for(int j=0;j<needle.length();j++)
                if(i+j<haystack.length() && haystack.charAt(i+j)==needle.charAt(j))
                {
                    if(j==needle.length()-1)
                        return i;
                }
                else
                    break;
        return -1;
    }
}