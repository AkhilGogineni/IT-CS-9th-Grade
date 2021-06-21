import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.List;

import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.ImageIcon;


public class ShootySkies extends JPanel {

	private static final int WIDTH = 1000;
	private static final int HEIGHT = 1000;
	private static final Color LIGHT_BLUE = new Color(108, 210, 247);
	
	private BufferedImage image;
	private Graphics g;
	private Timer timer;
	private Plane player2;
	private Plane player1;
	private int score;
	private int score2;
	private int gamestate;
	private int player1Angle = 1;
	private int player2Angle = 3;
	List<Bullets> bullets = new ArrayList<Bullets>();
	
	// declare stuff

	
	public ShootySkies() {
		
		image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
		g = image.getGraphics();
		
		g.setColor(LIGHT_BLUE);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		player2 = new Plane(900, (int)((Math.random()*800)+100), 7, 7);
		player1 = new Plane(100, (int)((Math.random()*800)+100), 7, 7);
		
		timer = new Timer(5, new TimerListener());
		timer.start();
		addKeyListener(new Keyboard());
		setFocusable(true);
	}
	public class Keyboard implements KeyListener {
		

		@Override
		public void keyTyped(KeyEvent e) {
		
		}

		@Override
		public void keyPressed(KeyEvent e) {
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			int keyCode2 = e.getKeyCode();
			if(keyCode2 == KeyEvent.VK_A) {
				player1Angle--;
				if(player1Angle == 4) {
					player1Angle = 0;
				}
				if(player1Angle == -4) {
					player1Angle = 0;
				}
			} 
			if(keyCode2 == KeyEvent.VK_D) {
				player1Angle++;
				if(player1Angle == 4) {
					player1Angle = 0;
				}
				if(player1Angle == -4) {
					player1Angle = 0;
				}
			}
			if(keyCode2 == KeyEvent.VK_W) {
				if(player1Angle == 0) {
					player1.setY(player1.getY()-player1.getYSpeed());
				} else if(player1Angle == 1 || player1Angle == -3) {
					player1.setX(player1.getX()+player1.getXSpeed());
				} else if(player1Angle == 2 || player1Angle == -2) {
					player1.setY(player1.getY()+player1.getYSpeed());
				} else if(player1Angle == 3 || player1Angle == -1) {
					player1.setX(player1.getX()-player1.getXSpeed());
				}
			}
			if(keyCode2 == KeyEvent.VK_S) {
				if(player1Angle == 0) {
					player1.setY(player1.getY()+player1.getYSpeed());
				} else if(player1Angle == 1 || player1Angle == -3) {
					player1.setX(player1.getX()-player1.getXSpeed());
				} else if(player1Angle == 2 || player1Angle == -2) {
					player1.setY(player1.getY()-player1.getYSpeed());
				} else if(player1Angle == 3 || player1Angle == -1) {
					player1.setX(player1.getX()+player1.getXSpeed());
				}
			}
			if(keyCode2 == KeyEvent.VK_SHIFT) {
				if(player1Angle == 0) {
					bullets.add(new Bullets(player1.getX(), player1.getY()-player1.getHeight(), 0, -3));
	        	} else if(player1Angle == 1 || player1Angle == -3) {
	        		bullets.add(new Bullets(player1.getX()+player1.getWidth()/2, player1.getY(), 3, 0));
	        	} else if(player1Angle == 2 || player1Angle == -2) {
	        		bullets.add(new Bullets(player1.getX(), player1.getY()+player1.getHeight(), 0, 3));
	        	} else if(player1Angle == 3 || player1Angle == -1) {
	        		bullets.add(new Bullets(player1.getX()-player1.getWidth()/2, player1.getY(), -3, 0));
	        	} 
			}
			
			int keyCode = e.getKeyCode();
			if(keyCode == KeyEvent.VK_LEFT) {
				player2Angle--;
				if(player2Angle == 4) {
					player2Angle = 0;
				}
				if(player2Angle == -4) {
					player2Angle = 0;
				}
				// System.out.println(player2Angle);
			}
			if(keyCode == KeyEvent.VK_RIGHT) {
				player2Angle++;
				if(player2Angle == 4) {
					player2Angle = 0;
				}
				if(player2Angle == -4) {
					player2Angle = 0;
				}
				// System.out.println(player2Angle);
			}
			if(keyCode == KeyEvent.VK_UP) {
				if(player2Angle == 0) {
					player2.setY(player2.getY()-player2.getYSpeed());
				} else if(player2Angle == 1 || player2Angle == -3) {
					player2.setX(player2.getX()+player2.getXSpeed());
				} else if(player2Angle == 2 || player2Angle == -2) {
					player2.setY(player2.getY()+player2.getYSpeed());
				} else if(player2Angle == 3 || player2Angle == -1) {
					player2.setX(player2.getX()-player2.getXSpeed());
				}
			}
			if(keyCode == KeyEvent.VK_DOWN) {
				if(player2Angle == 0) {
					player2.setY(player2.getY()+player2.getYSpeed());
				} else if(player2Angle == 1 || player2Angle == -3) {
					player2.setX(player2.getX()-player2.getXSpeed());
				} else if(player2Angle == 2 || player2Angle == -2) {
					player2.setY(player2.getY()-player2.getYSpeed());
				} else if(player2Angle == 3 || player2Angle == -1) {
					player2.setX(player2.getX()+player2.getXSpeed());
				}
			}
			if(keyCode == KeyEvent.VK_SPACE) {
				if(player2Angle == 0) {
					bullets.add(new Bullets(player2.getX(), player2.getY()-player2.getHeight(), 0, -3));
	        	} else if(player2Angle == 1 || player2Angle == -3) {
	        		bullets.add(new Bullets(player2.getX()+player2.getWidth()/2, player2.getY(), 3, 0));
	        	} else if(player2Angle == 2 || player2Angle == -2) {
	        		bullets.add(new Bullets(player2.getX(), player2.getY()+player2.getHeight(), 0, 3));
	        	} else if(player2Angle == 3 || player2Angle == -1) {
	        		bullets.add(new Bullets(player2.getX()-player2.getWidth()/2, player2.getY(), -3, 0));
	        	} 
			}
			
			if(keyCode == KeyEvent.VK_ESCAPE) {
				gamestate = 0;
			}
			if(keyCode == KeyEvent.VK_ENTER) {
				gamestate = 3;
			}
			
			
		}
	
}
	
	

	private class TimerListener implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//background challenge
			ImageIcon bg = new ImageIcon("sky-1.png");
        	g.drawImage(bg.getImage(), 0, 0, WIDTH, HEIGHT, null);


        	if(player1Angle == 0) {
        		player1.drawN(g);
        	} else if(player1Angle == 1 || player1Angle == -3) {
        		player1.drawL(g);
        	} else if(player1Angle == 2 || player1Angle == -2) {
            	player1.drawS(g);
        	} else if(player1Angle == 3 || player1Angle == -1) {
            	player1.drawR(g);
        	} 
        	
        	
        	if(player2Angle == 0) {
        		player2.drawN(g);
        	} else if(player2Angle == 1 || player2Angle == -3) {
        		player2.drawL(g);
        	} else if(player2Angle == 2 || player2Angle == -2) {
            	player2.drawS(g);
        	} else if(player2Angle == 3 || player2Angle == -1) {
            	player2.drawR(g);
        	} 
        	
        	
        	
        	
			for(int i = 0; i<bullets.size();i++) {
				bullets.get(i).move(WIDTH,HEIGHT);
				bullets.get(i).draw(g);
				
				if(bullets.get(i).hit(player2) && score < 5 && score2 < 5) {
					score++;
					bullets.get(i).setX(WIDTH+20);
					gamestate = 1;
				}
				
				if(bullets.get(i).hit(player1) && score2 < 5 && score < 5) {
					score2++;
					bullets.get(i).setX(WIDTH+20);
					gamestate = 1;
				}
			}
			
			//using gamestates to pause the objects on the screen when an enemy is hit
			if(gamestate == 1 && score < 5 && score2 < 5) {
				player2.setXSpeed(0);
				player2.setYSpeed(0);
				player1.setXSpeed(0);
				player1.setYSpeed(0);
				for(int i = 0; i<bullets.size();i++) {
					bullets.get(i).setXSpeed(0);
					bullets.get(i).setYSpeed(0);
					bullets.get(i).setX(WIDTH+20);
				}
				player1.setX(100);
				player1.setY((int)((Math.random()*800)+100));
				player2.setX(900);
				player2.setY((int)((Math.random()*800)+100));
				player1Angle = 1;
				player2Angle = 3;
				g.setColor(Color.BLACK);
				g.setFont(new Font("Default", Font.BOLD, 50));
				g.drawString("Press Escape to Continue", 150, 500);
				
			} else if (gamestate == 0){
				player2.setXSpeed(7);
				player2.setYSpeed(7);
				player1.setXSpeed(7);
				player1.setYSpeed(7);
			} 
			
			
			
			g.setColor(Color.BLACK);
			g.setFont(new Font("Default", Font.BOLD, 50));
			g.drawString("" + score, 450, 50);
			g.drawString("" + score2, 550, 50);
			
			if(score == 5) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Default", Font.BOLD, 50));
				g.drawString("Player 1 Wins!", 325, 500);
				g.drawString("Re-run the program to play again!", 125, 600);
				
			} else if(score2 == 5) {
				g.setColor(Color.BLACK);
				g.setFont(new Font("Default", Font.BOLD, 50));
				g.drawString("Player 2 Wins!", 325, 500);
				g.drawString("Re-run the program to play again!", 125, 600);
				
			}
			
			repaint();
		}
		
	}
	
	
	public void paintComponent(Graphics g) {
		g.drawImage(image, 0, 0, getWidth(), getHeight(), null);
	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Shooty Skies!");
		frame.setSize(1200, 900);
		frame.setLocation(200, 50);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setContentPane(new ShootySkies());
		frame.setVisible(true);
	}
}


/* writing a few comments here
   w and s are to move front and back for player1(the left plane)
   up and down arrow do the same for player2(the right plane)
   a,d and right,left arrow keys turn 90 degrees in that direction for player1 and player2 respectively
   shift is used to shoot for the player 1 and space for player 2
   first one to 5 points wins!
*/



