//Akhil Gogineni
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class StudentsAndBooks {


 public static void main(String[] args){
   Display.openWorld("maps/ACL.map");
   Display.setSize(10,10);
   
   Robot lisa = new Robot();
   Robot pete = new Robot(4,5, Display.SOUTH, 0);
   Robot lib = new Robot(6,9, Display.EAST, 0);   
   
   
   
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.move();   
   lisa.pickBeeper();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.pickBeeper();
   lisa.turnLeft();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   lisa.putBeeper();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.putBeeper();
   lisa.move();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.turnLeft();
   lisa.move();
   lisa.move();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.pickBeeper();
   pete.pickBeeper();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.move();
   pete.turnLeft();
   pete.move();
   pete.putBeeper();
   pete.putBeeper();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   pete.turnLeft();
   pete.turnLeft();
   pete.turnLeft();
   pete.move();
   lib.move();
    for(int t=0; t<1; t++) { 
   for(int i=0; i<3; i++){
      lib.pickBeeper();
   }
   lib.move();
 }  
 for(int i=0; i<3; i++){
      lib.pickBeeper();
   }
 
   lib.turnLeft();
   lib.turnLeft();
   lib.move();
   lib.move();
   lib.move();
 for(int p=0; p<3; p++) { 
   for(int o=0; o<3; o++){
      lib.pickBeeper();
   }
   lib.move();
 
 }  
 for(int y=0; y<15; y++){
   lib.putBeeper();
 }
 lib.turnLeft();
 lib.turnLeft();
 lib.move();
}
   
 }


