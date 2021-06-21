import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Hallows {
	
	private int x;
	private int y;
	private int size;
	
	
	public Hallows(int ax, int ay, int aSize){ //constructor
		x = ax;
		y = ay+500;
		size = aSize*5;
	}
	
	
	
	public void draw(Graphics g) { //draw medthod
		g.drawLine(x, y, x+2*size, y); //triange
		g.drawLine(x, y, x+size, y-size);
		g.drawLine(x+size, y-size, x+(2*size), y);
		
		g.drawOval(x+(size/2), y-size, size, size); //oval
		g.drawLine(x+size, y, x+size, y-size);
	}
	
	public void paintComponent (Graphics g)	{ //paint component
		drawHallows(g);
		
		

	}
	
	public static void drawHallows (Graphics g) { //drawing Hallows
		Hallows symbol = new Hallows(20, 30, 15);
		Hallows mrLewisTattoo = new Hallows(100, 200, 50);
		symbol.draw(g); // draws symbol
		mrLewisTattoo.draw(g); // draws the tattoo	
	}
	

}
