class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                ArrayList <Integer> list = new ArrayList<>();
                
                if(map.get(matches[i][j])!=null)
                {
                    list = map.get(matches[i][j]);
                    list.set(j,list.get(j)+1);
                    map.put(matches[i][j],list);
                }
                
                else
                {
                    if(j==0)
                    {
                        list.add(1);
                        list.add(0);
                    }
                    else
                    {
                        list.add(0);
                        list.add(1);
                    }
                    map.put(matches[i][j],list);
                }
            }
                
        }
        
        
        List<List<Integer>> res = new ArrayList<>();
        ArrayList<Integer> inner1 = new ArrayList<>();
        ArrayList<Integer> inner2 = new ArrayList<>();
        
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            ArrayList<Integer> values = entry.getValue();
            
            
            if(values.get(0)>0 && values.get(1)==0)
                inner1.add(key);

            else if(values.get(0)>=0 && values.get(1)==1)
                inner2.add(key);
            
        }
        
        Collections.sort(inner1);
        Collections.sort(inner2);
        
        res.add(inner1);
        res.add(inner2);
        
        return res;
        
    }
}