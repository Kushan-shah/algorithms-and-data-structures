class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] vis = new boolean[rooms.size()];
        dfs(rooms, vis, 0);

        for (boolean v : vis) {
            if (!v) return false;
        }
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] vis, int u) {
        vis[u] = true;

        for (int v : rooms.get(u)) {
            if (!vis[v]) dfs(rooms, vis, v);
        }
    }
}
