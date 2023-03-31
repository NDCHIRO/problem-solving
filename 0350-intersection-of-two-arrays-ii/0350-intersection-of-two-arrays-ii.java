class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] freqNum1  = new int[1001];
        int[] freqNum2  = new int[1001];
        
        for(int i=0;i<nums1.length;i++)
            freqNum1[nums1[i]]++;
        for(int i=0;i<nums2.length;i++)
            freqNum2[nums2[i]]++;
        int count=0;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0;i<1001;i++)
        {
            if(freqNum1[i]!=0 && freqNum2[i]!=0)
            {
                for(int j=0;j<Math.min(freqNum1[i],freqNum2[i]);j++)
                        list.add(i);
            }
        }
        System.out.println(list);
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++)
            result[i]=list.get(i);
        return result;
    }
}