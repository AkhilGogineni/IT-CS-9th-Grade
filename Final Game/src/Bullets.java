import java.awt.Color;
import java.awt.Graphics;

public class Bullets {

	//class fields
	private int x;
	private int y;
	private double radius;
	private int diameter;
	private int xSpeed;
	private int ySpeed;
	
	
	//Constructors
	public Bullets() {
		x = 100;
		y = 100;
		radius = 25;
		diameter = 25;
		xSpeed = 2;
		ySpeed = 3;
	}
	
	public Bullets (int ax, int ay, int axSpeed, int aySpeed) {
		x = ax;
		y = ay;
		radius = 2.5;
		diameter = 5;
		xSpeed = axSpeed;
		ySpeed = aySpeed;
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
		
		
		public void draw(Graphics g) {
			g.setColor(Color.green);
			g.fillOval((int) x - (int) radius, (int) y - (int) radius, (int) diameter, (int) diameter);		
		}
		
		
		public double findDistanceFrom(double x, double y) {
			double xDist = Math.abs(x - this.getX());
			double yDist = Math.abs(y - this.getY());
			
			double dist = Math.sqrt(Math.pow(xDist, 2) + Math.pow(yDist, 2));
			return dist;
		}
		
		public boolean hit(Plane plane) {
			if(findDistanceFrom(plane.getX(),plane.getY()) <= plane.getWidth()/2+radius) {
				return true;
			} else {
				return false;
			}
		}
		public void move(int rightEdge, int bottomEdge) {
			x += xSpeed;
			y += ySpeed;
			
			//will remove bullets from screen after leaving the screen
			if(x >= rightEdge) {
				x = rightEdge + 200;
				xSpeed = 0;
				ySpeed = 0;
			} else if(y >= bottomEdge) {
				x = rightEdge + 200;
				xSpeed = 0;
				ySpeed = 0;
			} else if(x <= 0) {
				x = rightEdge + 200;
				xSpeed = 0;
				ySpeed = 0;
			} else if(y <= 0) {
				x = rightEdge + 200;
				xSpeed = 0;
				ySpeed = 0;
			}
		}
		
		
	
}
