public class PathWithMaxGold {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 6, 0},
            {5, 8, 7},
            {0, 9, 0}
        };
        System.out.println(getMaxGold(grid));
    }

    public static int getMaxGold(int[][] grid) {
        int maxGold = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    maxGold = Math.max(maxGold, collectGold(grid, i, j));
                }
            }
        }
        return maxGold;
    }

    private static int collectGold(int[][] grid, int x, int y) {
        if (x < 0 || x >= grid.length || y < 0 || y >= grid[0].length || grid[x][y] == 0) {
            return 0;
        }

        int gold = grid[x][y];
        grid[x][y] = 0; 
        int maxGold = Math.max(Math.max(collectGold(grid, x + 1, y),
                                       collectGold(grid, x - 1, y)),
                               Math.max(collectGold(grid, x, y + 1),
                                        collectGold(grid, x, y - 1)));

        grid[x][y] = gold;
        
        return gold + maxGold;
    }
}
