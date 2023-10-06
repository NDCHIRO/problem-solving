class Solution {
    Integer[] cache;
    public int integerBreak(int n) {
        cache = new Integer[n+1];
        return DFS(n);
    }
    
    int DFS(int num)
    {
        if(num==1)
            return 1;

        if(cache[num]!=null)
            return cache[num];
        int res=0;
        int val=0;
        int val1=0;
        for(int i=1;i<num;i++)
        {
            //val = i*DFS(num-i);
            val=Math.max(DFS(num-i),(num-i));
            //res = Math.max(val,res);
            res = Math.max(val*i,res);
        }
        cache[num]=res;
        return res;
        
    }
}