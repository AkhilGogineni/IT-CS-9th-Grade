import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class HillClimber extends Climber {

  // the default constructor
  public HillClimber(int x) {
    super(x);
  }
   
   
    // Climber is facing right and moves up one level and finishes facing right 
   public void climbUpRight() { 
   		  turnLeft();
           move();
           turnRight();
           move();
           move();
   }
      
   	
   //  Climber is facing left and moves up one level and finishes facing left  
   public void climbUpLeft() {	     
   		  turnRight();
           move();
           turnLeft();
           move();
           move();
   }
      
   	
   // Climber is facing right and moves down one level and finishes facing right.
   public void climbDownRight() {
           move();
           move();
           turnRight();
           move();
           turnLeft();
           
   }
      
   // Climber is facing left and moves down one level and finishes facing left 
   public void climbDownLeft() { 
           move();
           move();
           turnLeft();
           move();
           turnRight();
           
           
           
   }

}