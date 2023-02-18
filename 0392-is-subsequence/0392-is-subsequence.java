class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0;
    for(int j = 0;j<t.length() && i<s.length();j++)
     if(t.charAt(j) == s.charAt(i)) i++;
    return i == s.length();  
        /*int noOfChecks=0;
        int lastIndex = 0;
        int currentIndex=0;
        for(int i=0;i<s.length();i++)
        {
            System.out.println(String.valueOf(s.charAt(i)));
            if(t.contains(String.valueOf(s.charAt(i))))
            {
                currentIndex = t.indexOf(String.valueOf(s.charAt(i)));
                if(currentIndex < lastIndex)
                    return false;
                else if(currentIndex > lastIndex)
                {
                    System.out.println("ttrue");
                    noOfChecks++;
                    lastIndex = currentIndex;
                }
            }
            else
                return false;
        }
        System.out.println(noOfChecks);
        if(noOfChecks == s.length())
            return true;
        return false;*/
    }
}