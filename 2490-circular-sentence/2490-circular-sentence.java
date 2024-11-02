class Solution {
    public boolean isCircularSentence(String sentence) {
        if(sentence.charAt(0)!=sentence.charAt(sentence.length()-1))
            return false;
        
       char lastChar=' ';
       for(int i=0;i<sentence.length()-1;i++)
       {
           if(sentence.charAt(i+1) == ' ')
               lastChar = sentence.charAt(i);
           if(sentence.charAt(i) == ' ')
               if(sentence.charAt(i+1) != lastChar)
                   return false;
       }
       return true;    
    }
}