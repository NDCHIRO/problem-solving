class Solution {
    public char findKthBit(int n, int k) {
        StringBuffer buffer = new StringBuffer();
        StringBuffer reverseString = new StringBuffer();
        ArrayList<String> arr = new ArrayList<>();
        if(k==1)
            return '0';
        arr.add("0");
        for(int i=1;i<n;i++)
        {
            reverseString = new StringBuffer(); 
            buffer= new StringBuffer(); 
            String lastElement = arr.get(arr.size()-1);
            
            String reverted = revert(lastElement);
            reverseString.append(reverted);
            
            String reversed = reverseString.reverse().toString();
            
            buffer.append(lastElement+"1"+reversed);
            arr.add(buffer.toString());
        }
        
        //System.out.println(buffer);
        return buffer.charAt(k-1);
    }
    
    
    private String revert(String s)
    {
        StringBuffer buffer = new StringBuffer(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
                buffer.setCharAt(i,'1');
            else if(s.charAt(i)=='1')
                buffer.setCharAt(i,'0');
        }
        //System.out.println("AFTER REVERT :  "+buffer);
        return buffer.toString();
    }
}