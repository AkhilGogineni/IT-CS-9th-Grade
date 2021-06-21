
//ITCS 
//Lab09: Exploration

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
  
    public class Exploration
   {
      // declare and initialize array of map choices for the dialogue drop-down options
       public static final String[] choices = {"mountain1", "mountain2", "mountain3", "hill1", "hill2", "hill3", "step1", "step2", "step3"};

       public static void main(String[] args) 
      {
         // open dialogue box and request user input of map choices
         String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
         
         // open selected map and set size and speed
         Display.openWorld("maps/"+ mapChoice +".map");
         Display.setSize(17, 15);
         Display.setSpeed(10);
         
         //TODO: declare climber
         Climber nerd;
        
         
         
         
         
               
         /*TODO: if statements to initialize climber type (climber, HillClimber or StepClimber) 
           and starting location based on mapChoice
           include final else to initialize climber in the case of an invalid entry*/
         if(mapChoice.equals("hill1") || mapChoice.equals("hill2") || mapChoice.equals("hill3")){
            nerd = new HillClimber(10);
         }
         
         else if(mapChoice.equals("step1") || mapChoice.equals("step2") || mapChoice.equals("step3")){
            nerd = new StepClimber(12);
         } 
         
         else if(mapChoice.equals("mountain1") || mapChoice.equals("mountain2") || mapChoice.equals("mountain3")){
            nerd = new Climber(8);
         } else {
            nerd = new Climber();
         }
         
       
        
         //TODO: invoke the explore method from the mountain class using the climber declared above.
            Mountain.explore(nerd);
         
      }
   }

