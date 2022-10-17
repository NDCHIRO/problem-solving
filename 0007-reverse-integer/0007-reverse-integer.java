class Solution {
    public int reverse(int x) {
        int result=0;
        int newResult=0;
        while(x!=0)
        {
            newResult=newResult*10+(x%10);
            x/=10;
            //System.out.println(newResult/10);
            if((newResult/10)!=result)
                return 0;
            result=newResult;
        }
        return result;
        /*int rev = 0;
        int pop;
        while(x!=0)
        {
            pop = x%10;
            x=x/10;
            if(rev>Integer.MAX_VALUE/10)
                return 0;
            if(rev<Integer.MIN_VALUE/10)
                return 0;
            rev = rev*10 + pop;
        }
        return rev;*/
    }
}