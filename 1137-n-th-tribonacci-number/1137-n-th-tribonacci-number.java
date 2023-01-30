class Solution {
    //recursive solution
    int[] dp = new int[38];
    public int memorize(int n)
    { 
        if(n==0) return dp[n]=n;
        if(n==2||n==1) return dp[n]=1;
        if(dp[n]!=-1)
            return dp[n];
        return dp[n]=memorize(n-1)+memorize(n-2)+memorize(n-3);
    }
    public int tribonacci(int n) { 
        for(int i=0;i<38;i++)
            dp[i]=-1;
        return memorize(n);
    }
}

/*
//iterative solution
int[] arr = new int[38];
    public int tribonacci(int n) { 
        arr[0]=0;
        arr[1]=1;
        arr[2]=1;
        for(int i=3;i<=n;i++)
        {
            arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        }
        return arr[n];
    }
*/