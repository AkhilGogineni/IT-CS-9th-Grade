import java.util.Scanner;

public class AverageNumbers {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 3 numbers to find the average of them:");
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double z = scan.nextDouble();
		
		double average = (x+y+z)/3;
		System.out.println("The average of these numbers are " + average);
	}

}
