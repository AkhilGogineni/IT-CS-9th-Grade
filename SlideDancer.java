// Akhil Gogineni
// ITCS Lab 16
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class SlideDancer extends Athlete implements Runnable {
	//default constructor
	public SlideDancer() {
		super(1, 1, Display.EAST, 0);
	}
	
	//four argument constructor
	public SlideDancer(int x, int y, int direction, int beepers) {
		super(x, y, direction, beepers);
	}
	
	//regular dancers just spin in place
	//how boring
	public void danceStep() {
		turnLeft();
		turnLeft();
		turnLeft();
		turnLeft();
	}
	
	// TODO: Add the run method here
	// execute danceStep() at least 10 times
   public void run(){
      for(int i = 0; i < 10; i++){
         danceStep();
      }
   }
	
}