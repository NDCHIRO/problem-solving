class Solution {
    public String removeStars(String s) {
       StringBuilder str = new StringBuilder();
        char[] characters = s.toCharArray();
        for(int i=0;i<characters.length;i++)
        {
            if(characters[i]!='*')
                str.append(characters[i]);
            else
                str.deleteCharAt(str.length()-1);
        }
        return str.toString();
    }
}