class Solution {
    public int findSpecialInteger(int[] arr) {
        int length = arr.length;
        int[] freq = new int[1000000];
        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        int max=-1000;
        int index=-1;
        for(int i=0;i<1000000;i++)
        {
            if(max<=freq[i])
                index = i;
            max = Math.max(max,freq[i]);
            
        }
        return index;
    }
}