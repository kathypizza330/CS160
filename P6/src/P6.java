//P6 project
//Author: Lingyang Zhu
//Date:   Oct. 12, 2015
//Class:  CS160
//Email:  lyzhu@rams.colostate.edu
public class P6 {
	// Class variables
		public static Maze maze;
		public static int mazeWidth;
		public static int mazeHeight;
		public static int ChiCol;
		public static int ChiRow;

		public static void main(String[] args) {

			// Create maze
			String fileName = args[0];
			System.err.println("Maze name: " + fileName);

			// Get dimensions
			maze = new Maze(fileName);
			mazeWidth = maze.getWidth();
			mazeHeight = maze.getHeight();
			System.err.println("Maze width: " + mazeWidth);
			System.err.println("Maze height: " + mazeHeight);
			
			ChiCol = maze.getColumn();
			ChiRow = maze.getRow();

//			// Add code to move around maze
//			maze.moveDown();
//			//maze.moveLeft();
//			maze.moveRight();
//			maze.moveUp();
			
			if (onEdge()==false) {
				loopUp();}
			
			if (ChiRow == 0) {
				loopRight();}
			
			if (ChiCol == mazeWidth-1) {
				loopDown();}
			
			if (ChiRow == mazeHeight -1) {
				loopLeft();}
			
			if (ChiCol == 0) {
				loopUp();}

		}		
			//////////////////////////////////////////////////////
		
	

		
		
			public static boolean onEdge() { // returns true if Chihiro is on any edge, false otherwise
                if ((ChiCol == 0) || (ChiCol == mazeWidth-1) || (ChiRow == 0) || (ChiRow == mazeHeight -1)) 
				return true;
                else
				return false;
			}

			public static void loopLeft(){ // moves Chihiro from the current column to the left edge
				while (ChiCol > 0) {
					maze.moveLeft();
					ChiCol--;
				}
				return;
			}
			
			public static void loopRight(){ // moves Chihiro from the current column to the right edge
				while (ChiCol < mazeWidth-1) {
					maze.moveRight();
					ChiCol++;
				}
				return;
			}
			
			
		    public static void loopUp(){ // moves Chihiro from the current row to the top edge
		    	while (ChiRow > 0) {
		    		maze.moveUp();
		    		ChiRow--;
		    	}
		    	return;
		    }
		    
		    
		    public static void loopDown(){ // moves Chihiro from the current row to the bottom edge
		    	while (ChiRow < mazeHeight -1) {
		    		maze.moveDown();
		    		ChiRow++;
		    	}
		    	return;
		    }
		

		
  }
