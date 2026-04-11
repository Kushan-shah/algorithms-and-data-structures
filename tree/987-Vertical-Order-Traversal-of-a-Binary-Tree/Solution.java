class Solution {

    public List<List<Integer>> verticalTraversal(TreeNode root) {

        Map<Integer, List<int[]>> map = new TreeMap<>();

        dfs(root, 0, 0, map);

        List<List<Integer>> res = new ArrayList<>();

        for (List<int[]> list : map.values()) {

            Collections.sort(list, (a, b) -> {
                if (a[0] == b[0]) return a[1] - b[1];
                return a[0] - b[0];
            });

            List<Integer> col = new ArrayList<>();

            for (int[] arr : list) {
                col.add(arr[2]);
            }

            res.add(col);
        }

        return res;
    }

    void dfs(TreeNode node, int x, int y, Map<Integer, List<int[]>> map) {

        if (node == null) return;

        map.computeIfAbsent(x, k -> new ArrayList<>())
            .add(new int[]{y, node.val, node.val});

        dfs(node.left, x - 1, y + 1, map);
        dfs(node.right, x + 1, y + 1, map);
    }
}
