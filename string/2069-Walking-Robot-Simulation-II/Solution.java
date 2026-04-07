class Robot {

    int w, h;
    int x = 0, y = 0;
    int dir = 0;

    int[][] dirs = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };
    String[] names = { "East", "North", "West", "South" };

    public Robot(int width, int height) {
        w = width;
        h = height;
    }

    public void step(int num) {

        int per = 2 * (w + h) - 4;

        if (per == 0)
            return;

        num %= per;
        if (num == 0)
            num = per;

        while (num > 0) {

            int nx = x + dirs[dir][0];
            int ny = y + dirs[dir][1];

            if (nx < 0 || nx >= w || ny < 0 || ny >= h) {
                dir = (dir + 1) % 4;
                continue;
            }

            x = nx;
            y = ny;
            num--;
        }
    }

    public int[] getPos() {
        return new int[] { x, y };
    }

    public String getDir() {
        return names[dir];
    }
}
