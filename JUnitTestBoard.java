package demo;
import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;




class TestJunit {

	@Test
	 public void testCGLOne() {
	 Board b = new Board();
	 System.out.println("----TEST ONE EXECUTED----");
	 System.out.println(b.printBoard(null)); 
	 Assertions.assertEquals("Board is printed",b.printBoard(null));
	}

	 @Test
	 public void testCGLTwo() {
	 Board b = new Board();
	 System.out.println("----TEST TWO EXECUTED----");
	 Assertions.assertSame(false,b.createboard(-5,null));
	 
	 
	 }
	@Test
	 public void testCGLThree() {
	 Board b = new Board();
	 System.out.println("----TEST THREE EXECUTED----");
	 Assertions.assertSame(true,b.createboard(5,null));
	 }
	@Test
	public void testCGLFour() {
		Board b = new Board();
		System.out.println("----TEST FOUR EXECUTED----");
		int [][] i = {{1,1},{2,2},{3,3},{4,4}};
		Assertions.assertSame(true, b.createboard(5,i));
	}
	@Test
	public void testCGLFive() {
		cell c = new cell();
		System.out.println("----TEST FIVE EXECUTED----");
		Assertions.assertSame(null,c.nextgen(null));
	}
	@Test
	public void testCGLSix() {
		cell c = new cell();
		System.out.println("----TEST SIX EXECUTED----");
		Assertions.assertSame(0,c.countlivecells(4,4,null));
	}
	@Test
	public void testCGLSeven() {
		cell c = new cell();
		boolean [][]b={{false,false,false,false,false},{false,true,false,false,false},{false,false,true,false,false},{false,false,false,true,false},{false,false,false,false,true}};
	    boolean [][]s=c.nextgen(b);
	    System.out.println("----TEST SEVEN EXECUTED----");
	    Assertions.assertSame(true,s[2][2]);
	}
	@Test
	 public void testCGLEIGHT() {
	 System.out.println("======TEST EIGHT EXECUTED=======");
	 conwaysgameoflife c=new conwaysgameoflife();
	 Assertions.assertEquals("Board and next generation is created",c.sample());
	}  
	
}
