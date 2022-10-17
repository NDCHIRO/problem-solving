class Solution {
    public int reverse(int x) {
        int result=0;
        int newResult=0;
        while(x!=0)
        {
            newResult=newResult*10+(x%10);
            x/=10;
            if((newResult/10)!=result)
                return 0;
            result=newResult;
        }
        return result;
    }
}