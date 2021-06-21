// HighJumper.java				
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
	
public class HighJumper extends Racer
{
  	// A HighJumper can be at any y-coordinate (1, y), face East, 
	// and have an Infinite amount of beepers    
   public HighJumper(int y){
      super(y);
   }	
					
	// Begins facing East, jumps over a hurdle, and finishes facing East
   public void jumpRight(){
      turnLeft();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
      turnRight();
      move();
      while(frontIsClear()){
         move();
      }
      turnLeft();
   }     
}