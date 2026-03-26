import java.util.*;

class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) graph.add(new ArrayList<>());

        for (int[] p : prerequisites) {
            graph.get(p[1]).add(p[0]);
        }

        int[] indegree = new int[numCourses];
        for (List<Integer> list : graph) {
            for (int v : list) indegree[v]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) q.offer(i);
        }

        int[] res = new int[numCourses];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            res[idx++] = node;

            for (int nei : graph.get(node)) {
                if (--indegree[nei] == 0) q.offer(nei);
            }
        }

        return idx == numCourses ? res : new int[0];
    }
}
