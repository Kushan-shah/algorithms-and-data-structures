import java.util.Arrays;

class Solution {
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int low = 1, high = position[position.length - 1] - position[0];
        int ans = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (canPlace(position, mid, m)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    private boolean canPlace(int[] pos, int dist, int m) {
        int count = 1, last = pos[0];

        for (int i = 1; i < pos.length; i++) {
            if (pos[i] - last >= dist) {
                count++;
                last = pos[i];
            }
        }
        return count >= m;
    }
}
