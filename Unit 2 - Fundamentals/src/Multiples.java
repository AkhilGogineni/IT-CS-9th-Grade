import java.util.Scanner;

public class Multiples {

	public static void main (String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Calculate the first 10 multiples of: ");
		double x = scan.nextDouble();
		for(int i = 1; i<10; i++) {
			double y = x*i;
			System.out.println(y);
		}
		System.out.println("Enter a multiple of " + x + " to find: ");
		double z = scan.nextDouble();
		double a = z*x;
		System.out.println(a);
	}

}
