//Akhil Gogineni
//ITCS 
//Lab12: MazeEscape

   import edu.fcps.karel2.Display;
   import javax.swing.JOptionPane;
  
    public class MazeEscape
   {
      // declared and initializde array of map choices for the dialogue drop-down options
       public static final String[] choices = {"maze1", "maze2", "maze3", "maze4", "maze5"};

       public static void main(String[] args) 
      {
         // opened dialogue box and request user input of map choices
         String mapChoice = (String)JOptionPane.showInputDialog(null,"Choose an map.", "Map Choices", JOptionPane.PLAIN_MESSAGE, null, choices, choices[0]);
         
         // opened selected map and set size and speed
         Display.openWorld("maps/"+ mapChoice +".map");
         Display.setSize(10, 10);
         Display.setSpeed(10);
         
         
         Athlete mazeRunner = new Athlete(1,1,1,0);
         
         mazeRunner.turnRight();
         while(!mazeRunner.nextToABeeper()){
            if(mazeRunner.frontIsClear() && !mazeRunner.rightIsClear()){
               mazeRunner.move();   
            } else if(mazeRunner.rightIsClear()){
               mazeRunner.turnRight();
               mazeRunner.move();
            } else {
               mazeRunner.turnLeft();
            }
         }  
          
        
         
         
         
         
               
                  
      }
   }

