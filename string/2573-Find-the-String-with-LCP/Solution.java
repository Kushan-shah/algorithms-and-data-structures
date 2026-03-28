class Solution {
    public String findTheString(int[][] lcp) {
        int n = lcp.length;
        char[] s = new char[n];

        for (int i = 0; i < n; i++) s[i] = 0;

        char ch = 'a';

        for (int i = 0; i < n; i++) {
            if (s[i] != 0) continue;

            if (ch > 'z') return "";

            for (int j = i; j < n; j++) {
                if (lcp[i][j] > 0) {
                    s[j] = ch;
                }
            }
            ch++;
        }

        for (int i = 0; i < n; i++) {
            if (s[i] == 0) return "";
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                if (s[i] == s[j]) {
                    if (i == n - 1 || j == n - 1) {
                        if (lcp[i][j] != 1) return "";
                    } else {
                        if (lcp[i][j] != 1 + lcp[i + 1][j + 1]) return "";
                    }
                } else {
                    if (lcp[i][j] != 0) return "";
                }
            }
        }

        return new String(s);
    }
}
