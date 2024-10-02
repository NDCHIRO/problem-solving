import java.util.*;

class Solution {
    public int[] arrayRankTransform(int[] arr) {
        // Step 1: Copy the original array
        int[] res = Arrays.copyOf(arr, arr.length);
        
        // Step 2: Sort the original array to determine ranks
        int[] sortedArr = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sortedArr);
        
        // Step 3: Map to store ranks
        Map<Integer, Integer> map = new HashMap<>();
        
        // Assign ranks to each number
        int rank = 1;
        for (int num : sortedArr) {
            // Only assign rank to a number if it hasn't been assigned already
            if (!map.containsKey(num)) {
                map.put(num, rank++);
            }
        }
        
        // Step 4: Replace original array elements with their rank
        for (int i = 0; i < res.length; i++) {
            res[i] = map.get(arr[i]);
        }
        
        return res;
    }
}
