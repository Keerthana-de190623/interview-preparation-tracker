public class UniquePathsIII {
    private static int totalPaths = 0;

    public static void main(String[] args) {
        int[][] grid = {
            {1, 0, 0, 0},
            {0, 0, 0, 0},
            {0, 0, 2, -1}
        };
        System.out.println(uniquePathsIII(grid));
    }

    public static int uniquePathsIII(int[][] grid) {
        int[] start = new int[2];
        int empty = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    start[0] = i;
                    start[1] = j;
                } else if (grid[i][j] == 0) {
                    empty++;
                }
            }
        }

        helper(grid, start[0], start[1], empty + 1);  
        return totalPaths;
    }

    private static void helper(int[][] grid, int i, int j, int empty) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == -1) {
            return;
        }

        if (grid[i][j] == 2) {
            if (empty == 0) {
                totalPaths++;
            }
            return;
        }

        grid[i][j] = -1; 
        helper(grid, i + 1, j, empty - 1);
        helper(grid, i - 1, j, empty - 1);
        helper(grid, i, j + 1, empty - 1);
        helper(grid, i, j - 1, empty - 1);
        grid[i][j] = 0;  
    }
}
