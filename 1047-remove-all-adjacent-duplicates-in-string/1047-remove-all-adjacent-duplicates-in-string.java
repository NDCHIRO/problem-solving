class Solution {
    public String removeDuplicates(String s) {
        
        StringBuilder str = new StringBuilder();
        char[] characters = s.toCharArray();
        for(int i=0;i<s.length();i++)
        {
            if(str.length()!=0 && characters[i]==str.charAt(str.length()-1))
                str.deleteCharAt(str.length()-1);
            else
                str.append(characters[i]);
        }
        return str.toString();
    }
}
