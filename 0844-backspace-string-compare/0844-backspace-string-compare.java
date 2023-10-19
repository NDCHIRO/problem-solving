class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = getStack(s);
        Stack<Character> st1 = getStack(t);
        
        if(st.toString().equals(st1.toString()))
            return true;
        return false;
    }
    
    Stack<Character> getStack(String s)
    {
        Stack<Character> st = new Stack<>();
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='#')
            {
                if(!st.empty())
                st.pop();
            }
            else
                st.push(s.charAt(i));
        }
        return st;
    }
}