class Solution {
    public int minMirrorPairDistance(int[] nums) {
        HashMap<Integer, Integer> lastSeen = new HashMap<>();
        int ans = Integer.MAX_VALUE;

        for (int j = 0; j < nums.length; j++) {
            if (lastSeen.containsKey(nums[j]))
                ans = Math.min(ans, j - lastSeen.get(nums[j]));

            int rev = 0, n = nums[j];
            while (n > 0) { rev = rev * 10 + n % 10; n /= 10; }

            lastSeen.put(rev, j);
        }

        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
