package Maze;

import java.util.Arrays;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = new int[][] {
                { 3, 0, 6, 5, 0, 8, 4, 0, 0 },
                { 5, 2, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 8, 7, 0, 0, 0, 0, 3, 1 },
                { 0, 0, 3, 0, 1, 0, 0, 8, 0 },
                { 9, 0, 0, 8, 6, 3, 0, 0, 5 },
                { 0, 5, 0, 0, 9, 0, 6, 0, 0 },
                { 1, 3, 0, 0, 0, 0, 2, 5, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 7, 4 },
                { 0, 0, 5, 2, 0, 6, 3, 0, 0 }
        };

        if (solveSudoku(board)) {
            for (int[] is : board) {
                System.out.println(Arrays.toString(is));
            }
        } else {
            System.out.println("Cannot solve sudoku");
        }

    }

    public static boolean solveSudoku(int[][] board) {
        return solve(board, 0, 0);
    }

    public static boolean solve(int[][] board, int r, int c) {
        // Reset the column to move to the next row
        if (c == 9) {
            r++;
            c = 0;
        }
        int rowStart = r;
        int colStart = c;
        boolean isSolved = true;
        boolean emptySpace = false;

        for (; rowStart < board.length; rowStart++) {
            for (; colStart < board.length; colStart++) {
                if (board[rowStart][colStart] == 0) {
                    isSolved = false;
                    emptySpace = true;
                    // gets true if it breaks from somewhere in middle
                    break;
                }
            }
            if (emptySpace) {
                break;
            }
            // Since we've initialized colStart outside this loop we need to
            // reset it to 0 when we finish iterating a single row
            colStart = 0;
        }

        if (isSolved) {
            // Sudoku is solved here
            return true;
        }

        for (int number = 1; number <= 9; number++) {
            if (isSafe(board, rowStart, colStart, number)) {
                board[rowStart][colStart] = number;
                // passing the current position of row and column
                // instead of starting from start
                if (solve(board, rowStart, colStart)) {
                    return true;
                } else {
                    board[rowStart][colStart] = 0;
                }
            }
        }

        return false;
    }

    public static boolean isSafe(int[][] board, int r, int c, int number) {
        // check row
        for (int cStart = 0; cStart < 9; cStart++) {
            if (board[r][cStart] == number) {
                return false;
            }
        }

        // check column
        for (int rStart = 0; rStart < 9; rStart++) {
            if (board[rStart][c] == number) {
                return false;
            }
        }

        // check box
        int rStart = r - (r % 3);
        int cStart = c - (c % 3);

        for (int i = rStart; i < rStart + 3; i++) {
            for (int j = cStart; j < cStart + 3; j++) {
                if (board[i][j] == number) {
                    return false;
                }
            }
        }

        return true;
    }
}
