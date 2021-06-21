// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;


public class Shuttlerun{
   
   public static void runTheRace(Racer temp){
         temp.shuttle(3,5);
         temp.shuttle(5,2);
         temp.shuttle(6,3);
         temp.shuttle(9,7);
         temp.move();
   }
   
   public static void main (String[] args) {
   
      Display.openWorld("maps/shuttlerun.map");
      Display.setSize(13,10);
      Display.setSpeed(10);
      
      Racer billy = new Racer(1);
      Racer bob = new Racer(4);
      Racer jeff = new Racer(7);
      
      runTheRace(billy);
      runTheRace(bob);
      runTheRace(jeff);
      
      }
}