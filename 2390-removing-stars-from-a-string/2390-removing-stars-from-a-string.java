class Solution {
    public String removeStars(String s) {
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                if(s1.length()!=0)
                    s1.deleteCharAt(s1.length()-1);
            }
            else
                s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}