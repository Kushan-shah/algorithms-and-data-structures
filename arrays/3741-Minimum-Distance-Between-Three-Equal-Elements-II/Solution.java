class Solution {
    public int minimumDistance(int[] nums) {

        Map<Integer, Deque<Integer>> map = new HashMap<>();

        int res = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {

            map.computeIfAbsent(nums[i], x -> new ArrayDeque<>()).addLast(i);

            Deque<Integer> dq = map.get(nums[i]);

            if (dq.size() > 3) dq.pollFirst();

            if (dq.size() == 3) {

                int first = dq.peekFirst();
                int last = dq.peekLast();

                res = Math.min(res, 2 * (last - first));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
