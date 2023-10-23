class Solution {
    public boolean isPowerOfThree(int n) {
        //return n>0 && Math.pow(3,19) % n == 0;
        // failed trial
        if(n==1)
            return true;
        if(n<=0)
            return false;
         return (Math.log10(n) / Math.log10(3)) % 1 == 0;
        /*if((Math.log(n)/ Math.log(3))  == (Math.ceil((Math.log(n))/ Math.log(3))))
            return true;
        return false;*/
    }
}