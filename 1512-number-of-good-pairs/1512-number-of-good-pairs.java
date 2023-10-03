//first solution and its better solution
/*class Solution {
    public int numIdenticalPairs(int[] nums) {
       int count = 0;
        int freq[] = new int[101];
        for (int i=0;i<nums.length;i++) 
        {
            count+=freq[nums[i]];
            freq[nums[i]]++;
        }
        return count;
    }
}*/

//second solution and not the best but its a good idea
class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans += hashMap.getOrDefault(nums[i], 0);
            //int val=hashMap.get(nums[i])+1;
            hashMap.put(nums[i],hashMap.getOrDefault(nums[i],0)+1);
        }
        return ans;
    }
}
