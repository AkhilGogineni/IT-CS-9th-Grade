import java.awt.Color;
import java.awt.Graphics;

public class GravityBall extends Ball{
	private double xAcceleration;
	private double yAcceleration;
	
	
	GravityBall(double x, double y, double diameter, Color color){
		super(x, y, diameter, color);
	}
	
	public double getXAccel() {
		return xAcceleration;
	}
	public double getYAccel() {
		return yAcceleration;
	}
	public void setXAccel(double xAcceleration) {
		this.xAcceleration = xAcceleration;
	}
	public void setYAccel(double yAcceleration) {
		this.yAcceleration = yAcceleration;
	}
	
	
	public void setInitialVelocity(int speed, int angle){
		setXSpeed(Math.cos(Math.toRadians(angle))*speed);
		setYSpeed(Math.sin(Math.toRadians(angle))*speed);
	}
	
	public void launch(int rightEdge, int bottomEdge, double deltaTime) {
		
		setXSpeed(getXSpeed() + xAcceleration * deltaTime/1000);
		setYSpeed(getYSpeed() + yAcceleration * deltaTime/1000);
		
		setX(getX()+getXSpeed());
		setY(getY()+getYSpeed());
		
		System.out.println(getYSpeed());
		if((getX() + getRadius()) >= rightEdge) {
			setXSpeed(getXSpeed() * -1);
		} else if((getY() + getRadius()) >= bottomEdge) {
			setYSpeed(getYSpeed() * -1);
			setY(bottomEdge - getRadius());
		} else if((getX() - getRadius()) <= 0) {
			setXSpeed(getXSpeed() * -1);
		} else if((getY() - getRadius()) <= 0) {
			setYSpeed(getYSpeed() * -1);
		} 
	}
}
