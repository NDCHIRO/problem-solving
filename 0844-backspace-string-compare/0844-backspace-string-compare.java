class Solution {
    public boolean backspaceCompare(String s, String t) {
        s = flip(s);
        t = flip(t);
        if(s.equals(t))
            return true;
        return false;
    }
    public String flip(String s)
    {
        Stack<Character> stack = new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!='#')
                stack.push(s.charAt(i));
            else
            {
                if(stack.empty())
                    continue;
                stack.pop();
            }
        }
        s="";
        for (char item: stack) 
            s+=item+"";
        return s;
    }
}