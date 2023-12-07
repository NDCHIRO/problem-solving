class Solution {
    public String largestOddNumber(String num) {
        int saveIndex=-1;
        for(int i=num.length()-1;i>=0;i--)
        {
            if(Integer.parseInt(num.charAt(i)+"")%2!=0)
            {   
                saveIndex=i;
                break;
            }
        }
        String res = "";
        if(saveIndex!=-1)
            res = num.substring(0, saveIndex+1);
        return res;
    }
}