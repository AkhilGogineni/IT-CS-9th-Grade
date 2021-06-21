import java.util.Scanner;

public class ConvertToDMY {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a total amount of days: ");
		int x = scan.nextInt();
		
		int years = x/365;
		int leftover = x%365;
		int months = leftover/30;
		leftover = leftover%30;
		int days = leftover;
		
		System.out.println(years + " years, " + months + " months, " + days + " days");
	}

}
