//Akhil Gogineni
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;



public class CleverShift {


public static void main(String[] args){
   //Display World
   Display.setSize(10,10);
   Display.setSpeed(10);
   String filename = JOptionPane.showInputDialog("What Robot World?");
   Display.openWorld("maps/" + filename + ".map"); 
   //create the athlete
   Athlete shifter = new Athlete(1,1,3,0);
   Athlete reverseshifter = new Athlete(8,1,2,0);
   
   ShiftBeepers(shifter);
   ReverseShiftBeepers(reverseshifter);
   }
   


public static void ShiftBeepers(Athlete temp){   
   // variables used here DropCount = beepers that need to be placed PickCount is beepers that have been picked and times is used to see how many times it has been run.
   int DropCount = 0;
   int PickCount = 0;
   int times = 0;
   //start it off
   while(temp.nextToABeeper()){
      temp.pickBeeper();
      PickCount++;    
   }
   DropCount = PickCount;
   PickCount = 0;
   while(!temp.facingEast()){
      temp.turnLeft();
   } 
   temp.move();
   // shifting the rest of them 
    
   while(times<8){ //set it to 8 times because that is the maximum it needs to go at any point
      if(!temp.hasBeepers() && temp.nextToABeeper()){ // robot dosent have beepers but is on a beeper
         while(temp.nextToABeeper()){
            temp.pickBeeper();
            PickCount++;
         }
         DropCount = PickCount;
         PickCount = 0;
         System.out.println("no beepers on a beeper"); //used this to debug code and see where it went wrong
         
      }
      else if(temp.hasBeepers() && temp.nextToABeeper()){ // robot has beepers and is on one
         while(temp.nextToABeeper()){
            temp.pickBeeper();
            PickCount++;
         }
         for(int i = 0; i<DropCount; i++){
            temp.putBeeper();
         }
         DropCount = PickCount;
         PickCount = 0;
         System.out.println("beepers on a beeper"); //used this to debug code and see where it went wrong
      } 
      else if(temp.hasBeepers() && !temp.nextToABeeper()){ // robot has beepers but is not on one
         for(int i = 0; i<DropCount; i++){
            temp.putBeeper();
         }
         DropCount = 0;
         System.out.println("beepers but not on a beeper"); //used this to debug code and see where it went wrong
      }
      times++;
      temp.move();
      System.out.println(times); //used this to debug code and see where it went wrong
   }
}
 

public static void ReverseShiftBeepers(Athlete temp){   
   // variables used here DropCount = beepers that need to be placed PickCount is beepers that have been picked and times is used to see how many times it has been run.
   int DropCount = 0;
   int PickCount = 0;
   int times = 0;
   //start it off
   while(temp.nextToABeeper()){
      temp.pickBeeper();
      PickCount++;    
   }
   DropCount = PickCount;
   PickCount = 0;
   while(!temp.facingWest()){
      temp.turnLeft();
   } 
   temp.move();
   // shifting the rest of them 
    
   while(times<7){ //set it to 6 times because that is the maximum it needs to go at any point
      if(!temp.hasBeepers() && temp.nextToABeeper()){ // robot dosent have beepers but is on a beeper
         while(temp.nextToABeeper()){
            temp.pickBeeper();
            PickCount++;
         }
         DropCount = PickCount;
         PickCount = 0;
         System.out.println("no beepers on a beeper"); //used this to debug code and see where it went wrong
         
      }
      else if(temp.hasBeepers() && temp.nextToABeeper()){ // robot has beepers and is on one
         while(temp.nextToABeeper()){
            temp.pickBeeper();
            PickCount++;
         }
         for(int i = 0; i<DropCount; i++){
            temp.putBeeper();
         }
         DropCount = PickCount;
         PickCount = 0;
         System.out.println("beepers on a beeper"); //used this to debug code and see where it went wrong
      } 
      else if(temp.hasBeepers() && !temp.nextToABeeper()){ // robot has beepers but is not on one
         for(int i = 0; i<DropCount; i++){
            temp.putBeeper();
         }
         DropCount = 0;
         System.out.println("beepers but not on a beeper"); //used this to debug code and see where it went wrong
      } 
      times++;
      if(!temp.frontIsClear()) {
         temp.turnRight();   
      }

      temp.move();
      System.out.println(times); //used this to debug code and see where it went wrong
      
   }
}





}

   
   

 