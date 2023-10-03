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
            if(hashMap.containsKey(nums[i]))
            {
                ans += hashMap.getOrDefault(nums[i], 0);
                int val=hashMap.get(nums[i])+1;
                hashMap.put(nums[i],val);
            }
            else
            {
                hashMap.put(nums[i],1);
            }
        }
        /*Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();

        // Iterate over the HashMap using a while loop
        int sum=0;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> entry = iterator.next();   
            if(entry.getValue()>1)
            {
                for(int i=1;i<entry.getValue();i++)
                    sum+=i;
            }
        }*/
        return ans;
    }
}
