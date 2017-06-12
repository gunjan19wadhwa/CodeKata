package com.sample.project.GameOfLife;

import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {

	@Test
	public void CheckRandomInput(){
		int [][]input = { { 0, 0, 0, 0, 0, 0, 1, 0 }, 
				   { 1, 1, 1, 0, 0, 0, 1, 0 }, 
				   { 0, 0, 0, 0, 0, 0, 1, 0 },
				   { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				   { 0, 0, 0, 1, 1, 0, 0, 0 },
				   { 0, 0, 0, 1, 1, 0, 0, 0 } 
				  }; 
		
		int [][] expectedNextGeneration = { { 0, 1, 0, 0, 0, 0, 0, 0 }, 
				   { 0, 1, 0, 0, 0, 1, 1, 1 }, 
				   { 0, 1, 0, 0, 0, 0, 0, 0 },
				   { 0, 0, 0, 0, 0, 0, 0, 0 }, 
				   { 0, 0, 0, 1, 1, 0, 0, 0 },
				   { 0, 0, 0, 1, 1, 0, 0, 0 } 
				  };
		
		GameOfLife game = new GameOfLife();
		int [][]actualNextGeneration = game.getNextGeneration(input);
		
		assertArrayEquals(expectedNextGeneration, actualNextGeneration);
	}
}
