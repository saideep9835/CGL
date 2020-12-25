package demo;
import java.io.*;
import java.util.Scanner;
import java.lang.reflect.Array;

//Took reference from geeksforgeeks and youtube

public class Board {
	private int size;
	private int cell;
	private int row;
	private int column;
	private boolean[][] array;
//creating arrays  with the given size
//using rows and columns to create board
	
	
//creating a board	
public Board(int size, int[][] cell) {
		this.size= size;
		this.array=new boolean[size][size];
		
	}
//creating a board
public boolean[][] createBoard(int n, int l[][]) {
 //   boolean[][] board = new boolean[n][n];
    for (int i = 0; i < l.length; i++) {
        int row= l[i][0];
        int column= l[i][1];
        this.array[row][column]= true;
    }
    	return array;

}

//print board by using string buffer
public String  printBoard(boolean board[][]) {
    StringBuffer output = new StringBuffer();
    for(int i=0; i<board.length; i++){
        for(int j =0; j<board.length; j++){
            if(board[i][j])
                output.append("*");                            
            else
                output.append(".");                             
        }output.append("\n");                                   
   
    }
    return(output.toString());
    }

// checking for live cells
public int livecells(boolean[][] currentgeneration, int p, int q ){
        int n= currentgeneration.length;
        int lives = 0;
        for (int i = p-1; i <=p+1; i++) {
            for (int j = q-1; j <=q+1; j++) {
                if(i!=p || j!=q){
                    if(i>=0 && i<n && j>=0 && j< n && currentgeneration[i][j]){
                        lives+=1;
                    }
                }

                
            }

        }
    return lives;    
    }
   // generate next generation 
    public void generateNextGeneration(boolean board[][]) {
        boolean[][] board1= new boolean[board.length][board.length];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                int alive= livecells(board, i, j); 
                if(board[i][j])
                {             
                    if(alive<2){
                    board1[i][j]= false;
                }
                else if (alive<=3){
                    board1[i][j]= true;
                }
                else if(alive>3){
                    board1[i][j]= false;
                }
                }
                else{
                    if(alive==3){
                        board1[i][j]= true;
                    }
                }
            }
            
        }
    printBoard(board1);    
}
}
 