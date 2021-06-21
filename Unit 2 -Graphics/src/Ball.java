import java.awt.Color;
import java.awt.Graphics;

public class Ball {

	// 1. Declaration of Variables
	
	private double x;			//x-coordinate of the center of the ball
	private double y;			//y-coordinate of the center of the ball
	private double diameter;	//diameter of the ball 
	private double radius;		//radius of the ball = diameter/2
	private Color color;		//color of the ball
	private double xSpeed;		//x-speed = change in x-position
	private double ySpeed;		//y-speed = change in y-position
	
	
	
	// 2. Create a default constructor
	/**
	 * Default Constructor
	 * Creates a red ball at (0, 0) with a diameter of 25.  
	 * The default speed is 0.
	 */
	public Ball() {
		x = 0;
		y = 0;
		diameter = 25;
		radius = diameter/2;
		xSpeed = 0;
		ySpeed = 0;
		color = color.RED;
		
	}

	// 3. Write a constructor that allows the user to input the parameters (x, y, diameter, Color)
	// and sets the x and y-speed = 0.  Comment with javadoc.
	public Ball(double Ax, double Ay, double Adiam, Color Acolor) {
		x = Ax;
		y = Ay;
		diameter = Adiam;
		radius = diameter/2;
		xSpeed = 0;
		ySpeed = 0;
		color = Acolor;
	}




	// 4. Create getters and setters for all private variables
	// Comment with javadoc
	
		public double getX() {
			return x;
		}	
		public double getY() {
			return y;
		}
		
		public double getDiameter()	{
			return diameter;
		}	
		public double getRadius() {
			return radius;
		}
		public Color getColor() {
			return color;
		}	
		public double getXSpeed() {
			return xSpeed;
		}	
		public double getYSpeed() {
			return ySpeed;
		}
		public void setX(double x) {
			this.x = x;
		}
		public void setY(double y) {
			this.y = y;
		}
		public void setDiameter(double diameter) {
			this.diameter = diameter;
			this.radius = diameter/2;
		}
		public void setRadius(double radius) {
			this.radius = radius;
			this.diameter = radius * 2;
		} 
		public void setColor(Color color) {
			this.color = color;
		}
		public void setXSpeed(double xSpeed) {
			this.xSpeed = xSpeed;
		}
		public void setYSpeed(double ySpeed) {
			this.ySpeed = ySpeed;
		}
	
	
	// 5. Finish the following methods
	// 6. Test using BouncingBallTester.java
	/**
	 * Comment...
	 * @param g
	 */
	public void draw(Graphics g) {
		g.setColor(color);
		g.fillOval((int) x - (int) radius, (int) y - (int) radius, (int) diameter, (int) diameter);
		
	}
	
	
	
	/**
	 * Sets the center location of the ball
	 * @param xe
	 * @param y
	 */
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	
	/**
	 * Generates a speed between -<code>maxSpeed<code>
	 * and <code>maxSpeed<code>
	 * @param maxSpeed
	 */
	public void setRandomSpeed(double maxSpeed) {
		this.xSpeed = (Math.random() * maxSpeed * 2) * -maxSpeed;
		this.ySpeed = (Math.random() * maxSpeed * 2) * -maxSpeed;
	}

	
	//7. Write the move method to make the ball move around the screen
	// and bounce of the edges.
	/**
	 * Comment....
	 * @param rightEdge
	 * @param bottomEdge
	 */
	public void move(int rightEdge, int bottomEdge) {
		x += xSpeed;
		y += ySpeed;
		
		if(x >= rightEdge) {
			xSpeed = xSpeed * -1;
		} else if(y >= bottomEdge) {
			ySpeed = ySpeed * -1;
		} else if(x <= 0) {
			xSpeed = xSpeed * -1;
		} else if(y <= 0) {
			ySpeed = ySpeed * -1;
		}
		
	}
}

