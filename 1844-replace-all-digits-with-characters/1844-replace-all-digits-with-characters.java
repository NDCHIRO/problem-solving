class Solution {
    public String replaceDigits(String s) {
        String out ="";
        char c;
        for(int i=0;i<s.length()-1;i++)
        {
            if(i%2==0)
            { 
                c = shift(s.charAt(i),s.charAt(i+1));
                out+=s.charAt(i)+""+c;
                System.out.println(out);

            }
        }
        if(s.length()%2!=0)
            out+=s.charAt(s.length()-1);
        return out;
    }
    
    public char shift(char c1,char c2)
    {
        char c = (char)(c1 + (c2 - '0'));
        System.out.println(c);
        return c;
    }
}