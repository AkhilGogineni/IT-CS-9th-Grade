// MakePyramid2.java        ITCS    Shell Code
// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid2 {

   public static void main (String[] args) {
   
      Display.setSize(8, 8);
      Display.setSpeed(1);
      
      // Create a Multitasker
      
      MultiTasker builder = new MultiTasker(1,1,4,10);
      
      // Code to make the pyramid goes here
      
         builder.dropAndMove();
         builder.turnLeft();
      for(int z=1; z<4;z++){   
         for (int x = 0; x<z; x++){
             builder.dropAndMove();
         }
         builder.putBeeper();
         builder.turnAround();
         builder.moove(z);
         builder.turnLeft();
         builder.move();
         builder.turnLeft();
      }

            
      printFinishMessage("Program is Finished");
   
   }


     
     
     
      


   // Prints the message to a dialog box
   public static void printFinishMessage(String message) {     
      JOptionPane.showMessageDialog(null, message);
   }
}