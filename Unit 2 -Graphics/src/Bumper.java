import java.awt.Color;
import java.awt.Graphics;

public class Bumper {
	
	private int x;
	private int y;
	private int width;	
	private int height;
	private Color color;
	
	Bumper() {
		x = 100;
		y = 100;
		width = 50;
		height = 50;
  		color = Color.blue;
	}
	Bumper(int Ax, int Ay, int Awidth, int Aheight, Color color){
		x = Ax;
		y = Ay;
		width = Awidth;
		height = Aheight;
		this.color = color;
	}
	
	public int getX() {
		return x;
	}	
	public int getY() {
		return y;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	public Color getColor() {
		return color;
	}	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	
	
	public void setLocation(int x, int y) {
		this.x = x;
		this.y = y;
	}   
	
	public void draw(Graphics g) {
		g.setColor(getColor());
		g.fillRect(x-(width/2), y-(height/2), width, height);
	} 
	
	
	  /**

     * Returns true if any part of the Ball is inside the bumper

     * @param ball the Ball

     * @return true if any part of the Ball is inside the bumper, false otherwise

     */

     public boolean inBumper(Ball ball) {

           for (int x = getX() - getWidth()/2; x <= getX() + getWidth()/2; x++) {

                  for (int y = getY() - getHeight()/2; y <= getY() + getHeight()/2; y++) {

                        if (getDistance(x, y, ball.getX(), ball.getY()) <= ball.getRadius()) {

                               return true;

                        }

                  }

           }

           return false;

     }

    

     /**

     * Calculates the distance between (x1, y1) and (x2, y2)

     * @param x1 the x-coordinate of the first point

     * @param y1 the y-coordinate of the first point

     * @param x2 the x-coordinate of the second point

     * @param y2 the y-coordinate of the second point

     * @return the distance between (x1, y1) and (x2, y2)

     */

     private double getDistance(double x1, double y1, double x2, double y2) {

           return Math.sqrt(Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2));
     }
     
     
	
	
}
