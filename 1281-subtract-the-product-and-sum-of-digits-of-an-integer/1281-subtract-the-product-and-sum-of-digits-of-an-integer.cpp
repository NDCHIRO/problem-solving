class Solution {
public:
    int subtractProductAndSum(int n) {
        int sum=0;
        int multiply=1;
        int digit=0;
        while(n>0)
        {
            digit=n%10;
            sum+=digit;
            multiply*=digit;
            n=n/10;
        }
        return multiply-sum;
    }
};