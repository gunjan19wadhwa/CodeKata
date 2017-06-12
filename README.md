# CodeKata
This is a simple Game Of Life java project implemented using maven. 

The Game of Life, is a cellular automation simulation invented by the British mathematician
John Horton Conway in 1970. For more background information, see https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life

# Rules of the Game
The board (or playing field) for the Game of Life is a two dimensional grid of cells. Each cell is
considered to be either “alive” or “dead”. The next generation of the grid is calculated using
these rules:

1. Any live cell with fewer than two live neighbors dies, as if caused by under
population.
2. Any live cell with more than three live neighbors dies, as if by overcrowding.
3. Any live cell with two or three live neighbors lives on to the next generation.
4. Any dead cell with exactly three live neighbors becomes a live cell.
5. A cell’s neighbors are those cells which are horizontally, vertically or
diagonally adjacent. Most cells will have eight neighbors. Cells placed on the
edge of the grid will have fewer.

The program is not a recursive Game of Life program.
The program just correctly finds the one next generation of life. 
In this program 0 represents dead cells and 1 represents alive cells.

# Project Structure 

CodeKata
│   README.md
│   pom.xml   
│
└───src/main/java
|	|___com.sample.project.GameOfLife
│   	|
|	 	|__	GameOfLife.java
│   
└───src/test/java
    │__com.sample.project.GameOfLife
       |
       |__GameOfLifeTest.java
       
 # Run Program
  The program is not an executable and is only to demonstrate how to get next generation in Game of Life. 
  Correctness of program is determined by test cases. Please follow run test instruction to run test cases.

# Run Test Cases

The Program is not a executable. It just shows how to calculate the next generation of game of life usin

Maven should be pre-installed to run test cases. Please find the link below to install maven
https://maven.apache.org/install.html

