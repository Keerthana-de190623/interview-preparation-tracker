public class ValidSudoku {
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'9', '8', '.', '.', '.', '.', '6', '.', '.'},
            {'8', '5', '.', '.', '6', '.', '.', '3', '9'},
            {'4', '8', '3', '7', '.', '2', '5', '.', '.'},
            {'7', '2', '.', '.', '8', '.', '9', '.', '6'},
            {'9', '7', '8', '5', '3', '.', '.', '.', '1'},
            {'.', '6', '2', '4', '1', '9', '.', '.', '8'},
            {'3', '4', '.', '.', '2', '.', '.', '.', '7'}
        };
        
        System.out.println(isValidSudoku(board));  // Output: true or false
    }
    public static boolean isValidSudoku(char[][] board) {
        return isValidRows(board, 0) && isValidColumns(board, 0) && isValidSubgrids(board, 0, 0);
    }

    private static boolean isValidRows(char[][] board, int row) {
        if (row == 9) {
            return true;
        }

        boolean[] seen = new boolean[9];
        for (int col = 0; col < 9; col++) {
            char num = board[row][col];
            if (num != '.') {
                int idx = num - '1';
                if (seen[idx]) {
                    return false;  
                }
                seen[idx] = true;
            }
        }
        

        return isValidRows(board, row + 1);
    }

    private static boolean isValidColumns(char[][] board, int col) {
        if (col == 9) {
            return true; 
        }
        
        boolean[] seen = new boolean[9];
        for (int row = 0; row < 9; row++) {
            char num = board[row][col];
            if (num != '.') {
                int idx = num - '1';
                if (seen[idx]) {
                    return false;                  }
                seen[idx] = true;
            }
        }
        
        return isValidColumns(board, col + 1);
    }


    private static boolean isValidSubgrids(char[][] board, int startRow, int startCol) {
        if (startRow == 9) {
            return true;  
        }
        
        if (startCol == 9) {
            return isValidSubgrids(board, startRow + 3, 0);
        }

        boolean[] seen = new boolean[9];
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                char num = board[i][j];
                if (num != '.') {
                    int idx = num - '1';
                    if (seen[idx]) {
                        return false;
                    }
                    seen[idx] = true;
                }
            }
        }
        return isValidSubgrids(board, startRow, startCol + 3);
    }
}
