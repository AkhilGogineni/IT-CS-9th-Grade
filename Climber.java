// Lab03: Climb Every Mountain
// Climber.java		
	
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

// A Climber Robot can climb up and down mountain
public class Climber extends Athlete {
  		
   // The default constructor starts at (1,1), faces North, and has
	// an Infinite number of beepers.	
   public Climber() {
   		super(1,1,Display.NORTH,Display.INFINITY);
   }    
		
		
	// 1 argument constructor
   public Climber(int x) {
         super(x,1,Display.NORTH,1);
   }
      
   // Climber is facing right and moves up one level and finishes facing right 
   public void climbUpRight() { 
   		  turnLeft();
           move();
           move();
           turnRight();
           move();
   }
      
   	
   // comment...   
   public void climbUpLeft() {	     
   		  turnRight();
           move();
           move();
           turnLeft();
           move();
   }
      
   	
   // comment...
   public void climbDownRight() {
           move();
           turnRight();
           move();
           move();
           turnLeft();
   }
      
   // comment... 
   public void climbDownLeft() { 
           move();
           turnLeft();
           move();
           move();
           turnRight();
           
   }
}