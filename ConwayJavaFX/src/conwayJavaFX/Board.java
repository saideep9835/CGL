package conwayJavaFX;

import java.math.*;

public class Board {
	public int rows;
	public int columns;
	public Cell[][] grid;
	
	public Board(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
		this.grid = new Cell[rows][columns];
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				Cell c = new Cell(i, j, false);
				this.grid[i][j] = c;
			}
		}
	}
	
	public int getAliveNeighbours(Cell c) {
		int count = 0;
        int row_limit = this.rows-1;
        if(row_limit > 0){
            int column_limit = this.columns-1;
            for(int i = Math.max(0, c.x-1); i <= Math.min(c.x+1, row_limit); i++){
                for(int j = Math.max(0, c.y-1); j <= Math.min(c.y+1, column_limit); j++){
                	// System.out.println(i + " " + j);
                    if((i != c.x || j != c.y) && this.grid[i][j].isAlive){
                        count++;
                    }
                }
            }
        }
        return count;
        
        //3 x 3... 2, 2
        // (2,3).....(1,2),(1,3),(1,4)...(2,2),(2,3),(2,4)...(3,2),(3,3),(3,4)
	}
	
	public void createBoard(int l[][]) {
		for(int i=0; i<l.length; i++){
            this.grid[l[i][0]][l[i][1]].isAlive = true;
        }
	}
	
	public void nextGeneration(Board newBoard) {
		// Board newBoard = new Board(this.rows, this.columns);
		for(int i=0; i<this.rows; i++) {
			for(int j=0; j<this.columns; j++) {
				if(this.grid[i][j].isAlive) {
					if(this.getAliveNeighbours(this.grid[i][j])==2 || this.getAliveNeighbours(this.grid[i][j])==3) {
						newBoard.grid[i][j].isAlive = true;
					}
				}else {
					if(this.getAliveNeighbours(this.grid[i][j])==3){
						newBoard.grid[i][j].isAlive = true;
					}
				}
			}
		}
		// this.grid = newBoard.grid;
	}
	
	public String toString() {
		String res = "";
		for(int i=0; i<this.rows; i++){
            int col = this.columns;
            for(int j=0; j<col; j++){
                if(this.grid[i][j].isAlive==false){
                    res += ".";
                }else{
                    res += "*";
                }
            }
            res += "\n";
        }
		return res;
	}
}
	


