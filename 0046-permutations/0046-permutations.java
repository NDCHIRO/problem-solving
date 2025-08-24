class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtrackDistinct(nums, used, new ArrayList<>(), res);
        return res;
    }

    private static void backtrackDistinct(int[] nums, boolean[] used, List<Integer> path, List<List<Integer>> res) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            path.add(nums[i]);
            backtrackDistinct(nums, used, path, res);
            path.remove(path.size() - 1);
            used[i] = false;
        }
    }
}