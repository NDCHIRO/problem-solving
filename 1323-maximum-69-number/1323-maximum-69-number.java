class Solution {
    public int maximum69Number (int num) {
        String s = num+"";
        StringBuffer string = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            if(string.charAt(i)=='6')
            {
                string.setCharAt(i, '9');
                break;
            }
        }
        s=string.toString();
        //another solution
        //s=s.replaceFirst("6", "9");
        return Integer.parseInt(s);
        
    }
}