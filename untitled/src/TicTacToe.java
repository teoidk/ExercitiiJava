import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TicTacToe {
    private static final char EMPTY = '*';
    private static final int SIZE = 3;
    private static char[][] board = new char[SIZE][SIZE];
    private static char currentPlayer;

    public static void main(String[] args) throws Exception {
        initializeBoard();
        System.out.println("Welcome to the X and 0 game");
        choosePlayer();
        while (true) {
            printBoard();
            playerMove();
            if (checkWin()) {
                printBoard();
                System.out.println("Player " + currentPlayer + " wins!");
                break;
            }
            if (isBoardFull()) {
                printBoard();
                System.out.println("It's a draw!");
                break;
            }
            switchPlayer();
        }
    }

    private static void initializeBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = EMPTY;
            }
        }
    }

    private static void choosePlayer() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("Choose X or 0");
            char input = (char) reader.read();
            reader.readLine(); // Read the newline character
            if (input == 'X' || input == '0') {
                currentPlayer = input;
                System.out.println("You chose " + currentPlayer);
                break;
            } else {
                System.out.println("Invalid choice. Please choose X or 0.");
            }
        }
    }

    private static void printBoard() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void playerMove() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int row = -1, col = -1;
        while (true) {
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            String input = reader.readLine();
            String[] parts = input.split(" ");
            if (parts.length == 2) {
                try {
                    row = Integer.parseInt(parts[0]);
                    col = Integer.parseInt(parts[1]);
                    if (row >= 0 && row < SIZE && col >= 0 && col < SIZE && board[row][col] == EMPTY) {
                        board[row][col] = currentPlayer;
                        break;
                    } else {
                        System.out.println("This position is either out of bounds or already occupied. Try again.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Please enter numbers for row and column.");
                }
            } else {
                System.out.println("Invalid input format. Please enter two numbers separated by a space.");
            }
        }
    }

    private static void switchPlayer() {
        currentPlayer = (currentPlayer == 'X') ? '0' : 'X';
    }

    private static boolean checkWin() {
        for (int i = 0; i < SIZE; i++) {
            if (board[i][0] == currentPlayer && board[i][1] == currentPlayer && board[i][2] == currentPlayer) {
                return true;
            }
            if (board[0][i] == currentPlayer && board[1][i] == currentPlayer && board[2][i] == currentPlayer) {
                return true;
            }
        }
        if (board[0][0] == currentPlayer && board[1][1] == currentPlayer && board[2][2] == currentPlayer) {
            return true;
        }
        if (board[0][2] == currentPlayer && board[1][1] == currentPlayer && board[2][0] == currentPlayer) {
            return true;
        }
        return false;
    }

    private static boolean isBoardFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }
}