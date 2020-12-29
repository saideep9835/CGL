package demo;



//Took reference from geeksforgeeks 

import java.util.Scanner;
public class ConwayGameOfLife { // The game starts from hear.


	public String sample() // when ever you call sample method, it read the inputs from user that is size of board and live cells in a board.
	{
		Board b=new Board(); // object for board.
        Scanner sc = new Scanner(System.in);
       
        // Reading size of the Board
        int n = sc.nextInt();  
       
        // Reading no. of initial live cells
        int m = sc.nextInt();
        int[][] l = new int[m][2];
       
         
        // Reading Live cells
        for (int i = 0; i < m; i++) {
            l[i][0] = sc.nextInt();  
            l[i][1] = sc.nextInt();
        }
     
        System.out.println( b.createboard(n, l)); // calling createboard method in board using object.
   
        sc.close();
return "Board and next generation is created";
         
       

}  

}
