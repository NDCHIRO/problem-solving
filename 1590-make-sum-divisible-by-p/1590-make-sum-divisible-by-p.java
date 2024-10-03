class Solution {
    public int minSubarray(int[] nums, int p) {
         long totalSum = 0;
        for (int num : nums) {
            totalSum += num;
        }

        long remainder = totalSum % p;
        if (remainder == 0) {
            return 0;  // If total_sum is divisible by p, no need to remove any subarray.
        }

        HashMap<Long, Integer> prefixModMap = new HashMap<>();
        prefixModMap.put(0L, -1);  // Initialize with a base case (prefix sum 0 at index -1)

        long prefixSum = 0;
        int minLen = nums.length;

        for (int i = 0; i < nums.length; i++) {
            prefixSum = (prefixSum + nums[i]) % p;
            
            // Calculate the target mod that needs to be removed
            long targetMod = (prefixSum - remainder + p) % p;
            
            if (prefixModMap.containsKey(targetMod)) {
                minLen = Math.min(minLen, i - prefixModMap.get(targetMod));
            }

            // Update the map with the current prefix sum mod and index
            prefixModMap.put(prefixSum, i);
        }

        // If no valid subarray found, return -1
        return minLen == nums.length ? -1 : minLen;
    }
}