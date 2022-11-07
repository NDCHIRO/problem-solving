class Solution {
    ArrayList<String> brackets;
    public boolean isValid(String s) {
        brackets = new ArrayList<String>();
        boolean valid=false;
        for(int i=0;i<s.length();i++)
        {
            //if ( or [ or { just push
            if((s.charAt(i)=='(') || (s.charAt(i)=='[') || s.charAt(i)=='{' )
                brackets.add(s.charAt(i)+"");
            //if ) or ] or }  pop 
            else 
            {   
                if(checkSize())
                    return false;
                valid = pop(s.charAt(i)+"",brackets.get(brackets.size()-1));
                if(valid ==false)
                    return false;
            }
        }
        return valid&&(checkSize());
    }
    
    boolean pop(String bracket, String top)
    {
        
        boolean valid=false;
        if(bracket.equals(")") && top.equals("(") || (bracket.equals("}") && top.equals("{"))
          || ( bracket.equals("]") && top.equals("[") ))
            valid =true;
        
        if(valid)
            brackets.remove(brackets.size()-1);
        
        return valid;
    }
              
    boolean checkSize()
    {
        if(brackets.size() == 0)
            return true;
        return false;
    }
    
    
}