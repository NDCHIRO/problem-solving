class Solution {
    public String restoreString(String s, int[] indices) {
        String res=s;
        char []ch = new char[indices.length];
        for(int i=0;i<indices.length;i++)
            ch[indices[i]] = s.charAt(i);
        res = String.copyValueOf(ch);
        return res;
    }
    
}