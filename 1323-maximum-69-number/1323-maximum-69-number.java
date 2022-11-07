class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        int cur;
        StringBuffer string = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            cur=Integer.parseInt(s.charAt(i)+"");
            if(cur==6)
            {
                cur=9;
                string.setCharAt(i, '9');
                break;
            }
        }
        s=string.toString();
        return Integer.parseInt(s);
        
    }
}