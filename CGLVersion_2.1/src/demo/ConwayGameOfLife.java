package demo;
import java.util.Scanner;

public class ConwayGameOfLife extends Board {

    /**
     * Creates initial genration [borad]
     * @param n  size of the board n X n
     * @param l[][]  array of live cells
     */
    public boolean[][] createBoard(int n, int l[][]) {
    }

    /**
     * Check for the writeup on how to print the board.
     * @param board[][]
     * @param n
     * @return
     */
    public void printBoard(boolean board[][]) {
    }

    /**
     * Method to gerate a next generation. Call the printBoard
     * to print the next generation.
     * 
     * @param board[][] board
     * 
     */
    public void generateNextGeneration(boolean board[][]) {
    }

    /**
     * Do not modify this main Method.
     * 
     * @param args
     * @return
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Reading size of the Board
        int n = sc.nextInt();
        
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
        int i = 0;
        
        // Reading Live cells
        while (sc.hasNextInt()) {
            l[i][0] = sc.nextInt();
            l[i++][1] = sc.nextInt();
        }
        
        // creating instance to CGLVersion2
        ConwaysGameOfLife c = new ConwaysGameOfLife();
        
        // creating nextgenratin by calling nextgenration method
        c.generateNextGeneration(c.createBoard(n, l));
        sc.close();
    }

}
