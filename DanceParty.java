
// SwimmerApplication.java
// ITCS

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class DanceParty {

   public static void main(String[] args) {
   
      // Created an array of 4 dancers
      Dancer[] dancers = new Dancer[4];
      
      
      dancers[1] = new Dancer(7, 15, Display.NORTH, 0);
      dancers[2] = new SlideDancer(14, 15, Display.NORTH, 0);
    v       dancers[3] = new GrapeDancer(21, 15, Display.NORTH, 0);
      dancers[4] = new B2FDancer(28, 15, Display.NORTH, 0);



      
      // Create a Thread object to allow parallel processing
      Thread threads[] = new Thread[4];
      
      // Put each swimmer in the Thread
      for (int i = 0; i < threads.length; i++) {
         threads[i] = new Thread(dancers[i]);
      }
      
      // Start each Thread to begin the parallel processing
      for (int i = 0; i < threads.length; i++) {
         threads[i].start();
      }
        
   }
}
