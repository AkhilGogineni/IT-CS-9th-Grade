	import java.awt.Color;
	import java.awt.Graphics;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	import java.awt.image.BufferedImage;

	import javax.swing.JFrame;
	import javax.swing.JPanel;
	import javax.swing.Timer;
	import java.util.ArrayList;
	import java.util.List;

	@SuppressWarnings("serial")
	public class HailHydra extends JPanel {


		private static final int WIDTH = 1000;
		private static final int HEIGHT = 1000;


		private BufferedImage image;
		private Graphics g;
		public Timer timer;
		private Ball ball;
		public int impactAmount = 0;
		List<JumpingBall> balls = new ArrayList<JumpingBall>();



		public HailHydra() {
			image =  new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
			g = image.getGraphics();

			Color[] Colors = {Color.GREEN, Color.BLUE, Color.PINK, Color.ORANGE};

			for(int i = 0; i<=3; i++) {
				balls.add(new JumpingBall((int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT), 100 , Colors[i]));
			}
				
				ball = new Ball(WIDTH/2, HEIGHT/2, 75, Color.red);
				
				int xranSpeed = (int)(Math.random() * 10) -6;
				int yranSpeed = (int)(Math.random() * 10) -6;
				
				if (xranSpeed == 0) {
					xranSpeed = 6;
				}
				
				if (yranSpeed == 0) {
					yranSpeed = 6;
				}
				
				//used so ball does not get stuck in the corner
				while(xranSpeed == Math.abs(yranSpeed)) {
					yranSpeed = (int)(Math.random() * 10) -6;
				}
				ball.setXSpeed(xranSpeed); 
				ball.setYSpeed(yranSpeed);
				
				

			
			
			timer = new Timer(5, new TimerListener());
			timer.start();

		}
		
		//TimerListener class that is called repeatedly by the timer
		private class TimerListener implements ActionListener {
			@Override
			public void actionPerformed(ActionEvent e) {
				
			 g.setColor(Color.BLACK);
			 g.fillRect(0, 0, WIDTH, HEIGHT);
			
			 
			 for(int i = 0;i<balls.size();i++) {
					balls.get(i).draw(g);
					if((balls.get(i)).intersectsWith(ball)) {
						balls.get(i).move(WIDTH, HEIGHT);
						balls.get(i).setDiameter(balls.get(i).getDiameter()/2);
						
						if(balls.get(i).getDiameter() < 20) {
							balls.get(i).setDiameter(0);
						}
						
						balls.add(new JumpingBall((int) (Math.random() * WIDTH),(int) (Math.random() * HEIGHT), balls.get(i).getDiameter(), balls.get(i).getColor()));
						balls.get(i).draw(g);
						impactAmount = impactAmount + 1;
					}
				}
			 
					ball.move(WIDTH, HEIGHT);
					ball.draw(g);
					
					g.setColor(Color.blue);
					g.drawString("Times Hit: "+ impactAmount, 10, 20);
			
				repaint();
				
			}
			
		}


		public void paintComponent(Graphics g) {
				g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
			
		}


		public static void main(String[] args) {
			JFrame frame = new JFrame("movingBallz");
			frame.setSize(WIDTH, HEIGHT);
			frame.setLocation(0, 0);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setContentPane(new HailHydra()); 
			frame.setVisible(true);
		}

}
