public class SafeRoute {
    public static void main(String[] args) {
        int[][] grid = {
            {0, 1, 0},
            {1, 0, 1},
            {0, 0, 0}
        };
        System.out.println(shortestSafeRoute(grid));
    }

    public static int shortestSafeRoute(int[][] grid) {
        return findShortestPath(grid, 0, 0, new boolean[grid.length][grid[0].length]);
    }

    private static int findShortestPath(int[][] grid, int i, int j, boolean[][] visited) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 1 || visited[i][j]) {
            return -1;
        }

        if (i == grid.length - 1 && j == grid[0].length - 1) {
            return 0; 
        }

        visited[i][j] = true;
        int up = findShortestPath(grid, i - 1, j, visited);
        int down = findShortestPath(grid, i + 1, j, visited);
        int left = findShortestPath(grid, i, j - 1, visited);
        int right = findShortestPath(grid, i, j + 1, visited);
        visited[i][j] = false;

        int min = Math.min(Math.min(up, down), Math.min(left, right));
        return min == -1 ? -1 : min + 1;
    }
}
