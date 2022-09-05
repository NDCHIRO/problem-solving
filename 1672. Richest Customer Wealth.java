class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int res = 0;
        for (int i = 0; i < accounts.length; i++) {
            res = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                res += accounts[i][j];
            }
            maxWealth = Math.max(res, maxWealth);
        }
        return maxWealth;
    }
}
