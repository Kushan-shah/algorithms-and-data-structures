class Solution {
    public int minimumDistance(int[] nums) {

        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], x -> new ArrayList<>()).add(i);
        }

        int res = Integer.MAX_VALUE;

        for (List<Integer> list : map.values()) {

            if (list.size() < 3) continue;

            for (int i = 0; i + 2 < list.size(); i++) {

                int left = list.get(i);
                int right = list.get(i + 2);

                res = Math.min(res, 2 * (right - left));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
