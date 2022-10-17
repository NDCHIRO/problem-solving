class Solution {
    public int reverse(int x) {
        boolean negative=false;
        if(x==0)
            return 0;
        int rev = 0;
        int pop;
        while(x!=0)
        {
            pop = x%10;
            x=x/10;
            if((rev>Integer.MAX_VALUE/10) || (rev==Integer.MAX_VALUE/10 && pop>7))
                return 0;
            if((rev<Integer.MIN_VALUE/10) || (rev==Integer.MIN_VALUE/10 && pop<-8))
                return 0;
            rev = rev*10 + pop;
        }
        return rev;
    }
}