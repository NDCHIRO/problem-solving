class Solution {
    private String transformString(String s) {
        Map<Character, Integer> indexMapping = new HashMap<>();
        StringBuilder builder = new StringBuilder();
        
        for (int i = 0; i < s.length(); ++i) {
            char c1 = s.charAt(i);
            
            if (!indexMapping.containsKey(c1)) {
                indexMapping.put(c1, i);
            }
            
            builder.append(Integer.toString(indexMapping.get(c1)));
            builder.append(" ");
        }
        return builder.toString();
    }
    
    public boolean isIsomorphic(String s, String t) {
        return transformString(s).equals(transformString(t));
    }
}
/*class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> map = new HashMap<Character,Character>();
        String newString = "";
        for(int i=0;i<s.length();i++)
        {
            map.put(s.charAt(i),'0');
        }
        int size = s.length();
        int index = 0;
        while(index<size)
        {
            if(map.get(s.charAt(index)) != '0')
            {
                if(map.get(s.charAt(index)) != t.charAt(index))
                    return false;
                else if (map.get(s.charAt(index)) == t.charAt(index))
                    newString += t.charAt(index); 
                
                if(map.containsKey(t.charAt(index)) && map.get(t.charAt(index))!='0')
                {
                    newString += s.charAt(index); 
                    index++;
                    continue; 
                }
            }
            else if(map.get(s.charAt(index)) == '0')
            {
                /*
                    map.put(s.charAt(index),t.charAt(index));
                    newString += t.charAt(index); 
                
            }
            index++;
        }
        if(newString.equals(t))
            return true;
        return false;
    }
}*/