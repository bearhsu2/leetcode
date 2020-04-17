package idv.kuma.medium.number_of_islands;

public class Solution {
    public int numIslands(char[][] grid) {

        int number = 0;

        boolean[][] handled = new boolean[grid.length][grid[0].length];


        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {

                char c = grid[i][j];

                if (c == '0') {
                    handled[i][j] = true;
                } else if (!handled[i][j]) {
                    // find connected elements of c
                    //   during which,
                    //   all connected elements will be marked as handled


                    // number ++
                }

            }
        }

        return number;
    }
}
