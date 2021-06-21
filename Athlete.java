//Akhil Gogineni
import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class Athlete extends Robot {

  // the default constructor
  public Athlete() {
    super(1, 1, Display.NORTH, 0);
  }

  // the two parameter constructor for location (x, y)
  public Athlete(int x, int y, int direction, int beepers) {
    super(x, y, direction, beepers);
  }

  // jumps up and down

  public void turnRight() {
     turnLeft();
     turnLeft();
     turnLeft();
  }
  
  public void turnAround() {
      turnLeft();
      turnLeft();
  }
  
  public void moove(int x){
      for(int i = 0; i<x; i++){
           move();
      }
  }
  
public static void main (String[] args) {
  
  Athlete lebron = new Athlete();

  lebron.move();
  lebron.turnLeft();
}
}

