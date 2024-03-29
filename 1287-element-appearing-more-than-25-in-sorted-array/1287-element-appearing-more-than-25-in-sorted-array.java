class Solution {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int[] freq = new int[100001];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int max=-1;
        int index=-1;
        for(int i=0;i<100001;i++)
        {
            if(max<=freq[i])
                index = i;
            max = Math.max(max,freq[i]);
            
        }
        return index;
        //using hashmap
        /*HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
             map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    
        int target = arr.length / 4;
         for (int key : map.keySet()) 
            if (map.get(key) > target) 
                return key;
            
        
        return -1;*/
        
    }
}