package demo;
import java.util.Scanner;

class ConwaysGameOfLife {

 
    public boolean[][] createBoard(int n, int l[][]) {
        boolean[][] board=new boolean[n][n];
        for(int i=0;i<l.length;i++){

         int row=l[i][0];
         int col=l[i][1];
         board[row][col]=true;
        }
    
    // You can call the printBoard that prints the board.

    System.out.println("CurrentGenration");
    printBoard(board);
    System.out.println("NextGenration");
    return board;
    }

    /**
     * Check for the writeup on how to print the board.
     * @param board[][]
     * @param n
     * @return
     */
    public void printBoard(boolean board[][]) {
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                //System.out.print(board[i][j]+" ");
                if(board[i][j])
                    sb.append("*");
                else
                    sb.append(".");
                
            }
            sb.append("\n");
        }
        System.out.print(sb.toString());
    }

    /**
     * Method to gerate a next generation. Call the printBoard
     * to print the next generation.
     * 
     * @param board[][] board
     * 
     */
    public int countLiveCells(boolean[][] current,int p,int q){
        int n = current.length;
        int lives=0;
        for(int i=p-1;i<=p+1;i++){
            for(int j=q-1;j<=q+1;j++){
                if(i!=p || j!=q){
                    if(i>=0 && i<n && j>=0 && j<n && current[i][j]){
                        lives+=1;
                    }
                }
            }
        }
        return lives;
    }
    public void generateNextGeneration(boolean current[][]) {
        int n = current.length;
        boolean[][] newBoard = new boolean[n][n];
       // lives = 3;
       // board = createBoard(n,l);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int ilives = countLiveCells(current,i,j);

                if(current[i][j]){
                    if(ilives<2){ 
                        newBoard[i][j]=false;
                    }else if(ilives<=3){
                        newBoard[i][j]=true;
                    }else if(ilives>3){
                        newBoard[i][j]=false;
                    }
                }
                else{
                    if(ilives==3){
                        newBoard[i][j] = true;
                    }
                }
                
                
            }
        }
        printBoard(newBoard);
        



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
