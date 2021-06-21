import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class GravityBallAnimation extends JPanel {

	//set the initial width and height of your image
	private static final int WIDTH = 1200;
	private static final int HEIGHT = 1000;
	private static final int deltaTime = 10;

	//required global variables (initialize these in the constructor) 
	private BufferedImage image;
	private Graphics g;
	public Timer timer;
	private GravityBall Ball; //change this to whatever object(s) you are animating


	//Constructor required by BufferedImage
	public GravityBallAnimation() {
		//set up Buffered Image and Graphics objects
		image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		
		
		Ball = new GravityBall(200, 850, 50, Color.WHITE);
		Ball.setXAccel(0);
		Ball.setYAccel(9.8);
		Ball.setInitialVelocity(10, 45);
		
		
		
		//set up and start the Timer
		timer = new Timer((int)deltaTime, new TimerListener());
		timer.start();

	}
	
	//TimerListener class that is called repeatedly by the timer
	private class TimerListener implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			
			Ball.launch(WIDTH,HEIGHT,deltaTime);
			Ball.draw(g);
			
			g.setColor(Color.RED);
			g.drawString("x: " + (float)Ball.getX(), 10, 30);
			g.drawString("y: " + (float)Ball.getY(), 10, 50);
			g.drawString("xSpeed: " + (float)Ball.getX(), 10, 70);
			g.drawString("ySpeed: " + (float)Ball.getX(), 10, 90);
			
			//used float to reduce amount of decimal places
			System.out.println(deltaTime);
			repaint();
		}
		
	}

	//do not modify this
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	//main method with standard graphics code
	public static void main(String[] args) {
		JFrame frame = new JFrame("Animation Shell");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(0, 0);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new GravityBallAnimation()); //TODO: Change this to the name of your class!
		frame.setVisible(true);
	}

}

