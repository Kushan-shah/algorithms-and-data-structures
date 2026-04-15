class Solution {
    public int closetTarget(String[] words, String target, int startIndex) {

        int n = words.length;
        int res = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {

            if (words[i].equals(target)) {

                int d = Math.abs(i - startIndex);
                res = Math.min(res, Math.min(d, n - d));
            }
        }

        return res == Integer.MAX_VALUE ? -1 : res;
    }
}
