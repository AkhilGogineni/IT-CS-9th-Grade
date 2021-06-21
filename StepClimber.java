import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class StepClimber extends Climber {

  // the default constructor
  public StepClimber(int x) {
    super(x);
  }
   
   
    // Climber is facing right and moves up one level and finishes facing right 
   public void climbUpRight() { 
   		  turnLeft();
           move();
           turnRight();
           move();
           
   }
      
   	
   //  Climber is facing left and moves up one level and finishes facing left  
   public void climbUpLeft() {	     
   		  turnRight();
           move();
           turnLeft();
           move();
           
   }
      
   	
   // Climber is facing right and moves down one level and finishes facing right.
   public void climbDownRight() {
           move();
           turnRight();
           move();
           turnLeft();
           
         
   }
      
   // Climber is facing left and moves down one level and finishes facing left 
   public void climbDownLeft() { 
           move();
           turnLeft();
           move();
           turnRight();
           
           
           
   }

}