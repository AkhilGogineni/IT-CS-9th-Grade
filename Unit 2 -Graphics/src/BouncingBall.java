	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.image.BufferedImage;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.Timer;

	@SuppressWarnings("serial")
	public class BouncingBall extends JPanel {


		private static final int WIDTH = 800;
		private static final int HEIGHT = 800;


		private BufferedImage image;
		private Graphics g;
		public Timer timer;
		private Ball[] balls;


		public BouncingBall() {

			image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
			g = image.getGraphics();

			Color[] Colors = {Color.RED, Color.GREEN, Color.BLUE, Color.CYAN, Color.YELLOW, Color.PINK, Color.ORANGE, Color.MAGENTA};
			
			balls = new Ball[15];
			
			
			
			for(int i = 0; i<balls.length; i++) {
				balls[i] = new Ball(WIDTH/2, HEIGHT/2, (int)(Math.random() * 30) * 5, Colors[(int)(Math.random() * 7) + 0]);
				int xranSpeed = (int)(Math.random() * 10) -6;
				int yranSpeed = (int)(Math.random() * 10) -6;
				
				if (xranSpeed == 0) {
					xranSpeed = 6;
				}
				
				if (yranSpeed == 0) {
					yranSpeed = 6;
				}
				
				balls[i].setXSpeed(xranSpeed); 
				balls[i].setYSpeed(yranSpeed);
			}
			
			
			
			timer = new Timer(5, new TimerListener());
			timer.start();

		}
		
		//TimerListener class that is called repeatedly by the timer
		private class TimerListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			 g.setColor(Color.BLACK);
			 g.fillRect(0, 0, WIDTH, HEIGHT);
			
				
				for(int i = 0; i < balls.length; i++) {		
					balls[i].move(WIDTH, HEIGHT);
					balls[i].draw(g);
					
				}
				
				repaint();
				
			}
			
		}


		public void paintComponent(Graphics g) {
			for(int i = 0; i < balls.length; i++) {		
				balls[i].draw(g);
				g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
			}
		}


		public static void main(String[] args) {
			JFrame frame = new JFrame("Ballz");
			frame.setSize(WIDTH, HEIGHT);
			frame.setLocation(0, 0);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setContentPane(new BouncingBall()); 
			frame.setVisible(true);
		}

}
