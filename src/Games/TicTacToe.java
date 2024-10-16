package Games;

import java.util.Objects;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        String[][] board = new String[3][3];
        for(int row=0; row<board.length; row++) {
            for (int col=0; col<board[row].length; col++) {
                board[row][col] = ". ";
            }
        }
        String player = "X ";
        boolean gameOver = false;
        Scanner scan = new Scanner(System.in);

        while(!gameOver) {
            printBoard(board);
            System.out.println("Player " + player + " enter: ");
            int row = scan.nextInt();
            int col = scan.nextInt();
            if(Objects.equals(board[row][col], ". ")) {
                board[row][col] = player;
                gameOver = haveWon(board, player);
                if(gameOver) {
                    System.out.println("Player " + player + "has won");
                } else {
                    player = (player.equals("X ")) ? "O " : "X ";
                    }
            } else {
                System.out.println("Invalid Move");
            }
        }
        printBoard(board);
    }

    public static void printBoard(String[][] board) {
        for (String[] row : board) {
            for (String box : row) {
                System.out.print(box + " ");
            }
            System.out.println();
        }
    }

    public static boolean haveWon(String[][] board, String player) {
        // row match
        for (String[] row : board) {
            if (Objects.equals(row[0], player) && Objects.equals(row[1], player) && Objects.equals(row[2], player)) {
                return true;
            }
        }
        // col match
        for(int col=0; col<board.length; col++) {
            if(Objects.equals(board[0][col], player) && Objects.equals(board[1][col], player) && Objects.equals(board[2][col], player)) {
                return true;
            }
        }
        //diagonal match
        if(Objects.equals(board[0][0], player) && Objects.equals(board[1][1], player) && Objects.equals(board[2][2], player)) {
            return true;
        }
        if(Objects.equals(board[0][2], player) && Objects.equals(board[1][1], player) && Objects.equals(board[2][0], player)) {
            return true;
        }
        return false;
    }
}
