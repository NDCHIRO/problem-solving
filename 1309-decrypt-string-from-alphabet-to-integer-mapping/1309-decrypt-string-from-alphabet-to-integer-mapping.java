class Solution {
    public String freqAlphabets(String s) {
        StringBuilder str = new StringBuilder();
        char c;
        int num=0;
        for(int i=s.length()-1;i>=0;)
        {
            if(s.charAt(i)=='#')
            {
                num=Integer.parseInt(s.charAt(i-2)+""+s.charAt(i-1))-1;
                System.out.println(num);
               c =  (char)((num)+'a');
                System.out.println(c);
                i-=3;
            }
            else
            {
                num = Integer.parseInt(s.charAt(i)+"")-1;
                c = (char)((num) + 'a');
                i--;
            }
            str.append(c);
        }
        return str.reverse().toString();
    }
}