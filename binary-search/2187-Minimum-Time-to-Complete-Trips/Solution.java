class Solution {
    public long minimumTime(int[] time, int totalTrips) {
        long low = 1, high = (long) 1e14;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canComplete(time, mid, totalTrips)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }

    private boolean canComplete(int[] time, long t, int totalTrips) {
        long trips = 0;

        for (int x : time) {
            trips += t / x;
            if (trips >= totalTrips) return true;
        }
        return false;
    }
}
