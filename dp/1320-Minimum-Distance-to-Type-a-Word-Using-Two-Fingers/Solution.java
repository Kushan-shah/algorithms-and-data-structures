class Solution {

    public int minimumDistance(String word) {

        int n = word.length();

        int[][] dp = new int[27][27];

        for (int[] row : dp) Arrays.fill(row, Integer.MAX_VALUE);

        dp[26][26] = 0; 
        for (char c : word.toCharArray()) {

            int cur = c - 'A';

            int[][] next = new int[27][27];
            for (int[] row : next) Arrays.fill(row, Integer.MAX_VALUE);

            for (int f1 = 0; f1 <= 26; f1++) {
                for (int f2 = 0; f2 <= 26; f2++) {

                    if (dp[f1][f2] == Integer.MAX_VALUE) continue;

                    int cost1 = dp[f1][f2] + dist(f1, cur);
                    next[cur][f2] = Math.min(next[cur][f2], cost1);

                    int cost2 = dp[f1][f2] + dist(f2, cur);
                    next[f1][cur] = Math.min(next[f1][cur], cost2);
                }
            }

            dp = next;
        }

        int res = Integer.MAX_VALUE;

        for (int[] row : dp) {
            for (int val : row) {
                res = Math.min(res, val);
            }
        }

        return res;
    }

    int dist(int a, int b) {

        if (a == 26 || b == 26) return 0;

        int x1 = a / 6, y1 = a % 6;
        int x2 = b / 6, y2 = b % 6;

        return Math.abs(x1 - x2) + Math.abs(y1 - y2);
    }
}
