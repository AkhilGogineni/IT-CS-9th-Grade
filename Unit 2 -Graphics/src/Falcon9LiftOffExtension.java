import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

@SuppressWarnings("serial")
public class Falcon9LiftOffExtension extends JPanel {
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 1000;
	private static final double deltatime = 0.1;
	private BufferedImage image;
	private Graphics g;
	private Falcon9 falcon9;
	private Timer timer;
	

	public Falcon9LiftOffExtension() {
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		falcon9 = new Falcon9(WIDTH/2, 750, 30, 90);
		falcon9.setDeltaTime(162);
		falcon9.setAltitude(105041.02035231217);
		falcon9.setVelocity(2112.604240986234);
		falcon9.setInitialMass(96570);
		falcon9.setBurnTime(397);
		falcon9.setFuelConsumption(92670);
		falcon9.setThrust(934000);
		
		timer = new Timer((int)(deltatime*1000), new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				
				
			if(!(falcon9.getDeltaTime() >= 357)) {	
				
				g.setColor(Color.black);
				g.fillRect(0, 0, WIDTH, HEIGHT);
				
				
				falcon9.move(deltatime);
				System.out.println(falcon9.getY());
				falcon9.setY((int)(falcon9.getY()+HEIGHT));
				falcon9.draw(g);
				
				
				g.setColor(Color.white);
				g.setFont(new Font("Default", Font.BOLD, 20));
				g.drawString("Time: " + (float)falcon9.getDeltaTime(), 25, 30);
				g.drawString("Speed: " + (float)falcon9.getVelocity(), 25, 55);
				g.drawString("Altitude: " + (float)falcon9.getAltitude(), 25, 80);
				g.drawString("STAGE 2", 25, 105);
		
				repaint();
				
			}
				
				
		}
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}
	
	public static void main(String[] args) {
		JFrame frame = new JFrame("Falcon9 Launch");
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(300, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new Falcon9LiftOffExtension());
		frame.setVisible(true);
	}

}
