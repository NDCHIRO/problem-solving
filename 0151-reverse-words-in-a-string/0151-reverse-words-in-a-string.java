class Solution {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        String res = "";
        for(int i=split.length-1;i>=1;i--)
        {
            res=res+(split[i])+" ";
        }
        res+=split[0];
        return res;
    }
}