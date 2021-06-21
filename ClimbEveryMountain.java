// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class ClimbEveryMountain {
   
   

   public static void main (String[] args) {
   
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(10);
      
     //Create Climbers
     
     Climber x = new Climber(8);
     Climber y = new Climber(8);
     x.putBeeper();
     y.putBeeper();
     x.turnRight();
     y.turnRight();
     x.move();
     y.move();
     for(int i = 0; i<3; i++){
         x.climbUpRight();
         y.climbUpRight();
     }  
     
     for(int i = 0; i<2; i++){
         x.climbDownRight();
         y.climbDownRight();
     }  
     
       x.pickBeeper();
       x.turnAround();
       y.turnAround();
     for(int i = 0; i<2; i++){
         x.climbUpLeft();
         y.climbUpLeft();
     }  
     
   
     for(int i = 0; i<3; i++){
         x.climbDownLeft();
         y.climbDownLeft();
     }  
     
     x.move();
     y.move();
     x.putBeeper();
     x.turnRight();
     y.turnRight();
     x.move();
     y.move();
      }
}