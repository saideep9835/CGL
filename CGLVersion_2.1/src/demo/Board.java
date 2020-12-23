package demo;

import java.io.*;
import java.util.Scanner;


class Board {

    /**
     * This method creates a board for the CGL.
     * @param n the size of the board.
     * @param liveCells should be marked on the board as true
     */
    int n;
    int[][] liveCells;
    public void createBoard(final int n, int[][] liveCells) {
        // your code goes here...
        this.n=n;
        this.liveCells=liveCells;
        board=new boolean[n][n];
        for(int i=0;i<liveCells[0].length;i++){
            board[liveCells[i][0]][liveCells[i][1]]=true;
        
        }
        printBoard(board);
        // You can call the printBoard that prints the board.

    }

    /**
    * This method prints the CGL board.
    * @param board
    */
    boolean board[][];
    public void printBoard(boolean board[][]) {
        // your code goes here...
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board[0].length-1;j++)
                System.out.print(board[i][j]?"* ":". ");
            System.out.print(board[i][i]?"*":".");
            System.out.println();
        }
    }

    /**
     * This is the main method used to test the code.
     * @param args the command line args.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in); // file to be scanned
        Board c = new Board();
        
        // Reading the first line from the input which is n.
        int n = sc.nextInt();
        
        // Reading the second line from the input which is m.
        int m = sc.nextInt();

        // Reading m liens that has two integers whcih are separated by a space.
        int[][] liveCells = new int[m][2];
        for (int i = 0; i < m; i++) {
            liveCells[i][0] = sc.nextInt();
            liveCells[i][1] = sc.nextInt();
        }

        // invokding the method to create a board. 
        c.createBoard(n, liveCells);

        // Closing the scanner object.
        sc.close();
    }
}