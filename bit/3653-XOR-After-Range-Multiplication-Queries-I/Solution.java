class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {

        int n = nums.length;
        long mod = 1000000007;

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = nums[i];
        }

        for (int[] q : queries) {

            int l = q[0], r = q[1];
            int k = q[2], v = q[3];

            for (int i = l; i <= r; i += k) {
                arr[i] = (arr[i] * v) % mod;
            }
        }

        long res = 0;

        for (long val : arr) {
            res ^= val;
        }

        return (int) res;
    }
}
