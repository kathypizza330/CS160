// Terrier.java - terrier behavior in "Terriers and Squirrels"
//Author: Lingyang Zhu
//Date:   Dec. 7, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu

public class Terrier implements AnimalInterface {

	//
	// DO NOT MODIFY BELOW
	//
	private int currentRow;
	private int currentCol;
	private int previousRow = -1;
	private int previousCol = -1;
	private int closestRow;
	private int closestCol;
	private char[][] field;

	// Initializes position and field
	public Terrier(int row, int col, char[][] field) {
		this.currentRow = row;
		this.currentCol = col;
		this.field = field;
	}

	// Getters
	public int getCurrentRow() {
		return currentRow;
	}

	public int getCurrentCol() {
		return currentCol;
	}

	public int getPreviousRow() {
		return previousRow;
	}

	public int getPreviousCol() {
		return previousCol;
	}

	public int getClosestRow() {
		return closestRow;
	}

	public int getClosestCol() {
		return closestCol;
	}

	//
	// DO NOT MODIFY ABOVE
	//

	// Find closest squirrel
	public void findClosest() {

		// TO DO: Replace with code to find closest
		closestRow = -1;
		closestCol = -1;
		double distance = Math.sqrt(Math.pow(field.length, 2)
				+ Math.pow(field[0].length, 2));
		for (int i = 0; i < field.length; i++) {
			for (int j = 0; j < field[0].length; j++) {
				if (field[i][j] == 'S') {
					double d = Math.sqrt(Math.pow(i - currentRow, 2)
							+ Math.pow(j - currentCol, 2));
					if (d < distance) {
						distance = d;
						closestRow = i;
						closestCol = j;
					}
				}
			}
		}

	}

	// Move terrier according to the rules
	public void moveAnimal() {

		eMove move = eMove.NO_MOVE;

		// Store previous position
		previousRow = currentRow;
		previousCol = currentCol;

		// TO DO: replace with code to select move (Step 1)
		if (currentRow == closestRow && currentCol > closestCol)
			move = eMove.LEFT;
		if (currentCol == closestCol && currentRow < closestRow)
			move = eMove.DOWN;
		if (currentRow == closestRow && currentCol < closestCol)
			move = eMove.RIGHT;
		if (currentCol == closestCol && currentRow > closestRow)
			move = eMove.UP;
		if (currentRow > closestRow && currentCol < closestCol) {
			move = eMove.UP_RIGHT;
		}
		if (currentRow < closestRow && currentCol < closestCol) {
			move = eMove.DOWN_RIGHT;
		}
		if (currentRow > closestRow && currentCol > closestCol) {
			move = eMove.UP_LEFT;
		}
		if (currentRow < closestRow && currentCol > closestCol) {
			move = eMove.DOWN_LEFT;
		}

		System.out.println(move);

		// TO DO: replace with code to adjust move (Step 2)
		if (move == eMove.DOWN_LEFT) {
			if ((currentRow + 1 > field.length - 1) || (currentCol - 1 < 0)
					|| (field[currentRow + 1][currentCol - 1] == 'D')
					|| (field[currentRow + 1][currentCol - 1] == 'T')
					|| (field[currentRow + 1][currentCol - 1] == 'F')) {
				move = eMove.LEFT;
			}
		}

		if (move == eMove.LEFT) {
			if ((currentCol - 1 < 0)
					|| (field[currentRow][currentCol - 1] == 'D')
					|| (field[currentRow][currentCol - 1] == 'T')
					|| (field[currentRow][currentCol - 1] == 'F')) {
				move = eMove.UP_LEFT;
			}
		}

		if (move == eMove.UP_LEFT) {
			if ((currentRow - 1 < 0) || (currentCol - 1 < 0)
					|| (field[currentRow - 1][currentCol - 1] == 'D')
					|| (field[currentRow - 1][currentCol - 1] == 'T')
					|| (field[currentRow - 1][currentCol - 1] == 'F')) {
				move = eMove.UP;
			}
		}

		if (move == eMove.UP) {
			if ((currentRow - 1 < 0)
					|| (field[currentRow - 1][currentCol] == 'D')
					|| (field[currentRow - 1][currentCol] == 'T')
					|| (field[currentRow - 1][currentCol] == 'F')) {
				move = eMove.UP_RIGHT;
			}
		}

		if (move == eMove.UP_RIGHT) {
			if ((currentRow - 1 < 0) || (currentCol + 1 > field[0].length - 1)
					|| (field[currentRow - 1][currentCol + 1] == 'D')
					|| (field[currentRow - 1][currentCol + 1] == 'T')
					|| (field[currentRow - 1][currentCol + 1] == 'F')) {
				move = eMove.RIGHT;
			}
		}

		if (move == eMove.RIGHT) {
			if ((currentCol + 1 > field[0].length - 1)
					|| (field[currentRow][currentCol + 1] == 'D')
					|| (field[currentRow][currentCol + 1] == 'T')
					|| (field[currentRow][currentCol + 1] == 'F')) {
				move = eMove.DOWN_RIGHT;
			}
		}

		if (move == eMove.DOWN_RIGHT) {
			if ((currentRow + 1 > field.length - 1)
					|| (currentCol + 1 > field[0].length - 1)
					|| (field[currentRow + 1][currentCol + 1] == 'D')
					|| (field[currentRow + 1][currentCol + 1] == 'T')
					|| (field[currentRow + 1][currentCol + 1] == 'F')) {
				move = eMove.DOWN;
			}
		}

		if (move == eMove.DOWN) {
			if ((currentRow + 1 > field.length - 1)
					|| (field[currentRow + 1][currentCol] == 'D')
					|| (field[currentRow + 1][currentCol] == 'T')
					|| (field[currentRow + 1][currentCol] == 'F')) {
				move = eMove.DOWN_LEFT;
			}
		}

		if (move == eMove.DOWN_LEFT) {
			if ((currentRow + 1 > field.length - 1) || (currentCol - 1 < 0)
					|| (field[currentRow + 1][currentCol - 1] == 'D')
					|| (field[currentRow + 1][currentCol - 1] == 'T')
					|| (field[currentRow + 1][currentCol - 1] == 'F')) {
				move = eMove.NO_MOVE;
			}
		}

		System.out.println(move);

		// TO DO: replace with code to make move (Step 3)
		switch (move) {
		case LEFT:
			currentCol--;
			break;
		case UP_LEFT:
			currentRow--;
			currentCol--;
			break;
		case UP:
			currentRow--;
			break;
		case UP_RIGHT:
			currentRow--;
			currentCol++;
			break;
		case RIGHT:
			currentCol++;
			break;
		case DOWN_RIGHT:
			currentRow++;
			currentCol++;
			break;
		case DOWN:
			currentRow++;
			break;
		case DOWN_LEFT:
			currentRow++;
			currentCol--;
			break;
		}
	}

	//
	// Private Methods, if you need them
	//

}
