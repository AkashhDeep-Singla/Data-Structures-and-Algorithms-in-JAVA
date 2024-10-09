package Practice.Backtracking;

public class Knights {
    public static void main(String[] args) {
        int n = 3;
        boolean[][] board = new boolean[n][n];
        nKnights(board, 0, 0, n);
    }

    static void nKnights(boolean[][] board, int row, int col, int knights) {
        if (knights == 0) {
            display(board);
            System.out.println();
            return;
        }

        if (row == board.length) {
            return;
        }

        if (col == board.length) {
            nKnights(board, row + 1, 0, knights);
            return;
        }

        if (isSafe(board, row, col)) {
            board[row][col] = true;
            nKnights(board, row, col + 1, knights - 1);
            board[row][col] = false;
        }

        nKnights(board, row, col + 1, knights);
    }

    static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.print(" K ");
                } else {
                    System.out.print(" . ");
                }
            }
            System.out.println();
        }
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        int[] rowMoves = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] colMoves = {1, 2, 2, 1, -1, -2, -2, -1};

        for (int i = 0; i < 8; i++) {
            int newRow = row + rowMoves[i];
            int newCol = col + colMoves[i];
            if (isValid(board, newRow, newCol) && board[newRow][newCol]) {
                return false;
            }
        }
        return true;
    }

    static boolean isValid(boolean[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board.length;
    }
}