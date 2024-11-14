class Solution {
    public String reverseWords(String s) {
        String[] split = s.trim().split("\\s+");
        StringBuilder res = new StringBuilder();
        for(int i=split.length-1;i>=1;i--)
        {
            res.append((split[i])).append(" ");
        }
        res.append(split[0]);
        return res.toString();
    }
}