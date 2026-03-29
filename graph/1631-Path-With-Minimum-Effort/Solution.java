class Solution {
    public int minimumEffortPath(int[][] heights) {
        int m = heights.length, n = heights[0].length;
        int[][] dist = new int[m][n];

        for (int[] row : dist) Arrays.fill(row, Integer.MAX_VALUE);

        PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->a[0]-b[0]);
        pq.offer(new int[]{0, 0, 0});
        dist[0][0] = 0;

        int[][] dirs = {{1,0},{-1,0},{0,1},{0,-1}};

        while (!pq.isEmpty()) {
            int[] cur = pq.poll();
            int d = cur[0], x = cur[1], y = cur[2];

            if (x == m-1 && y == n-1) return d;

            for (int[] dir : dirs) {
                int nx = x + dir[0], ny = y + dir[1];

                if (nx>=0 && ny>=0 && nx<m && ny<n) {
                    int nd = Math.max(d, Math.abs(heights[x][y] - heights[nx][ny]));

                    if (nd < dist[nx][ny]) {
                        dist[nx][ny] = nd;
                        pq.offer(new int[]{nd, nx, ny});
                    }
                }
            }
        }
        return 0;
    }
}
