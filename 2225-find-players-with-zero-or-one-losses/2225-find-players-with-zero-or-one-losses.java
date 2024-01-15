class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<matches.length;i++)
        {
            for(int j=0;j<2;j++)
            {
                if(map.get(matches[i][j])!=null)
                {
                    ArrayList <Integer> list = new ArrayList<>();
                    list = map.get(matches[i][j]);
                    list.set(j,list.get(j)+1);
                    map.put(matches[i][j],list);
                }
            else
            {
                ArrayList<Integer> arrList = new ArrayList<>();
                if(j==0)
                {
                    arrList.add(1);
                    arrList.add(0);
                }
                else
                {
                    arrList.add(0);
                    arrList.add(1);
                }
                map.put(matches[i][j],arrList);
            }
            }
                
        }
        
        //System.out.println(map);
        
        List<List<Integer>> arr = new ArrayList<>();
        ArrayList<Integer> inner1 = new ArrayList<>();
        ArrayList<Integer> inner2 = new ArrayList<>();
        for(Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            int key = entry.getKey();
            ArrayList<Integer> values = entry.getValue();
            
            
            if(values.get(0)>0 && values.get(1)==0)
            {
                inner1.add(key);
            }
            else if(values.get(0)>=0 && values.get(1)==1)
            {
                inner2.add(key);
            }
        }
        Collections.sort(inner1);
        Collections.sort(inner2);
        arr.add(inner1);
        arr.add(inner2);
        
        return arr;
        
    }
}