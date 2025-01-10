public class NumberOfIslands {
    public static void main(String[] args) {
        char[][] grid = {
            {'1', '1', '0', '0', '0'},
            {'1', '1', '0', '0', '0'},
            {'0', '0', '1', '0', '0'},
            {'0', '0', '0', '1', '1'}
        };
        
        System.out.println(numIslands(grid));
    }

    public static int numIslands(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) {
            return 0;
        }

        int islandCount = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (grid[i][j] == '1') {
                    islandCount++;  
                    markIsland(grid, i, j, rows, cols);
                }
            }
        }

        return islandCount;
    }

    private static void markIsland(char[][] grid, int i, int j, int rows, int cols) {

        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == '0') {
            return;
        }

        grid[i][j] = '0';


        markIsland(grid, i - 1, j, rows, cols); 
        markIsland(grid, i + 1, j, rows, cols);
        markIsland(grid, i, j - 1, rows, cols); 
        markIsland(grid, i, j + 1, rows, cols); 
    }
}
