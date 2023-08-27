class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<String>();
        recurse(res, 0, 0, "", n);
        return res;
    }
    
    public void recurse(List<String> res, int openN, int closeN,String s , int n)
    {
        if(openN==closeN && openN == n)
        {
            res.add(s);
            return;
        }
        if(openN<n)
            recurse(res,openN+1,closeN,s+"(",n);
        if(closeN<openN)
            recurse(res,openN,closeN+1,s+")",n);
    }
}