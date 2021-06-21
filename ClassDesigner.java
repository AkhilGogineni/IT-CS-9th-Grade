import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class ClassDesigner extends Athlete {
  		
   // The default constructor starts at (1,1), faces North, and has
	// an Infinite number of beepers.	
   public ClassDesigner() {
   		super(1,1,Display.NORTH, 0 );
   }    
		
		
	// 1 argument constructor
   public ClassDesigner(int x, int beepers) {
         super(x,1,Display.NORTH,beepers);
   }
   
   // turns around the right side instead of the left side
   public void turnAround(){
      turnRight();
      turnRight();
   }
   
   // moves once and jumps for however long it needs to jump comes back down and moves once
   public void runAndJump(int x){
      move();
      turnLeft();
      move();
      turnRight();
      for(int i = 0; i<x; i++){
         move();
      }
      turnRight();
      move();
      turnLeft();       
      move();   
   }
   public static void main (String[] args) {
      Display.setSpeed(1);
      ClassDesigner bob = new ClassDesigner();
      
      bob.turnAround();
      bob.turnAround();
      bob.turnRight();
      
      bob.runAndJump(2);
    }

      
}