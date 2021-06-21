import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
public class MultiTasker extends Athlete{
    
      // the default constructor
  public MultiTasker() {
    super(1, 1, Display.NORTH, Display.INFINITY);
  }

  // the two parameter constructor for location (x, y)
  public MultiTasker(int x, int y, int direction, int beepers) {
    super(x, y, direction, beepers);
  }
      
   public void dropAndMove(){
        putBeeper();
        move();
   }
   
   public void moveAndDrop(){
        move();
        putBeeper();
   }
   
   public static void main(String[] args){
   Display.openWorld("");
   MultiTasker worker = new MultiTasker(1,1,4,10);
      worker.moove(3);   
     
   }
}