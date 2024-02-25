package tictactoe;

public class Board {

	private char[][] board;
	private int size;
	public char emptySpace;

	public Board(int size) {
		this.size = size;
		this.emptySpace = '-';
		this.board = new char[size][size];

		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				this.board[i][j] = this.emptySpace;
			}
		}
	}

	public void displayBoard() {
		for (int i = 0; i < this.size; i++) {
			System.out.print("|");
			for (int j = 0; j < this.size; j++) {
				System.out.print(this.board[i][j] + "|");
			}
			System.out.println();
		}
	}

	public boolean isTaken(int rowNum, int colNum) {
		rowNum = rowNum - 1;
		colNum = colNum - 1;
		if (rowNum >= this.size || colNum >= this.size) {
			return false;
		}
		return this.board[rowNum][colNum] != this.emptySpace;
	}

	public boolean isFull() {
		for (int i = 0; i < this.size; i++) {
			for (int j = 0; j < this.size; j++) {
				if (this.board[i][j] == this.emptySpace) {
					return false;
				}
			}
		}
		return true;
	}

	public void placeToken(char token, int rowNum, int colNum) {
		if (isTaken(rowNum, colNum)) {
			System.out.println("row " + rowNum + " column " + colNum + " is taken");
		} else {
			this.board[rowNum - 1][colNum - 1] = token;
		}
	}

	public char getHorizontalWinner() {
		for (int i = 0; i < this.size; i++) {
			if (this.board[i][0] != this.emptySpace) {
				int count = 1;
				for (int j = 1; j < this.size; j++) {
					if (this.board[i][j] == this.emptySpace) {
						break;
					}
					if (this.board[i][j] == this.board[i][j-1]) {
						count++;
					} else {
						break;
					}
				}
				if (count == this.size) {
					return this.board[i][0];
				}
			}
		}
		return this.emptySpace;
	}

	public char getVerticalWinner() {
		for (int j = 0; j < this.size; j++) {
			if (this.board[0][j] != this.emptySpace) {
				int count = 1;
				for (int i = 1; i < this.size; i++) {
					if (this.board[i][j] == this.board[i-1][j]) {
						count++;
					} else {
						break;
					}
				}
				if (count == this.size) {
					return this.board[0][j];
				}
			}
		}
		return this.emptySpace;
	}

	public char getDiagonalWinner() {
		int count = 1;
		for (int i = 1; i < this.size; i++) {
			if (this.board[0][0] == this.emptySpace || this.board[i][i] == this.emptySpace) {
				break;
			}
			if (this.board[0][0] == this.board[i][i]) {
				count++;
			} else {
				break;
			}
		}

		if (count == this.size) {
			return this.board[0][0];
		}

		count = 1;
		for (int i = 1; i < this.size; i++) {
			if (this.board[0][this.size - 1] == this.emptySpace) {
				break;
			}
			if (this.board[i][this.size - 1 - i] == this.board[0][this.size - 1]) {
				count++;
			} else {
				break;
			}
		}

		if (count == this.size) {
			return this.board[0][this.size - 1];
		}

		return this.emptySpace;
	}

	public char getWinner() {
		char winner = getHorizontalWinner();
		if (winner != this.emptySpace) {
			return winner;
		}
		winner = getVerticalWinner();
		if (winner != this.emptySpace) {
			return winner;
		}
		return getDiagonalWinner();
	}

}
