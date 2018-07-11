package l7;

public class nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean[][] board = new boolean[4][4];
		System.out.println(countnq(board, 0));
		
	}

	public static int countnq(boolean[][] board, int row) {
		if (row == board.length)
			return 1;
		int c = 0;
		for (int col = 0; col < board[row].length; col++) {
			if (isitsafe(board, row, col)) {
				board[row][col] = true;
				c = c + countnq(board, row + 1);
				board[row][col] = false;
			}
		}disp(board, 4, 4);
		return c;
	}

	public static boolean isitsafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col] == true)
				return false;
		}
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j] == true)
				return false;
		}
		for (int i = row, j = col; i >= 0 && j < board[row].length; i--, j++) {
			if (board[i][j] == true)
				return false;
		}
		return true;

	}

	public static void disp(boolean[][] board, int r, int c) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j]==true)
					System.out.println(i + " " + j);
			}
		}
	}
}
