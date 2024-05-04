class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int i=0,j=people.length-1;
        int res=0;
        while(i<j)
        {
            if(people[i]+people[j] <=limit)
            {
                res++;
                i++;
                j--;
            }
            else if(people[i]+people[j] > limit)
            {
                res++;
                j--;
            }
        }
        if(i==j)
            res++;
        return res;
    }
}