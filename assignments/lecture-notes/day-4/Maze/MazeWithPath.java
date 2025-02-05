package Maze;

public class MazeWithPath {
    public static void main(String[] args) {
        // int r = 3;
        // int c = 3;
        // printPaths(r, c);

        boolean[][] board = new boolean[2][3];
        // board[0][1] = true;
        // board[1][2] = true;
        // board[2][0] = true;
        // printPaths(board);
        printPathsAllDirection(board);
    }

    public static void printPaths(int r, int c) {
        helperPrintPaths(r, c, "");
    }

    public static void helperPrintPaths(int r, int c, String path) {
        if (r < 1 || c < 1) {
            return;
        }

        if (r == 1 && c == 1) {
            System.out.println(path);
            return;
        }

        // down
        helperPrintPaths(r - 1, c, path + 'D');

        // right
        helperPrintPaths(r, c - 1, path + 'R');
    }

    public static void printPaths(boolean[][] board) {
        helperPrintPaths(board, 0, 0, "");
    }

    public static void helperPrintPaths(boolean[][] board, int r, int c, String path) {
        if (c == board[0].length || r == board.length || board[r][c]) {
            return;
        }

        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(path);
            return;
        }

        // right
        helperPrintPaths(board, r, c + 1, path + 'R');

        // down
        helperPrintPaths(board, r + 1, c, path + 'D');
    }

    public static void printPathsAllDirection(boolean[][] board) {
        boolean[][] marker = new boolean[board.length][board[0].length];
        helperPrintPathsAllDirection(board, 0, 0, "", marker);
    }

    public static void helperPrintPathsAllDirection(boolean[][] board, int r, int c, String path, boolean[][] marker) {
        if (r < 0 || r == board.length || c < 0 || c == board[0].length || board[r][c] || marker[r][c]) {
            return;
        }

        if (r == board.length - 1 && c == board[0].length - 1) {
            System.out.println(path);
            return;
        }

        marker[r][c] = true;
        // right
        helperPrintPathsAllDirection(board, r, c + 1, path + 'R', marker);
        // down
        helperPrintPathsAllDirection(board, r + 1, c, path + 'D', marker);
        // left
        helperPrintPathsAllDirection(board, r, c - 1, path + 'L', marker);
        // up
        helperPrintPathsAllDirection(board, r - 1, c, path + 'U', marker);
        marker[r][c] = false;
    }

}
