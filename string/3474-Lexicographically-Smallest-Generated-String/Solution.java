class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length(), m = str2.length();
        char[] res = new char[n + m - 1];
        boolean[] locked = new boolean[n + m - 1];

        for (int i = 0; i < res.length; i++) res[i] = '?';

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                for (int j = 0; j < m; j++) {
                    if (res[i + j] != '?' && res[i + j] != str2.charAt(j)) return "";
                    res[i + j] = str2.charAt(j);
                    locked[i + j] = true;
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            if (res[i] == '?') res[i] = 'a';
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {
                boolean match = true;

                for (int j = 0; j < m; j++) {
                    if (res[i + j] != str2.charAt(j)) {
                        match = false;
                        break;
                    }
                }

                if (match) {
                    boolean fixed = false;

                    for (int j = m - 1; j >= 0; j--) {
                        int idx = i + j;

                        if (locked[idx]) continue;

                        for (char c = 'a'; c <= 'z'; c++) {
                            if (c != str2.charAt(j)) {
                                res[idx] = c;
                                fixed = true;
                                break;
                            }
                        }

                        if (fixed) break;
                    }

                    if (!fixed) return "";
                }
            }
        }

        return new String(res);
    }
}
