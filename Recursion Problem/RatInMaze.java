public class RatInMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {1, 1, 0, 0},
            {0, 1, 1, 1}
        };
        int[][] solution = new int[4][4];
        if (solveMaze(maze, 0, 0, solution)) {
            printSolution(solution);
        } else {
            System.out.println("No solution");
        }
    }

    public static boolean solveMaze(int[][] maze, int x, int y, int[][] solution) {
        if (x == maze.length - 1 && y == maze[0].length - 1) {
            solution[x][y] = 1;
            return true;
        }

        if (isSafe(maze, x, y)) {
            solution[x][y] = 1;
            if (solveMaze(maze, x + 1, y, solution)) return true; 
            if (solveMaze(maze, x, y + 1, solution)) return true; 
            solution[x][y] = 0; 
            return false;
        }
        return false;
    }

    public static boolean isSafe(int[][] maze, int x, int y) {
        return x >= 0 && x < maze.length && y >= 0 && y < maze[0].length && maze[x][y] == 1;
    }

    public static void printSolution(int[][] solution) {
        for (int[] row : solution) {
            for (int cell : row) {
                System.out.print(cell + " ");
            }
            System.out.println();
        }
    }
}

