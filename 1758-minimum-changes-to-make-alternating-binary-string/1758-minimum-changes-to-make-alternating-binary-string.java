class Solution {
    public int minOperations(String s) {
        int count1=0;
        String s2 = new String(s);
        for(int i=1;i<s2.length();i++)
        {
            if(s2.charAt(i)==s2.charAt(i-1))
            {
                count1++;
                if(s2.charAt(i)=='1')
                   s2 = s2.substring(0, i) + '0' + s2.substring(i + 1);
                else
                   s2 = s2.substring(0, i) + '1' + s2.substring(i + 1);
            }
        }
        
        int count2=1;
        //s = s2;
        if(s.charAt(0)=='0')
            s = s.substring(0, 0) + '1' + s.substring(1);
        else
            s = s.substring(0, 0) + '0' + s.substring(1);
        for(int i=1;i<s.length();i++)
        {
            if(s.charAt(i)==s.charAt(i-1))
            {
                count2++;
                if(s.charAt(i)=='1')
                   s = s.substring(0, i) + '0' + s.substring(i + 1);
                else
                   s = s.substring(0, i) + '1' + s.substring(i + 1);
            }
        }
        
        return Math.min(count2,count1);
    }
}