package com.sample.project.GameOfLife;

public class GameOfLife {
	
	public static final int row = 6;
	public static final int col = 8;

	public int[][] getNextGeneration(int grid[][]) {
		int[][] futureGeneration = new int[row][col];

		for (int l = 0; l < row; l++) {
			for (int m = 0; m < col; m++) {
				int aliveNeighbors = findAliveNeighbors(grid, l, m);	
				
				if (isAliveAndAliveNeigborsLessThanTwo(grid, l, m, aliveNeighbors))
					markCellDead(futureGeneration, l, m);
				else if (ifIsAliveAndAliveNeigborsGreaterThan3(grid, l, m, aliveNeighbors))
					markCellDead(futureGeneration, l, m);
				else if (isDeadAndAliveNeighborsEqualToThree(grid, l, m, aliveNeighbors))
					markCellAlive(futureGeneration, l, m);
				
				else if (isAliveAndAliveNeighborEqualtoTwoOrThree(grid, l, m, aliveNeighbors))
					markCellAlive(futureGeneration, l, m);
			
				else
					futureGeneration[l][m] = grid[l][m];
			}
		}

		return futureGeneration;
	}

	private static boolean isAliveAndAliveNeigborsLessThanTwo(int[][] grid, int l, int m, int aliveNeighbours) {
		return (grid[l][m] == 1) && (aliveNeighbours < 2);
	}

	private static int findAliveNeighbors(int[][] grid, int l, int m) {
		int aliveNeighbours = 0;
		for (int i = -1; i <= 1; i++){
			for (int j = -1; j <= 1; j++){
				if ( l+i < 0 || m+j <0 || l+i >5 || m+j >7){
					continue;
				} else {
					aliveNeighbours += grid[l + i][m + j];
				}
				
			}
		}
		aliveNeighbours -= grid[l][m];
		return aliveNeighbours;
	}

	private static int markCellAlive(int[][] future, int l, int m) {
		return future[l][m] = 1;
	}

	private static void markCellDead(int[][] future, int l, int m) {
		future[l][m] = 0;
	}

	private static boolean isAliveAndAliveNeighborEqualtoTwoOrThree(int[][] grid, int l, int m, int aliveNeighbours) {
		return ((grid[l][m] == 1)) && (aliveNeighbours == 2 || aliveNeighbours == 3);
	}

	private static boolean isDeadAndAliveNeighborsEqualToThree(int[][] grid, int l, int m, int aliveNeighbours) {
		return (grid[l][m] == 0) && (aliveNeighbours == 3);
	}

	private static boolean ifIsAliveAndAliveNeigborsGreaterThan3(int[][] grid, int l, int m, int aliveNeighbours) {
		return (grid[l][m] == 1) && (aliveNeighbours > 3);
	}

}
