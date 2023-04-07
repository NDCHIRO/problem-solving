class Solution {
    public boolean isAnagram(String s, String t) {
        s = sort(s);
        t = sort(t);
        if(s.equals(t))
            return true;
        return false;
    }
    public String sort(String s)
    {
        char[] c = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
}