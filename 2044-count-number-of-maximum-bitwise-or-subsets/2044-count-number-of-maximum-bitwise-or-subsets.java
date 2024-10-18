class Solution {

    public int countMaxOrSubsets(int[] nums) {
        // Calculate the maximum possible OR value
        int maxOrValue = 0;
        for (int num : nums) {
            maxOrValue |= num;
        }

        int totalSubsets = 1 << nums.length; // 2^n subsets
        int subsetsWithMaxOr = 0;

        // Iterate through all possible subsets
        for (int subsetMask = 0; subsetMask < totalSubsets; subsetMask++) {
            int currentOrValue = 0;

            // Calculate OR value for the current subset
            for (int i = 0; i < nums.length; i++) {
                if (((subsetMask >> i) & 1) == 1) {
                    currentOrValue |= nums[i];
                }
            }

            // If current subset's OR equals maxOrValue, increment count
            if (currentOrValue == maxOrValue) {
                subsetsWithMaxOr++;
            }
        }

        return subsetsWithMaxOr;
    }
}