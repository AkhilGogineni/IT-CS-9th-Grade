3333333// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class ClimbingChallenge{
   
   public static void climbMountainGoingLeft(Climber temp){
           temp.turnRight();
           temp.move();
           temp.move();
           temp.turnLeft();
           temp.move();
   }
   
   public static void climbMountainGoingRight(Climber temp){
           temp.turnLeft();
           temp.move();
           temp.move();
           temp.turnRight();
           temp.move();
   }
   
   public static void climbDownMountainGoingRight(Climber temp){
           temp.turnRight();
           temp.move();
           temp.move();
           temp.turnLeft();
           temp.move();
   }
   
   public static void climbDownMountainGoingLeft(Climber temp){
           temp.turnLeft();
           temp.move();
           temp.move();
           temp.turnRight();
           temp.move();
           
   }
   
   public static void main (String[] args) {
   
      Display.openWorld("maps/mountain.map");
      Display.setSize(16,16);
      Display.setSpeed(5);
        
      Climber hiker = new Climber(7);
      
      hiker.turnRight();
      hiker.move();
      hiker.move();
      
      
    for(int i = 0; i < 3; i++){
      climbMountainGoingRight(hiker);
    }
    
    hiker.move();
    
    for(int i = 0; i < 3; i++){
         climbDownMountainGoingRight(hiker);
    }
    
    hiker.turnAround();
    hiker.move();
    
    
    for(int i = 0; i < 3; i++){
      climbMountainGoingLeft(hiker);
    }
    
    hiker.move();
    
    for(int i = 0; i < 3; i++){
      climbMountainGoingRight(hiker);
    }
    
    hiker.move();
    
    for(int i = 0; i < 3; i++){
      climbMountainGoingLeft(hiker);
    }
    
    hiker.move();
    
    for(int i = 0; i < 3; i++){
      climbDownMountainGoingLeft(hiker);
    }
    
      }
}