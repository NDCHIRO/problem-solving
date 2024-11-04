class Solution {
    public String compressedString(String word) {
        if(word.length() == 1)
            return "1"+word.charAt(0);
        StringBuilder comp = new StringBuilder();
        int count = 1;
        for(int i=0;i<word.length();i++)
        {
            if(i == word.length()-1)
            {
                if(count==9 && word.charAt(i) == word.charAt(i-1))
                {
                    comp.append(count+""+word.charAt(i));
                    count=1;
                }
                else if(word.charAt(i) == word.charAt(i-1))
                {
                    //count++;
                    comp.append(count+""+word.charAt(i));
                }

                else if(word.charAt(i) != word.charAt(i-1))
                {
                    comp.append(count+""+word.charAt(i));
                    count = 1;
                }
                break;
            }  
            if(count==9 && word.charAt(i) == word.charAt(i+1))
            {
                comp.append(count+""+word.charAt(i));
                count=1;
            }
            else if(word.charAt(i) == word.charAt(i+1))
            {
                count++;
            }
            
            else if(word.charAt(i) != word.charAt(i+1))
            {
                comp.append(count+""+word.charAt(i));
                count = 1;
            }
        }
        return comp.toString();
    }
}