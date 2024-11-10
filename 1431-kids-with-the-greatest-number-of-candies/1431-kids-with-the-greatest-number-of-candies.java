class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int maxCandies=-1;
        for(int i=0;i<candies.length;i++)
            maxCandies = Math.max(candies[i],maxCandies);
        
        List<Boolean> res = new ArrayList<>();
        for(int i=0;i<candies.length;i++)
                res.add(candies[i] + extraCandies >= maxCandies);
        
        return res;
    }
}