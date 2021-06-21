import java.awt.Color;
import java.awt.Graphics;

public class Grass {
	
		private int x;
		private int y;
		private int height;
		private int amount;
		private int distanceApart;

			
		
		
		
		public Grass (int ax, int ay, int aAmount, int aHeight, int adistanceApart) {
			x = ax;
			y = ay;
			height = aHeight;
			amount = aAmount;
			distanceApart = adistanceApart;

		}
		
		public void draw(Graphics g) {
			g.setColor(Color.GREEN);
			for(int i = 0; i < amount; i = i+distanceApart) {
				g.drawLine(x+i, y, x+i, y+height);	
			}
		}
}
