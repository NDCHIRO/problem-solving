class Solution {
    public int kthGrammar(int n, int k) {
        if(n==1)
            return 0;
        int parent = kthGrammar(n-1,(k/2)+(k%2));
        boolean isKOdd = (k%2!=0)? true:false;
        if(parent == 1)
            return (isKOdd==true)? 1 : 0;
        else
            return (isKOdd==true)? 0 : 1;
    }
}