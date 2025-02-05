package Maze;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        printNQueens(board);
    }

    public static void printNQueens(boolean[][] board) {
        helper(board, 0);
    }

    public static void helper(boolean[][] board, int r) {
        if (r == board.length) {
            printBoard(board);
            return;
        }

        for (int c = 0; c < board[0].length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = true;
                helper(board, r + 1);
                board[r][c] = false;
            }
        }
    }

    public static boolean isSafe(boolean[][] board, int r, int c) {
        // up
        int i = r;
        while (i >= 0) {
            if (board[i][c]) {
                return false;
            }
            i--;
        }

        // left diagnal
        int ir = r;
        int ic = c;
        while (ir >= 0 && ic >= 0) {
            if (board[ir][ic]) {
                return false;
            }
            ir--;
            ic--;
        }

        // right diagnol
        ir = r;
        ic = c;
        while (ir >= 0 && ic < board[0].length) {
            if (board[ir][ic]) {
                return false;
            }
            ir--;
            ic++;
        }

        return true;
    }

    public static void printBoard(boolean[][] board) {
        for (boolean[] bs : board) {
            System.out.print("[");
            for (boolean bs2 : bs) {
                char c = bs2 ? 'Q' : ' ';
                System.out.print(c + " ,");
            }
            System.out.println("]");
        }
        System.out.println("--------------------------------------");
    }

}
