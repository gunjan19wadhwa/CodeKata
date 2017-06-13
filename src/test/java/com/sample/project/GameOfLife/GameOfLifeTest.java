package com.sample.project.GameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void nextGenRandom() {
		int[][] input = { { 0, 0, 0, 0, 0, 0, 1, 0 }, 
				          { 1, 1, 1, 0, 0, 0, 1, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 1, 0 },
				          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 0, 0, 1, 1, 0, 0, 0 }, 
				          { 0, 0, 0, 1, 1, 0, 0, 0 } 
				         };

		int[][] expectedNextGeneration = { { 0, 1, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 1, 0, 0, 0, 1, 1, 1 },
				                           { 0, 1, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 1, 1, 0, 0, 0 },
				                           { 0, 0, 0, 1, 1, 0, 0, 0 } 
				                          };

		GameOfLife game = new GameOfLife();
		int[][] actualNextGeneration = game.getNextGeneration(input);

		assertArrayEquals(expectedNextGeneration, actualNextGeneration);
	}

	@Test
	public void nextGenAllDead() {
		int[][] input = { { 1, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 1, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 0 },
				          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 1, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 1 } 
				         };

		int[][] expectedNextGeneration = { { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 },
				                           { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 },
				                           { 0, 0, 0, 0, 0, 0, 0, 0 } 
				                          };

		GameOfLife game = new GameOfLife();
		int[][] actualNextGeneration = game.getNextGeneration(input);

		assertArrayEquals(expectedNextGeneration, actualNextGeneration);
	}
	
	@Test
	public void nextGenAllDeadIfCornerCellsAreAlive() {
		int[][] input = { { 1, 0, 0, 0, 0, 0, 0, 1 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 0 },
				          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 1, 0, 0, 0, 0, 0, 0, 1 } 
				         };

		int[][] expectedNextGeneration = { { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 },
				                           { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				                           { 0, 0, 0, 0, 0, 0, 0, 0 },
				                           { 0, 0, 0, 0, 0, 0, 0, 0 } 
				                          };

		GameOfLife game = new GameOfLife();
		int[][] actualNextGeneration = game.getNextGeneration(input);
		
		assertArrayEquals(expectedNextGeneration, actualNextGeneration);
	}
	
	@Test
	public void nextGenAllRandom() {
		int[][] input = { { 1, 0, 0, 0, 0, 0, 0, 1 }, 
				          { 0, 1,1, 1, 1, 1, 1, 1 }, 
				          { 0, 0, 0, 0, 0, 0, 0, 0 },
				          { 1, 0, 0, 0, 0, 0, 0, 0 }, 
				          { 1, 1, 1, 1, 1, 1, 1, 1 }, 
				          { 0, 0, 0, 0, 0, 0, 1, 0 } 
				         };

		int[][] expectedNextGeneration = { { 0, 1, 1, 1, 1, 1, 0, 1 }, 
				                           { 0, 1, 1, 1, 1, 1, 1, 1 },
				                           { 0, 1, 1, 1, 1, 1, 1, 0 }, 
				                           { 1, 0, 1, 1, 1, 1, 1, 0 }, 
				                           { 1, 1, 1, 1, 1, 1, 1, 1 },
				                           { 0, 1, 1, 1, 1, 0, 1, 1 } 
				                          };

		GameOfLife game = new GameOfLife();
		int[][] actualNextGeneration = game.getNextGeneration(input);
		
		
			int row = 6, col = 8;
			for (int i = 0; i < row; i++) {
				for (int j = 0; j < col; j++) {
					if (actualNextGeneration[i][j] == 0)
						System.out.print(".");
					else
						System.out.print("o");
				}
				System.out.println();
			}
		
		assertArrayEquals(expectedNextGeneration, actualNextGeneration);
	}
}
