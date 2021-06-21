//Angry Robots
//ITCS and Physics - Integrated Projectile Project

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;

public class AngryRobots{

   // global variables
   // These can be used in any method in this program without having to pass the variable as a parameter
   // Note that Ay and Ax are declared final, they cannot be changed   
   public static final double Ay = -9.8;
   public static final double Ax = 0; 
   public static double y = 0.0;
   public static double x = 0.0;
   public static double v0x = 0.0;
   public static double v0y = 0.0;
   public static double t = 0.0;
   public static double dt = 0.2;
   public static double maxRange = 0;
   public static double maxAngle = 0;
  
     
    
   public static void main(String[] args){
	  
      // User input to define initial velocity and launch angle
      // the parseDouble method converts the string input to a double
      double v0 = Double.parseDouble(JOptionPane.showInputDialog("Please enter an initial velocity in m/s"));
      double angleDegrees = Double.parseDouble(JOptionPane.showInputDialog("Please enter an initial angle in degrees"));
   
      // Calculate x and y initial velocities
      v0x = calculateV0X(v0, angleDegrees);
      System.out.println("V0x: " + v0x);
      
      v0y = calculateV0Y(v0, angleDegrees);
      System.out.println("V0y: " + v0y);
      
            
      
       

   
   
      // Step 1: Complete the calculateX and calculateY methods to calculate x and y postions 
      // using the kinematic equations; 
      // Complete the calculateProjectile method to calculate all the x and y positions until it hits the ground
      // Invoke the calculateProjectile method here
      // x = calculateX(v0x, t);
      // System.out.println("X: " + x);  
      // y = calculateY(v0y, t);
      // System.out.println("Y: " + y);

      calculateProjectile(v0x, v0y);
      
  
      // Step 2: Complete the plotProjectile method and invoke it in your calculateProjectile method
      // to place a new Robot at each calculated x,y location
      // No need to add code here for this step

      
      // Step 3: Create the optimalAngle method to determine the optimal launch angle for max range
      // Tests all angles between 0 and 90 degrees
      // invoke it here and store what it returns into a double
      
      // double optimalAngle1 = optimalAngle(v0);
//       System.out.println("optimal angle: " + optimalAngle1);
//       
//        
//        // Step 4: Create the plotRelatedAngles method and invoke it here
//        // Plot projectile at optimal angle, +/- 15 degrees and +/- 30 degrees from optimal angle
//        
//        PlotNearAngles(maxAngle, v0);
       }
   
      
   /**
    * Calculates the initial x-velocity
    * @param v0 the initial velocity
    * @param angleDegrees the angle, in degrees
    * @return the initial x-velocity
    */
   public static double calculateV0X(double v0, double angleDegrees) {
      double v0x = Math.cos(Math.toRadians(angleDegrees))*v0;
      
      return v0x;
   }
   
   
   /*
    * Calculates the initial y-velocity
    * @param v0 the initial velociy
    * @param angleDegrees the angle, in degrees
    * @return the initial y-velocity
    */
   public static double calculateV0Y(double v0, double angleDegrees) {
      double v0y = Math.sin(Math.toRadians(angleDegrees))*v0;
      return v0y;
   }
   
   
   /**
    * Finds the x-coordinate with the given initial x-velocity, v0x,
    * at the given time, t.
    * @param v0x the initial x-velocity
    * @param t the given time
    * @return the x-coordinate with the initial x-velocity at the given time
    */
   public static double calculateX(double v0x, double t){
      double x = v0x*t;
      return x;
      
   }
   
   
   
   
   /**
    * Finds the y-coordinate with the given initial y-velocity, v0y,
    * at the given time, t.
    * @param v0y the initial y-velocity
    * @param t the given time
    * @return the y-coordinate with the initial y-velocity at the given time
    */
   public static double calculateY(double v0y, double t){
      double y = (v0y*t)+(Ay/2*Math.pow(t,2));
      return y;
   }

   
   // Step 1:  Invoke method to calculate x and y postions and plot the projectile
   // as long as y is above ground level
   // print x,y, and t to track calculations
    /**
    * Calculates x and y positions to trace the path of the projectile until it hits the ground
    * @param v0x the initial x-velocity
    * @param v0y the initial y-velocity
    */   
   public static void calculateProjectile(double v0x, double v0y){
      while(y >= 0){
         t = t+dt;
         x = calculateX(v0x, t);
         y = calculateY(v0y, t);
         System.out.println(t+ ", "+x +" , "+y);
         plotProjectile(x,y);
      }
  
   }
   
   // Step 2: plot Robots
    /**
    * Declares and instantiates a robot at the given point (x, y)
    * Creates a 50x50 blank coordinate map
    * @param x the x-coordinate
    * @param y the y-coordinate
    */   
   public static void plotProjectile(double x, double y){
      int xPlot = (int) x;
      int yPlot = (int) y;
      Display.setSize(100,100);
      new Robot(xPlot, yPlot, Display.NORTH, 0);
   }
   
    
    /**
    * Determines optimal angle for maximum range 
    * by testing angles between 0-90 for a set initial velocity
    * @param v0 the initial velocity
    * @return the optimal angle (in degrees)
    */   
    public static double optimalAngle(double v0){
      for(int i = 1; i< 90; i++){
         x = 0;
         y = 0;
         t = 0;
         v0y = calculateV0Y(v0, i);
         v0x = calculateV0X(v0, i); 
         while(y>= 0){
            t = t+dt;
            y = calculateY(v0y, t);
            x = calculateX(v0x, t);
            if(x>= maxRange){
               maxAngle = i;
               maxRange = x;
            }           
         }  
         
       }         
       return maxAngle;
       
    }
    
    
    // Step 4: 
    // Plot the given angle, +/- 15 degrees and +/- 30 degrees from given angle
    // add method here
    public static void PlotNearAngles(double maxAngle, double v0){
      for(double angle = maxAngle-30; angle<maxAngle+30; angle = angle+15 ){
         x = 0;
         y = 0;
         t = 0;
         v0y = calculateV0Y(v0, angle);
         v0x = calculateV0X(v0, angle); 
         while(y>= 0){
            t = t+dt;
            y = calculateY(v0y, t);
            x = calculateX(v0x, t);
            int xCoordinate = (int) x;
            int yCoordinate = (int) y;
            Display.setSize(100,100);
            new Robot(xCoordinate, yCoordinate, Display.NORTH, 0);
         }
         if(angle == maxAngle){
            System.out.println("The optimal angle is: " +angle+ "and the maximum range  is: " +x);  
         } else {
            System.out.println("The range for: "+angle+" is: "+x);  
         }          
         }  
         
       }         

    }
    
 

