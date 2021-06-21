//Calculator.java
//ITCS 
//The purpose of this class is to practice writing class methods that return calculated values
//using the java Math class.  
//See the API for more info on the methods defined in the Math class
//https://docs.oracle.com/javase/8/docs/api/java/lang/Math.html

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;
import javax.swing.JOptionPane;


public class Calculator{


  
   public static void main(String[] args) {
      
      String mathType = JOptionPane.showInputDialog("Please enter math operation");
      System.out.println(mathType);
    	String escapeType;
      
		if(mathType.equals("Addition")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Addition: "+ value1+" + "+value2+" = "+add(value1,value2));
      }
      else if(mathType.equals("Subtraction")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Subtraction: "+ value1+" - "+value2+" = "+subtract(value1,value2));
      }
      else if(mathType.equals("Multiplication")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Multiplication: "+ value1+" * "+value2+" = "+multiply(value1,value2));
      }
      else if(mathType.equals("Division")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Division: "+ value1+" / "+value2+" = "+divide(value1,value2));
      }
      else if(mathType.equals("Maximum Value")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Maximum value: "+ findMax(value1,value2));
      }
      else if(mathType.equals("Minimum Value")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Minimum value: "+ findMin(value1,value2));
      }
      else if(mathType.equals("Square Root")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter value"));
     		System.out.println("Square root of "+ value1+":"+ " = "+ squareRoot(value1));
      }
      else if(mathType.equals("Power")){
         double value1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double value2 = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Power: "+ value1+"^"+value2+" = "+ power(value1,value2));
      }
      else if(mathType.equals("GetX")){
         double angleDegrees = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double hypotenuse = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
         System.out.println("Angle = " +  angleDegrees + " and Hypotenuse = " + hypotenuse + " X-Component is " + Xcomponent(angleDegrees,hypotenuse));

      }
      else if(mathType.equals("GetY")){
         double angleDegrees = Double.parseDouble(JOptionPane.showInputDialog("Please enter first value"));
         double hypotenuse = Double.parseDouble(JOptionPane.showInputDialog("Please enter second value"));
		   System.out.println("Angle = " +  angleDegrees + " and Hypotenuse = " + hypotenuse + " Y-Component is " + Ycomponent(angleDegrees, hypotenuse));
      } 
      else if(mathType.equals("PlotALine")){
         int rise = Integer.parseInt(JOptionPane.showInputDialog("Please enter first value"));
         int run  = Integer.parseInt(JOptionPane.showInputDialog("Please enter first value"));
         slope(rise, run);
      } else {
         escapeType = JOptionPane.showInputDialog("The Math Operation you entered was invalid. Type something to escape.");
      }

      
      




    
  }
  
   // Example method: add method returns the sum of two doubles
  public static double add(double input1, double input2){
    
    return input1 + input2;
  }
  
  // Find the difference of input1 and input2
  public static double subtract(double input1, double input2) {
      double diffrence = input1 - input2;
      return diffrence;
  }
  
 // Write the multiply and divide methods
 public static double multiply(double input1, double input2) {
      double product = input1*input2;
      return product;
 }
  
 public static double divide(double input1, double input2) {
      double quotient = input1/input2;
      return quotient;
 }
  
 // Write the findMax and findMin methods  using Math.max and Math.min
public static double findMax(double input1, double input2) {
      double larger = Math.max(input1, input2);
      return larger;
}
 
 public static double findMin(double input1, double input2) {
      double smaller = Math.min(input1, input2);
      return smaller;
}

 // Write the squareRoot method to find the square root of input1 using Math.sqrt
 public static double squareRoot(double input1) {
      double sqrt = Math.sqrt(input1);
      return sqrt;
 }
 
 // Write the power method (value1 to the power of value2) using Math.pow
 public static double power(double input1, double input2) {
      double power = Math.pow(input1, input2);
      return power;
 }
 
 // Write the pythagorean theorem method (c^2 = a^2 + b^2)
 // Using value1 for c and value2 for a calculate and return b
 public static double pythagorean(double input1, double input2) {
      double b = Math.sqrt(Math.pow(input1,2) - Math.pow(input2,2));
      return b;

 }
 
 public static double Xcomponent(double angleDegrees, double hypotenuse){
    angleDegrees = Math.toRadians(angleDegrees);
    double x = Math.cos(angleDegrees)*hypotenuse;
    return x;
 }
 
 public static double Ycomponent(double angleDegrees, double hypotenuse){
    angleDegrees = Math.toRadians(angleDegrees);
    double y = Math.sin(angleDegrees)*hypotenuse;
    return y;
 }
 public static void slope(int rise, int run){
   Display.openWorld(" ");
   Display.setSize(20,20);
   int newrise = 0;
   int newrun = 0;
     for (int i = 0; i<5; i++){
         newrise = newrise+rise;
         newrun = newrun+run;
         System.out.println("("+newrise+","+newrun+")");
         new Robot(newrise, newrun, Display.NORTH, 0);
     }
 } 
}
