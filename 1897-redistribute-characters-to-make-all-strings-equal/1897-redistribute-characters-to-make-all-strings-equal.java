class Solution {
    public boolean makeEqual(String[] words) {
        if(words.length==1)
            return true;
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++)
        {
            for(char c: words[i].toCharArray())
            {
                if(map.containsKey(c))
                    map.put(c,map.get(c)+1);
                else
                    map.put(c,1);
                    
            }
        }
        for(Map.Entry<Character,Integer> set : map.entrySet())
            if(set.getValue() % words.length!=0)
                return false;
        return true;
    }
}