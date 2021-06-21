// Akhil Gogineni
import edu.fcps.karel2.Robot;
import edu.fcps.karel2.Display;
import javax.swing.JOptionPane;

public class Goldmine{
   
   public static void main (String[] args) {
   
      Display.openWorld("maps/mine.map");
      Display.setSize(10,10);
      Display.setSpeed(10);
      
      Miner minerjr = new Miner(3,6,4,0);
      Miner miner = new Miner(8,6,3,0);
      Miner minersr = new Miner(8,1,2,0);
      Miner headMiner = new Miner(1,1,1,0);
      Miner manager = new Miner(1,8,4,0);
      
      //First miner picks up all 6 beepers and gives them to the second one
      minerjr.move();
      for (int i = 0; i < 6; i++){
          minerjr.pickBeeper();
      }
      
      for (int i = 0; i < 4; i++){
          minerjr.move();
      }
      
      for (int i = 0; i < 6; i++){
          minerjr.putBeeper();
      }
       
      //Second miner now
      
      for (int i = 0; i < 6; i++){
          miner.pickBeeper();
      }
      
      for (int i = 0; i < 4; i++){
          miner.move();
      }
           
      for (int i = 0; i < 7; i++){
          miner.pickBeeper();
      }
      
            miner.move();
      for (int i = 0; i < 13; i++){
          miner.putBeeper();
      }
      
      //Third Miner now
      
      for (int i = 0; i < 13; i++){
          minersr.pickBeeper();
      }
      
      for (int i = 0; i < 4; i++){
          minersr.move();
      }
      
      for (int i = 0; i < 8; i++){
          minersr.pickBeeper();
      }
      
         minersr.move();
         minersr.move();
         minersr.move();
         
      for (int i = 0; i < 21; i++){
          minersr.putBeeper();
      }
      
      //Fourth Miner code here
      
      for (int i = 0; i < 21; i++){
          headMiner.pickBeeper();
      }
      
      for (int i = 0; i < 6; i++){
          headMiner.move();
      }
      
      for (int i = 0; i < 9; i++){
          headMiner.pickBeeper();
      }
      
          headMiner.move();
      for (int i = 0; i < 30; i++){
          headMiner.putBeeper();
      }
      
      //Last miner
      
      for (int i = 0; i < 30; i++){
          manager.pickBeeper();
      }
      
      for (int i = 0; i < 9; i++){
          manager.move();
      }
      
      for (int i = 0; i < 30; i++){
          manager.putBeeper();
      }
      
      manager.move();
      
 
      }
}