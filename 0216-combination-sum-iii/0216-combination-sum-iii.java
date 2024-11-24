class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), k, n, 1);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> path, int k, int n, int start) {
        // Base case: If k numbers are chosen and their sum is n
        if (k == 0 && n == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        // If no more numbers can be added, return
        if (k == 0 || n < 0) {
            return;
        }

        // Explore each number starting from `start`
        for (int i = start; i <= 9; i++) {
            // Add the number to the path
            path.add(i);

            // Recur for the next number with reduced k and n
            backtrack(result, path, k - 1, n - i, i + 1);

            // Backtrack by removing the last added number
            path.remove(path.size() - 1);
        }
    }
}