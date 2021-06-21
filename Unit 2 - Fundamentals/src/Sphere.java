import java.util.Scanner;
import java.text.DecimalFormat;

public class Sphere {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a radius: ");
		double r = scan.nextDouble();
		
		
		
		double volume = (4 / 3) * Math.PI * Math.pow(r, 3);
		double surfaceArea = 4 *Math.PI * Math.pow(r, 2);
		
		String pattern = "#.####";
		DecimalFormat numberFormat = new DecimalFormat (pattern);
		
		System.out.println("The volume of the sphere is: " + numberFormat.format(volume));
		System.out.println("The Surface Area of the sphere is: "+ numberFormat.format(surfaceArea));
		

	}

}
