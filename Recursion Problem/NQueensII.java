public class NQueensII {
    public static void main(String[] args) {
        int n = 4;
        System.out.println(totalNQueens(n));
    }

    public static int totalNQueens(int n) {
        int[] board = new int[n];
        return totalNQueensUtil(board, 0, n);
    }

    private static int totalNQueensUtil(int[] board, int row, int n) {
        if (row == n) {
            return 1;
        }

        int count = 0;
        for (int col = 0; col < n; col++) {
            if (isSafe(board, row, col, n)) {
                board[row] = col;
                count += totalNQueensUtil(board, row + 1, n);
            }
        }
        return count;
    }

    private static boolean isSafe(int[] board, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (board[i] == col || Math.abs(board[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }
}
