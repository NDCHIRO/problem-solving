class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] numsConct = new int[nums.length*2];
        for(int i=0;i<numsConct.length;i++)
            numsConct[i]=nums[i%nums.length];
        return numsConct;
    }
}
