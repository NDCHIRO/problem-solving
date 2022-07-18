class Solution {
    public int minimumSum(int num) {
        int []arr=new int[4];
        for(int i=0;i<4;i++)
        {
            arr[i]=(num%10);
            num=num/10;
        }
        int res=99999;
        int res1=99999;
        int minRes=99999;
        for(int i=0;i<4;i++)
        {
            //make all possibilities
            //(number 1 + number2) + (number 3 + number4)
            res=(arr[i%4]+(arr[(i+1)%4]*10))+((arr[(i+2)%4]+(arr[(i+3)%4]*10)));
            //(number 1 + number3) + (number 2 + number4)
            res1=(arr[i%4]+(arr[(i+2)%4]*10))+((arr[(i+1)%4]+(arr[(i+3)%4]*10)));
            res=Math.min(res,res1);
            minRes=Math.min(res,minRes);
        }
        return minRes;
    }
}
