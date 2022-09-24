class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0;
        int multiply=1;
        while(n>0)
        {
            sum+=n%10;
            multiply*=n%10;
            n=n/10;
        }
        return multiply-sum;
    }
};