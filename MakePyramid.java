//Akhil Gogineni
// imported files
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class MakePyramid{
    
  //main medthod    
   public static void main(String[] args){
   //Display World
   Display.openWorld("");
   //create the athlete
     Athlete worker = new Athlete(1,1,1,10);
     
     
     // First try of code re did it underneath
     
     
     
     
      // for(int i = 0; i<3; i++){
//         worker.putBeeper();
//          worker.turnRight();
//          worker.move();
//          worker.turnLeft();
//          for (int x = 0; x<1; x++){
//              worker.putBeeper();
//              worker.move();
//          }
//       }
//          worker.putBeeper();
//          
//          worker.turnAround();
//          worker.move();
//          
//          for(int y = 0; y<2; y++){
//             worker.move();
//             worker.putBeeper();
//          }
//          
//       worker.turnRight();
//       worker.move();
//       worker.putBeeper();
//       worker.turnAround();
//       worker.moove(2);
//       worker.turnLeft();
      
     //place first beeper here
         worker.putBeeper();
         worker.turnRight();
         worker.move();
         worker.turnLeft();
     //for loop for colums 2-4
      for(int z=1; z<4;z++){   
         for (int x = 0; x<z; x++){
             worker.putBeeper();
             worker.move();
         }
     //places final beeper and turns arount
         worker.putBeeper();
         worker.turnAround();
         worker.moove(z);
     //at the bottom of 4th colum
         worker.turnLeft();
         worker.move();
         worker.turnLeft();
     //pyramid is done and is next to it
         

        }

   }
   
}