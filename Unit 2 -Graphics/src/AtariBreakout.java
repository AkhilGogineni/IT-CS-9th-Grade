import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class AtariBreakout extends JPanel {

	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;
	private static final Color LIGHT_BLUE = new Color(108, 210, 247);
	
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	
	// declare stuff
	private Ball ball;
	List<Bumper> bumperRow1 = new ArrayList<Bumper>();
	List<Bumper> bumperRow2 = new ArrayList<Bumper>();
	List<Bumper> bumperRow3 = new ArrayList<Bumper>();
	
	public AtariBreakout() {
		
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		g.setColor(LIGHT_BLUE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		// instantiate stuff
		ball = new Ball(500, 900, 75, Color.BLACK);
		ball.setRandomSpeed(6);
		
		for(int i = 0; i<=5; i++) {
			bumperRow1.add(new Bumper(100+200*i, 100, 190, 90, Color.RED));
		}
		for(int i = 0; i<=5; i++) {
			bumperRow2.add(new Bumper(100+200*i, 200, 190, 90, Color.GREEN));
		}
		for(int i = 0; i<=5; i++) {
			bumperRow3.add(new Bumper(100+200*i, 300, 190, 90, Color.BLUE));
		}
		
		timer = new Timer(50, new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {

			// draw background / clear screen
			g.setColor(LIGHT_BLUE);
			g.fillRect(0, 0, WIDTH, HEIGHT);

			// move stuff / update locations
			ball.move(WIDTH, HEIGHT);
			
			//boxes
			for(int i = 0; i<bumperRow1.size(); i++) {
				if(bumperRow1.get(i).inBumper(ball)){
					BumperCollision.collide(bumperRow1.get(i), ball);
					bumperRow1.get(i).setX(WIDTH*2);
				}
				bumperRow1.get(i).draw(g);
			}
			for(int i = 0; i<bumperRow3.size(); i++) {
				if(bumperRow3.get(i).inBumper(ball)){
					BumperCollision.collide(bumperRow3.get(i), ball);
					bumperRow3.get(i).setX(WIDTH*2); //setting the width and height to 0 still let the ball bounce off them somehow so just moved it out the frame entirely
				}
				bumperRow3.get(i).draw(g);
			}
			for(int i = 0; i<bumperRow2.size(); i++) {
				if(bumperRow2.get(i).inBumper(ball)){
					BumperCollision.collide(bumperRow2.get(i), ball);
					bumperRow2.get(i).setX(WIDTH*2);			
				}
				bumperRow2.get(i).draw(g);
			}
			// draw stuff
			ball.draw(g);
			
			
			repaint();
		}
		
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Ripoff Atari Breakout");
		frame.setSize(1200, 900);
		frame.setLocation(200, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new AtariBreakout());
		frame.setVisible(true);
	}
}