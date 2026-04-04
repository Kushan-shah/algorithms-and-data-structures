class Solution {
    public String decodeCiphertext(String s, int rows) {

        if (rows == 1) return s;

        int n = s.length();
        int cols = n / rows;

        char[][] grid = new char[rows][cols];

        int idx = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = s.charAt(idx++);
            }
        }

        StringBuilder res = new StringBuilder();

        for (int c = 0; c < cols; c++) {
            int i = 0, j = c;

            while (i < rows && j < cols) {
                res.append(grid[i][j]);
                i++;
                j++;
            }
        }

        int end = res.length() - 1;
        while (end >= 0 && res.charAt(end) == ' ') end--;

        return res.substring(0, end + 1);
    }
}
