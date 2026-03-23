class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int low = 1, high = getMax(nums);

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (isValid(nums, mid, threshold)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean isValid(int[] nums, int divisor, int threshold) {
        int sum = 0;
        for (int num : nums) {
            sum += (num + divisor - 1) / divisor;
        }
        return sum <= threshold;
    }

    private int getMax(int[] nums) {
        int max = 0;
        for (int num : nums) max = Math.max(max, num);
        return max;
    }
}
