class Solution {
    int noOfMatches=0;
    public int numberOfMatches(int n) {
        if(n==1)
            return noOfMatches;
         
        if(n%2==0)
        {
            return (noOfMatches+n/2)+numberOfMatches(n/2);
        }
        else        
        {
            return (1+(noOfMatches+n/2))+numberOfMatches(n/2);
        }
    }
    
}