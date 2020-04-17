package idv.kuma.medium.number_of_islands;

import java.util.ArrayDeque;
import java.util.Queue;

public class Solution {
    public int numIslands(char[][] grid) {

        int height = grid.length;
        if (height <= 0) return 0;

        int width = grid[0].length;
        if (width <= 0) return 0;

        int number = 0;

        boolean[][] handled = new boolean[height][width];

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {

                char c = grid[i][j];

                if (c == '0') {
                    handled[i][j] = true;
                } else if (!handled[i][j]) {
                    // find connected elements of c
                    //   during which,
                    //   all connected elements will be marked as handled
                    doBfs(i, j, grid, handled);

                    // done with current island
                    number++;
                }

            }
        }

        return number;
    }


    private void doBfs(int startI, int startJ, char[][] grid, boolean[][] handled) {

        Queue<Point> queue = new ArrayDeque<>();
        queue.offer(new Point(startI, startJ));
        handled[startI][startJ] = true;

        while (!queue.isEmpty()) {

            Point point = queue.poll();

            int i = point.getI();
            int j = point.getJ();

            if (i < grid.length - 1) doHandle(i + 1, j, grid, handled, queue);
            if (i > 0) doHandle(i - 1, j, grid, handled, queue);
            if (j < grid[0].length - 1) doHandle(i, j + 1, grid, handled, queue);
            if (j > 0) doHandle(i, j - 1, grid, handled, queue);

        }

    }


    private void doHandle(int i, int j, char[][] grid, boolean[][] handled, Queue<Point> queue) {

        if (!handled[i][j] && grid[i][j] == '1') {
            queue.offer(new Point(i, j));
            handled[i][j] = true;
        }

    }


    class Point {
        private int i;
        private int j;


        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }


        public int getI() {
            return i;
        }


        public void setI(int i) {
            this.i = i;
        }


        public int getJ() {
            return j;
        }


        public void setJ(int j) {
            this.j = j;
        }


        @Override
        public String toString() {
            return "Point{" + i +
                    ", " + j + '}';
        }
    }
}
