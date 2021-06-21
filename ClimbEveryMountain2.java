// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class ClimbEveryMountain2 {
   
   

   public static void main (String[] args) {
   
      Display.openWorld("maps/mountain3.map");
      Display.setSize(16,16);
      Display.setSpeed(5);
      
     //Create Climbers
     
     Climber x = new Climber(8);
     Climber y = new Climber(8);
     
     //Steps
     y.turnRight();
     y.move();
     y.climbUpRight();
     y.pickBeeper();
     y.turnAround();
     y.climbDownLeft();
     y.move();
     y.turnRight();
     y.putBeeper();
     y.move();
     //y is done second robot needs to go up now
     
     x.pickBeeper();
     x.turnLeft();
     x.move();
     for(int z = 0; z<5; z++){
         x.climbUpLeft();
     }
     x.turnAround();
     x.putBeeper();
      for(int i = 0; i<5; i++){
         x.climbDownRight();
     }
     x.move();
     x.turnLeft();
     x.move();
     
    
      }
}