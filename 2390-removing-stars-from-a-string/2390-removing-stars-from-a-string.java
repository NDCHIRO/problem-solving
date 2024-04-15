class Solution {
    public String removeStars(String s) {
        /*Stack<String> stack = new Stack();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                if(!stack.empty())
                    stack.pop();
            }
            else
                stack.push(s.charAt(i)+"");
        }
        s= stack.toString();
        s="";
        while(!stack.empty())
        {
            s+=stack.peek();
            stack.pop();
        }
        for(int i=0;i<s.length()/2;i++)
        {
            char temp = s.charAt(i);
            s.charAt(i,)
        }
        return s;*/
        StringBuilder s1 = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='*')
            {
                if(s1.length()!=0)
                    s1.deleteCharAt(s1.length()-1);
            }
            else
                s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}