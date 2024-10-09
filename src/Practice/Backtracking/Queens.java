package Practice.Backtracking;

public class Queens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(nQueens(board, 0));
    }

    static int nQueens(boolean[][] board, int row) {
        if(row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for(int col=0; col<board.length; col++) {
            // place the queen if it is safe
            if(isSafe(board, row, col)) {
                board[row][col] = true;
                count += nQueens(board, row+1);
                board[row][col] = false;
            }
        }
        return count;
    }

    static void display(boolean[][] board) {
        for(boolean[] row: board) {
            for(boolean element: row) {
                if(element) {
                    System.out.print(" Q ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        // Check vertical
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        // Check left diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }
        // Check right diagonal
        for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }
        return true;
    }
}
