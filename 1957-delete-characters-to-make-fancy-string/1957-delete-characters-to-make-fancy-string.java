class Solution {
    public String makeFancyString(String s) {
        StringBuilder builder = new StringBuilder();
        int count=0;
        builder.append(s.charAt(0)+"");
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==(builder.charAt(builder.length()-1)))
            {
                if(count==1)
                    continue;
                count++;
            }
            else
                count=0;
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}