// MakePyramid3.java        ITCS
//
// Create a pyramid using class methods

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid3 {

   public static void goUp(MultiTasker temp, int numBeepers){
      for(int i = 0; i < numBeepers; i++){
         temp.putBeeper();
         temp.move();
      }
   }
   
   public static void goBack(MultiTasker temp, int spaces){
      temp.turnAround();
      temp.moove(spaces);
   }
   
   public static void moveOver(MultiTasker temp){
      temp.turnLeft();
      temp.move();
      temp.turnLeft();
   }

   public static void main (String[] args) {
   
      Display.setSize(8, 8);
      Display.setSpeed(10);
      
      MultiTasker worker = new MultiTasker(1,1,1,100);      
   
   for(int y = 1; y<5; y++){
      goUp(worker, y);
      goBack(worker, y);
      moveOver(worker);
    }
   
        
      printFinishMessage("Pyramid complete.");
   
      
   }
   
   
   
   // Prints the given message in the dialog box  
   public static void printFinishMessage(String message) { 
      
      JOptionPane.showMessageDialog(null, message);
   }
   
}