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
public class Falcon9LiftOff extends JPanel {
	
	private static final int WIDTH = 800;
	private static final int HEIGHT = 1000;
	private static final double deltatime = 0.1;
	private BufferedImage image;
	private Graphics g;
	private Falcon9 falcon9;
	private Timer timer;
	

	public Falcon9LiftOff() {
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		falcon9 = new Falcon9(WIDTH/2, 750, 30, 90);
		
		
		timer = new Timer((int)(deltatime*1000), new TimerListener());
		timer.start();
	}
	
	private class TimerListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
				if(!(falcon9.getDeltaTime() >= 162)) {
					g.setColor(Color.black);
					g.fillRect(0, 0, WIDTH, HEIGHT);

					falcon9.move(deltatime);
					falcon9.draw(g);
			
					g.setColor(Color.white);
					g.setFont(new Font("Default", Font.BOLD, 20));
					g.drawString("Time: " + (float)falcon9.getDeltaTime(), 25, 30);
					g.drawString("Speed: " + (float)falcon9.getVelocity(), 25, 55);
					g.drawString("Altitude: " + (float)falcon9.getAltitude(), 25, 80);
					g.drawString("STAGE 1", 25, 105);
			
					repaint();
			
			} else if (falcon9.getDeltaTime() >= 160 && !(falcon9.getDeltaTime() >= 559)) {

					falcon9.setInitialMass(96570);
					falcon9.setBurnTime(397);
					falcon9.setFuelConsumption(92670);
					falcon9.setThrust(934000);
					
					
					g.setColor(Color.black);
					g.fillRect(0, 0, WIDTH, HEIGHT);

					
					falcon9.move(deltatime);
					if(falcon9.getY() <= 0) {
						falcon9.setY((int)(falcon9.getY()+HEIGHT));
					}
					System.out.println(falcon9.getY());
					falcon9.draw(g);
					
					
					g.setColor(Color.white);
					g.setFont(new Font("Default", Font.BOLD, 20));
					g.drawString("Time: " + (float)falcon9.getDeltaTime(), 25, 30);
					g.drawString("Speed: " + (float)falcon9.getVelocity(), 25, 55);
					g.drawString("Altitude: " + (float)falcon9.getAltitude(), 25, 80);
					g.drawString("STAGE 2", 25, 105);
			
					repaint();
					//System.out.println((int)(falcon9.getDeltaTime())+","+falcon9.getInitialMass()+","+falcon9.getNetForce()+","+falcon9.getAcceleration()+","+falcon9.getVelocity()+","+falcon9.getAltitude());
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
		frame.setContentPane(new Falcon9LiftOff());
		frame.setVisible(true);
	}

}
