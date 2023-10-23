class Solution {
    public boolean isPowerOfFour(int n) {
        //System.out.println(n&4);
        //System.out.println((Math.log(n) / Math.log(4))%2);
        if(n==1)
            return true;
        if(n<=0)
            return false;
        
        //System.out.println((Math.log(n)/ Math.log(4)));
        System.out.println((Math.ceil((Math.log(n))/ Math.log(4))));
        if((Math.log(n)/ Math.log(4))  == (Math.ceil((Math.log(n))/ Math.log(4))))
            return true;
        return false;
    }
}