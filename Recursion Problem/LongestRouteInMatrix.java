public class LongestRouteInMatrix {
    private static final int[] rowDir = {-1, 1, 0, 0}; 
    private static final int[] colDir = {0, 0, -1, 1};

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1},
            {0, 0, 0, 1}
        };

        int startX = 0, startY = 0;
        int endX = 3, endY = 3;    

        System.out.println("Longest Path Length: " + longestPath(matrix, startX, startY, endX, endY));
    }

    public static int longestPath(int[][] matrix, int startX, int startY, int endX, int endY) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        boolean[][] visited = new boolean[rows][cols];
        
        return dfs(matrix, startX, startY, endX, endY, visited, 0);
    }

    private static int dfs(int[][] matrix, int x, int y, int endX, int endY, boolean[][] visited, int pathLength) {

        if (x == endX && y == endY) {
            return pathLength;
        }

        visited[x][y] = true;
        
        int maxPath = -1;  
        for (int i = 0; i < 4; i++) {
            int newX = x + rowDir[i];
            int newY = y + colDir[i];

            if (isValid(matrix, newX, newY, visited)) {
                int path = dfs(matrix, newX, newY, endX, endY, visited, pathLength + 1);
                maxPath = Math.max(maxPath, path); 
            }
        }

        visited[x][y] = false;

        return maxPath;  
    }

    private static boolean isValid(int[][] matrix, int x, int y, boolean[][] visited) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        return x >= 0 && y >= 0 && x < rows && y < cols && matrix[x][y] == 1 && !visited[x][y];
    }
}
