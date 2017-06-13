package com.sample.project.GameOfLife;

public class GameOfLife {
	
	public static final int rows = 6;
	public static final int columns = 8;

	public int[][] getNextGeneration(int grid[][]) {
		int[][] futureGeneration = new int[rows][columns];

		for (int rowIndex = 0; rowIndex < rows; rowIndex++) {
			for (int colIndex = 0; colIndex < columns; colIndex++) {
				int aliveNeighbors = findAliveNeighbors(grid, rowIndex, colIndex);	
				
				if (isAliveAndAliveNeighborsLessThanTwo(grid, rowIndex, colIndex, aliveNeighbors))
					markCellDead(futureGeneration, rowIndex, colIndex);
				else if (isAliveAndAliveNeigborsGreaterThan3(grid, rowIndex, colIndex, aliveNeighbors))
					markCellDead(futureGeneration, rowIndex, colIndex);
				else if (isDeadAndAliveNeighborsEqualToThree(grid, rowIndex, colIndex, aliveNeighbors))
					markCellAlive(futureGeneration, rowIndex, colIndex);
				else if (isAliveAndAliveNeighborEqualtoTwoOrThree(grid, rowIndex, colIndex, aliveNeighbors))
					markCellAlive(futureGeneration, rowIndex, colIndex);
				else
					futureGeneration[rowIndex][colIndex] = grid[rowIndex][colIndex];
			}
		}

		return futureGeneration;
	}

	private static boolean isAliveAndAliveNeighborsLessThanTwo(int[][] grid, int l, int m, int aliveNeighbours) {
		return (grid[l][m] == 1) && (aliveNeighbours < 2);
	}

	private static int findAliveNeighbors(int[][] grid, int l, int m) {
		int aliveNeighbours = 0;
		for (int i = -1; i <= 1; i++){
			for (int j = -1; j <= 1; j++){
				if ( handleArrayIndexOutOfBound(l, m, i, j)){
					continue;
				} else {
					aliveNeighbours += grid[l + i][m + j];
				}
				
			}
		}
		aliveNeighbours -= grid[l][m];
		return aliveNeighbours;
	}

	private static boolean handleArrayIndexOutOfBound(int l, int m, int i, int j) {
		return l+i < 0 || m+j <0 || l+i >5 || m+j >7;
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

	private static boolean isAliveAndAliveNeigborsGreaterThan3(int[][] grid, int l, int m, int aliveNeighbours) {
		return (grid[l][m] == 1) && (aliveNeighbours > 3);
	}

}
