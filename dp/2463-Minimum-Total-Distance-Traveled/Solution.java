class Solution {

    long[][] dp;

    public long minimumTotalDistance(List<Integer> robot, int[][] factory) {

        Collections.sort(robot);
        Arrays.sort(factory, (a, b) -> a[0] - b[0]);

        int n = robot.size(), m = factory.length;

        dp = new long[n][m];

        for (long[] row : dp) Arrays.fill(row, -1);

        return solve(0, 0, robot, factory);
    }

    long solve(int i, int j, List<Integer> robot, int[][] factory) {

        if (i == robot.size()) return 0;
        if (j == factory.length) return (long)1e15;

        if (dp[i][j] != -1) return dp[i][j];

        long res = solve(i, j + 1, robot, factory); 

        long cost = 0;

        for (int k = 0; k < factory[j][1] && i + k < robot.size(); k++) {

            cost += Math.abs(robot.get(i + k) - factory[j][0]);

            res = Math.min(res, cost + solve(i + k + 1, j + 1, robot, factory));
        }

        return dp[i][j] = res;
    }
}
