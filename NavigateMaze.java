
// NavigateMaze.java			ITCS
//
// Use conditional statements and prompt the user which way to turn/move every time the 
// robot gets to a wall or opening

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;
	
public class NavigateMaze {
   
   public static final String[] choices = {"Move", "Go Left", "Go Right", "Turn Around", "Quit"};

   public static void main(String[] args) {
     
      Display.openWorld("maps/maze5.map");
      Display.setSize(8, 8);
      Display.setSpeed(7);
      
      Athlete navigator = new Athlete();
      navigateMaze(navigator);
     
      
      printFinishedMessage("Maze Complete");
      
     
    }
   // The robot will move through the map until it gets to the beeper
   public static void navigateMaze(Athlete temp) {
   
      while (!temp.nextToABeeper()) {
         chooseNextAction(temp);  
      }
   
   }
   
     
   // Moves the robot based upon the next action chosen.  
   public static void chooseNextAction(Athlete temp) {
      
      String mapChoice = (String)JOptionPane.showInputDialog(null, "Choose an action.", "Maze Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
   
      if (mapChoice.equals("Move") && temp.frontIsClear()) {
         temp.move();
      } else if (mapChoice.equals("Go Left")) {
         temp.turnLeft();
      }  else if (mapChoice.equals("Go Right")) {
         temp.turnRight();
      }  else if (mapChoice.equals("Turn Around")) {
         temp.turnAround();
      } else if (mapChoice.equals("Quit")){
         System.exit(0);
      } else {
         System.out.println("Front is not clear");
      }
   }
   
   
   
   public static void printFinishedMessage(String message) {
      
      JOptionPane.showMessageDialog(null, message);
   }
}
  