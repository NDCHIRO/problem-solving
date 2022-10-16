class Solution {
    int count=0;
    public int countOperations(int num1, int num2) {
        if(num1==0 || num2==0)
            return count;
        if(num1==num2)
            return ++count;
        if(num1>num2)
        {
            num1=num1-num2;
            count++;
            countOperations(num1,num2);
        }
        else
        {
            num2=num2-num1;
            count++;
            countOperations(num1,num2);
        }
        return count;
    }
}