import java.awt.Color;
import java.awt.Graphics;

public class Plane {

	//class fields
	private int x;
	private int y;
	private int width;
	private int height;
	private int xSpeed;
	private int ySpeed;
	private int angle;
	
     
	//default constructor
	public Plane() {
		x = 0;
		y = 0;
		width = 50;
		height = 50;
		xSpeed = 0;
		ySpeed = 0;
	}
	//custom constructor
	public Plane(int ax, int ay, int xSpeeda, int ySpeeda) {
		x = ax;
		y = ay;
		width = 50;
		height = 50;
		xSpeed = xSpeeda;
		ySpeed = ySpeeda;

	}
	
	//getters and setters
	public int getX() {
		return x;
	}	
	public int getY() {
		return y;
	}
	public int getXSpeed() {
		return xSpeed;
	}	
	public int getYSpeed() {
		return ySpeed;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setXSpeed(int xSpeed) {
		this.xSpeed = xSpeed;
	}
	public void setYSpeed(int ySpeed) {
		this.ySpeed = ySpeed;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	//draw and other methods
	public void drawR(Graphics g) {
		int[] xPoints = {x-width/2, x+width/2, x+width/2};
		int[] yPoints = {y, y-height/2, y+height/2};
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, xPoints.length);
		
		g.setColor(Color.GRAY);
		//g.fillRect(x, y-height/2, width/3, height);
		int[] xPoints1 = {x+width/4, x+width/2, x+width/2};
		int[] yPoints1 = {y, y-height/5, y+height/5};
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
	}
	
	public void drawL(Graphics g) {
		int[] xPoints = {x-width/2, x-width/2, x+width/2};
		int[] yPoints = {y-height/2, y+height/2, y};
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, xPoints.length);
		
		g.setColor(Color.GRAY);
		//g.fillRect(x, y-height/2, width/3, height);
		int[] xPoints1 = {x-width/2, x-width/2, x-width/4};
		int[] yPoints1 = {y-height/5, y+height/5, y};
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
	}
	
	public void drawN(Graphics g) {
		int[] xPoints = {x, x-width/2, x+width/2};
		int[] yPoints = {y-height, y+height/2, y+height/2};
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, xPoints.length);
		
		g.setColor(Color.GRAY);
		//g.fillRect(x, y-height/2, width/3, height);
		int[] xPoints1 = {x, x-width/4, x+width/4};
		int[] yPoints1 = {y, y+height/2, y+height/2};
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
	}
	
	public void drawS(Graphics g) {
		int[] xPoints = {x, x-width/2, x+width/2};
		int[] yPoints = {y+height, y-height/2, y-height/2};
		g.setColor(Color.BLACK);
		g.fillPolygon(xPoints, yPoints, xPoints.length);
		
		g.setColor(Color.GRAY);
		//g.fillRect(x, y-height/2, width/3, height);
		int[] xPoints1 = {x, x-width/4, x+width/4};
		int[] yPoints1 = {y, y-height/2, y-height/2};
		g.fillPolygon(xPoints1, yPoints1, xPoints1.length);
	}
	
	
	 
	
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	
}
