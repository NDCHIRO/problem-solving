#include <iostream>
using namespace std;
class Solution {

    int mem[46];
public:
    int climbStairs(int n) {
        memset(mem,-1,sizeof(mem));
        int noOfSol = 0;
        noOfSol+=climb(0 ,n);
        return noOfSol;
    }

    int climb(int currentStep, int n)
    {
        //invalid case
        if (currentStep > n)
            return 0;
        //base case
        if (currentStep == n)
            return 1;
        //using memoization check if it was calculated before: yes -> then return it , no-> calculate it 
        if (mem[currentStep] != -1)
            return mem[currentStep];
        
        mem[currentStep] = (climb(currentStep + 1, n)) + (climb(currentStep + 2, n));
        return mem[currentStep];
    }
};

//cheking the result
int main()
{
    Solution s;
    cout << s.climbStairs(45) << endl;
}
