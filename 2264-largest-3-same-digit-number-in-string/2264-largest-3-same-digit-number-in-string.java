class Solution {
    public String largestGoodInteger(String num) {
        String max = "0";
        String localMax = "";
        int maxInt=0;
        int count=0;
        for(int i=0;i<num.length()-1;i++)
        {
            if(num.charAt(i)==num.charAt(i+1))
            {
                count++;
                if(count==2)
                {
                    localMax = ""+num.charAt(i)+num.charAt(i)+num.charAt(i);
                   // max = Math.max(Integer.parseInt(max),
                    //               Integer.parseInt(localMax))+"";
                    if(Integer.parseInt(max)<=Integer.parseInt(localMax))
                        max=localMax;
                    count=0;
                }
            }
            else
                count=0;
        }
        if(max.equals("0"))
            return "";
        return max;
    }
}