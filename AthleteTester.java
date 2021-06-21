//Akhil Gogineni  
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class AthleteTester{
    
      
   public static void main(String[] args){
   Display.openWorld("");
     Athlete bobby = new Athlete(3,2,1,0);
      Athlete bob = new Athlete();
      
      bob.move();
      bob.move();
      bob.move();
      bob.turnRight();
      
      bobby.move();
      bobby.move();
      bobby.turnAround();
   }
   
}