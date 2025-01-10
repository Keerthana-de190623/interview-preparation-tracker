public class MinimumSteps {
    // Define the grid and directions
    private static final int[] rowDir = {0, 1, 0, -1};
    private static final int[] colDir = {1, 0, -1, 0};

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {1, 0, 0, 0},
            {0, 0, 0, 0}
        };
        System.out.println(minSteps(grid, 0, 0, 3, 3));
    }

    public static int minSteps(int[][] grid, int startRow, int startCol, int targetRow, int targetCol) {
        return dfs(grid, startRow, startCol, targetRow, targetCol, 0);
    }

    private static int dfs(int[][] grid, int row, int col, int targetRow, int targetCol, int steps) {
        if (row == targetRow && col == targetCol) {
            return steps;
        }

        int minSteps = Integer.MAX_VALUE;
        for (int i = 0; i < 4; i++) {
            int newRow = row + rowDir[i];
            int newCol = col + colDir[i];
            if (isValid(grid, newRow, newCol)) {
                grid[row][col] = -1;  
                minSteps = Math.min(minSteps, dfs(grid, newRow, newCol, targetRow, targetCol, steps + 1));
                grid[row][col] = 0;  
            }
        }

        return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
    }

    private static boolean isValid(int[][] grid, int row, int col) {
        return row >= 0 && col >= 0 && row < grid.length && col < grid[0].length && grid[row][col] != -1;
    }
}
