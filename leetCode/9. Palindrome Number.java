class Solution {
    public boolean isPalindrome(int x) {
        int reverse=0;
        int reminder=0;
        int number=x;
        if(x<0)
            return false;
        if(x == 0)
            return true;
        while(number>0)
        {
            reminder=number%10;
            reverse= (reverse*10) + reminder;
            number/=10;
        }
        if(x == reverse)
            return true;
        return false;
    }
}
