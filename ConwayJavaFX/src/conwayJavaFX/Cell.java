package conwayJavaFX;

public class Cell {
	public int x;
	public int y;
	public boolean isAlive;
	
	public Cell(int x, int y, boolean isAlive) {
		this.x=x;
		this.y=y;
		this.isAlive = isAlive;
	}
	public String toString() {
		if(this.isAlive) {
			return "Cell at " + this.x + "," + this.y + " is alive.";
			
		}
		return "Cell at " + this.x + "," + this.y + " is dead."; 
	}
	
	

}

