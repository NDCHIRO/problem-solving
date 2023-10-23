class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n<=0)
            return false;
        return (Math.log10(n) / Math.log10(4)) % 1 == 0;
        /*if((Math.log(n)/ Math.log(4))  == (Math.ceil((Math.log(n))/ Math.log(4))))
            return true;
        return false;*/
    }
}