class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> res = new ArrayList<>();
        List<String> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
        {
            list.add(i+"");
        }
        
        Collections.sort(list);
        for(int i=0;i<list.size();i++)
            res.add(Integer.parseInt(list.get(i)));
    
        return res;
    }
}