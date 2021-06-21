// BoxTopper.java				
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
	
public class BoxTopper extends Racer
{
  	// A BoxTopper can be at any y-coordinate (1, y), face East, 
	// and have an Infinite amount of beepers    
   public BoxTopper(int y){
      super(y);
   }	
					
	// Begins facing East, jumps over a hurdle, and finishes facing East
   public void jumpRight(){
   System.out.println("Started Jumping");
      turnLeft();
      while(!rightIsClear()){
         move();
      }
      turnRight();
      move();
   if(!rightIsClear()){
         while(!rightIsClear()){
            move();
         }
         turnRight();
         move();  
      while(frontIsClear() && !rightIsClear()){
         move();
      }
      turnLeft();
   } else { 
     turnRight();
     move(); 
     while(frontIsClear() && !rightIsClear()){
         move();
     }
     turnLeft();
      }
   }  
}
		
	