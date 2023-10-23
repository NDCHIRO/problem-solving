class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==1)
            return true;
        if(n<=0)
            return false;
        
        if((Math.log(n)/ Math.log(4))  == (Math.ceil((Math.log(n))/ Math.log(4))))
            return true;
        return false;
    }
}