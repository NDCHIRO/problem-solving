class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> check=new ArrayList<Boolean>();
        int max=-1;
        for(int i=0;i<candies.length;i++)
        {
            max = Math.max(max,candies[i]);
        }
        
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=max)
                check.add(true);
            else
                check.add(false);
        }
        
        System.out.println(max);
        return check;
    }
}