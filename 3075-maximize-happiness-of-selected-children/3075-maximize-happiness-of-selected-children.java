class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        Arrays.sort(happiness);
        long sum=0;
        int i=happiness.length-1;
        while(k!=0) {
            if((happiness[i]-(happiness.length-1-i)) > 0)
                sum+=(happiness[i]-(happiness.length-1-i));
            else
                break;
            i--;
            k--;
        }
        return sum;
    }
}