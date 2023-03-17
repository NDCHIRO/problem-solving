class Solution {
    int climbStairs(int n) {
        int noOfSol = 0;
        int []mem = new int[46];
        for(int i=0;i<mem.length;i++)
            mem[i] = -1;
        noOfSol+=getSolution(0,0,mem,n);
        return noOfSol;
    }
    
    int getSolution(int currentStep , int lastStep,int[] mem, int n)
    {
        if(currentStep > n)
            return 0;
        if(currentStep == n)
            return 1;
        if(mem[currentStep] != -1)
            return mem[currentStep];
        mem[currentStep] = (getSolution(currentStep + 1,1,mem, n)) + (getSolution(currentStep + 2,2,mem, n));
        return mem[currentStep];
    }
    
}