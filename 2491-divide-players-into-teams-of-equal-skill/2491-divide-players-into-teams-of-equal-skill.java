class Solution {
    public long dividePlayers(int[] skill) {
        int total = 0;
        for(int i=0;i<skill.length;i++)
            total+=skill[i];
        
        if((2*total)%skill.length != 0)
            return -1;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<skill.length;i++)
        {
            if (map.containsKey(skill[i])) 
                map.put(skill[i], map.get(skill[i]) + 1);
            else
                map.put(skill[i], 1);
         }
        
        
        int target = (2*total) / skill.length;
        long res = 0;
        
        for(int i=0;i<skill.length;i++) {
            if(map.get(skill[i]) == 0 ) continue;
            int diff = target - skill[i];
            if( map.containsKey(diff) == false || map.get(diff)<=0 )
                return -1;
            
            map.put(skill[i], map.get(skill[i]) - 1);
            map.put(diff, map.get(diff) - 1);
            res += (diff*skill[i]);
        }
        
        return res;
    }
}