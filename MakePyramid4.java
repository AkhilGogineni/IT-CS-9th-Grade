
// MakePyramid4.java        ITCS
//
// Creates a pyramid N columns high

import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class MakePyramid4 {

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
   
      int numColumns = getNumColumns();
      
      Display.setSize(numColumns, numColumns);
  
      Display.setSpeed(10);
      
      MultiTasker worker = new MultiTasker(1,1,Display.NORTH,100000);      
                         
      createPyramid(worker, numColumns);
          
      printFinishMessage("Pyramid complete.");
   
      
   }
   
   
   // Prompts and returns the number of columns to build
   public static int getNumColumns() {
   
      String value = JOptionPane.showInputDialog("Enter the number of columns for the pyramid");
      
      int numColumns = Integer.parseInt(value);
      
      return numColumns;
   
   }
   
   // Creates a pyramid with a Multitasker robot numColumns high
   public static void createPyramid(MultiTasker temp, int numColumns) {
      
     for(int y = 1; y<numColumns+1; y++){
       goUp(temp, y);
       goBack(temp, y);
       moveOver(temp);
     }
    
   }
   
   
   // *******************************************
   //
   // INCLUDE YOUR METHODS goUp, goBack, moveOver
   //
   // *******************************************
   
   
     
   public static void printFinishMessage(String message) { 
      
      JOptionPane.showMessageDialog(null, message);
   }

}
