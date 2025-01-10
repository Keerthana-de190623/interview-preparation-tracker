
public class KnightsTour {

    private static final int N = 8;
    private static int[][] board = new int[N][N];

    private static int[] moveX = {-2, -2, 1, 1, 2, 2, -1, -1};
    private static int[] moveY = {-1, 1, -2, 2, -1, 1, -2, 2};

    public static void main(String[] args) {

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = -1;
            }
        }

        int startX = 0, startY = 0;

        board[startX][startY] = 0;
        if (solveKnightsTour(startX, startY, 1)) {
            printSolution();
        } else {
            System.out.println("Solution does not exist.");
        }
    }

    private static boolean solveKnightsTour(int x, int y, int moveCount) {

        if (moveCount == N * N) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            int newX = x + moveX[i];
            int newY = y + moveY[i];

            if (isSafe(newX, newY)) {

                board[newX][newY] = moveCount;

                if (solveKnightsTour(newX, newY, moveCount + 1)) {
                    return true;
                }

            }
        }

        return false;
    }

    private static boolean isSafe(int x, int y) {
        return x >= 0 && x < N && y >= 0 && y < N && board[x][y] == -1;
    }

    private static void printSolution() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
