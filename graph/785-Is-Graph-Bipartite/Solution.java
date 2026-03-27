class Solution {
    public boolean isBipartite(int[][] graph) {
        int n = graph.length;
        int[] color = new int[n];

        for (int i = 0; i < n; i++) {
            if (color[i] != 0) continue;

            if (!dfs(graph, i, color, 1)) return false;
        }
        return true;
    }

    private boolean dfs(int[][] graph, int node, int[] color, int c) {
        if (color[node] != 0) return color[node] == c;

        color[node] = c;

        for (int nei : graph[node]) {
            if (!dfs(graph, nei, color, -c)) return false;
        }
        return true;
    }
}
