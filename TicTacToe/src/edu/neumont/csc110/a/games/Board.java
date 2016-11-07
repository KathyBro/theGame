package edu.neumont.csc110.a.games;

public class Board {
	
	public void printTheBoard() {
		
		char[][] gameBoard = new char[5][5];
		
		//filling the vertical
		for(int e=0; e<5; e++) { //so that it will go down the rows
			for(int i=0; i<5; i++) { //so that it will go down the columns
				if((i==1) || (i==3)) { //so it only fills those columns with |
					gameBoard[e][i] = '|';
				}
			}
		}
		
		//filling the horizontal
		for(int j=0; j<5; j++) { //to go down the rows
			if((j==1) || (j==3)) { //so that __ will only go in those rows
				for(int a=0; a<5; a++) { //to go across the columns
					gameBoard[j][a] = '_';
				}
			}
		}
		
		//to actually print the board
		for(int b=0; b<5; b++) {
			for(int c=0; c<5; c++) { //so that the columns will print out first and then it will continue
									//the rows
				System.out.print(gameBoard[b][c]);
			}
			System.out.println();
		}
	}
	
	
}
