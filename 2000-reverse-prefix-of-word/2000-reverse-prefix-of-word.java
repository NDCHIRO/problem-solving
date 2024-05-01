class Solution {
    public String reversePrefix(String word, char ch) {
        List<Character> list = new ArrayList<>();
        int found = -1;
        for (int i = 0; i < word.length(); i++) {
            if(word.charAt(i)== ch)
            {
                list.add(word.charAt(i));
                found = i;
                break;
            }
            else
                list.add(word.charAt(i));
        }
        String res = "";
        
        if(found!=-1) {
            for(int i=word.length()-1;i>found;i--)
                res=word.charAt(i)+res;
            for(int i=0;i<list.size();i++)
                res=list.get(i)+res;
        }
        else
           return word; 
        return res;
    }
}