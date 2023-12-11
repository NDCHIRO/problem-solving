class Solution {
    public int findSpecialInteger(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            if(map.get(arr[i])==null)
            {
                map.put(arr[i],1);
            }
            else
            {
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        int max=-1;
        int index=-1;
         for (Map.Entry<Integer,Integer> item : map.entrySet())  
         {
             if(max<item.getValue())
                 index = item.getKey();
             max = Math.max(item.getValue(),max);
             
         }
        return index;
        /*int length = arr.length;
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
        return index;*/
    }
}