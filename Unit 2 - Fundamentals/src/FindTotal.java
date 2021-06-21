import java.util.Scanner;

public class FindTotal {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double x = 1;
		double total = 0;
		while(x != 0) {
			System.out.println("Enter an integer or 0 to quit: ");
			x = scan.nextDouble();
			total = x + total;
		}
		System.out.println("The total is " + total);
	}

}
