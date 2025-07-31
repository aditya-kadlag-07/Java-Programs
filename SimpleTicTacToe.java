
    import java.util.Scanner;

	public class SimpleTicTacToe {
	    static char[][] board = new char[3][3];
	    static char currentPlayer = 'X';

	    public static void main(String[] args) {
	        initializeBoard();
	        Scanner sc = new Scanner(System.in);
	        boolean gameOver = false;

	        while (!gameOver) {
	            printBoard();
	            System.out.println("Player " + currentPlayer + ", enter row and column (0, 1, or 2): ");
	            int row = sc.nextInt();
	            int col = sc.nextInt();

	            if (board[row][col] == ' ') {
	                board[row][col] = currentPlayer;

	                if (checkWin()) {
	                    printBoard();
	                    System.out.println("Player " + currentPlayer + " wins!");
	                    gameOver = true;
	                } else if (checkDraw()) {
	                    printBoard();
	                    System.out.println("It's a draw!");
	                    gameOver = true;
	                } else {
	                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
	                }

	            } else {
	                System.out.println("Cell already taken! Try again.");
	            }
	        }

	        sc.close();
	    }

	    static void initializeBoard() {
	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                board[i][j] = ' ';
	    }

	    static void printBoard() {
	        System.out.println("Board:");
	        for (int i = 0; i < 3; i++) {
	            System.out.println(" " + board[i][0] + " | " + board[i][1] + " | " + board[i][2]);
	            if (i < 2)
	                System.out.println("---+---+---");
	        }
	    }

	    static boolean checkWin() {
	     
	        for (int i = 0; i < 3; i++)
	            if (board[i][0] == currentPlayer &&
	                board[i][1] == currentPlayer &&
	                board[i][2] == currentPlayer)
	                return true;

	        for (int j = 0; j < 3; j++)
	            if (board[0][j] == currentPlayer &&
	                board[1][j] == currentPlayer &&
	                board[2][j] == currentPlayer)
	                return true;

	        if (board[0][0] == currentPlayer &&
	            board[1][1] == currentPlayer &&
	            board[2][2] == currentPlayer)
	            return true;

	        if (board[0][2] == currentPlayer &&
	            board[1][1] == currentPlayer &&
	            board[2][0] == currentPlayer)
	            return true;

	        return false;
	    }

	    static boolean checkDraw() {
	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                if (board[i][j] == ' ')
	                    return false;
	        return true;
	    }
	}

