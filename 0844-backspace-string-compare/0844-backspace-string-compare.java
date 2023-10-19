class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st1 = new Stack<>();
        
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
        
        for (int i=0;i<t.length();i++)
        {
            if(t.charAt(i)=='#')
            {
                if(!st1.empty())  st1.pop();
            }
            else
                st1.push(t.charAt(i));
        }
        
        System.out.println(st.toString());
        System.out.println(st1.toString());
        if(st.toString().equals(st1.toString()))
            return true;
        return false;
    }
}