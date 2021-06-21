// TakeTheField.java             ITCS
// Akhil Gogineni
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
   
public class TakeTheField {
      
	// moves each Athlete from (1, 1) to (3, 5)
   public static void takeTheField(Athlete temp) {
         temp.moove(4);
         temp.turnRight();
         temp.moove(2);
         temp.turnLeft();
         temp.move();
         temp.turnRight();
   }
		
		
		
   public static void main(String[] args) {
   
      Display.openWorld("maps/arena.map");
      Display.setSize(10, 10);
      Display.setSpeed(10);
      	
      Athlete coach = new Athlete(2,7,4,0);
      Athlete player = new Athlete();
      Athlete player1 = new Athlete();
      Athlete player2 = new Athlete();
      Athlete player3 = new Athlete();
      Athlete player4 = new Athlete();
      Athlete player5 = new Athlete();
   					
   	// all Athletes get to the field
      takeTheField(player);
      takeTheField(player1);
      takeTheField(player2);
      takeTheField(player3);
      takeTheField(player4);
      takeTheField(player5);
      
   					
   	// each Athlete moves to the correct position on the field
      
      // OutFielders
      player1.move();
      player1.turnRight();
      
      player2.moove(5);
      player2.turnRight();
      
      //CenterFielders
      
      player3.moove(2);
      player3.turnRight();
      player3.move();
      
      player4.moove(3);
      player4.turnRight();
      player4.move();
      
      player5.moove(4);
      player5.turnRight();
      player5.move();
      
      //Goalie
      
      player.moove(3);
      player.turnLeft();
      player.move();
      player.turnAround();
      
      
      
   		
   }
}