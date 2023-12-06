class Solution {
    public int totalMoney(int n) {
        int ans = 0;
        int monday = 1;
        
        while (n > 0) {
            for (int day = 0; day < Math.min(n, 7); day++) {
                ans += monday + day;
            }
            
            n -= 7;
            monday++;
        }
        
        return ans;
    }
}
/*class Solution {
    public int totalMoney(int n) {
        int start=0;
        int sum=0;
        for(int i=1;i<=n+1;i++)
        {
            if(i%8==0)
            {
                start++;
                //continue ;
            }
            System.out.println(start +" "+ i%8);
            sum+=(start +(i%8));  
            //System.out.println(sum);

            //if(i%8==0)
              //  System.out.println(sum);
        }
        return sum;
    }
}*/