import java.util.Scanner;

public class RandomNumbers {
	
	// generates a given number of random numbers between 0 and 1, excluding 1.
	// prints in a vertical column
	public static void randomDoubleGenerator(int number) {
		for(int i = 0; i < number; i++) {
			System.out.println(Math.random()+ " ");
		}
	}
		
	// generates the requested number of integers between 15 and 22, including 22.
	// prints in a single line separated by spaces
	public static void fifteenTo22Integers(int number) {
		for(int i = 0; i < number; i++) {
			System.out.print((int)(Math.random() * 8) + 15 + " ");
			
		}
		
	}

	
	// generates random integer within a user-specified range
	public static void guessMyNumber() {
		Scanner scan = new Scanner(System.in);
		System.out.println(" ");
		System.out.println("Enter the first number");
		int first = scan.nextInt();
		int last = scan.nextInt();
		int range = last - first;
		System.out.println((int)(Math.random() * range) + first);
	}
	
	// simulates the rolling of two six-sided dice
	public static void diceGame() {
		int dice1 = (int)(Math.random() * 6) + 1;
		int dice2 = (int)(Math.random() * 6) + 1;
		System.out.println(dice1);
		System.out.println(dice2);
		if(dice1+dice2 <= 6) { 
			System.out.println("You Lose :(");
		} else if (dice1 + dice2 == 7) {
			System.out.println("You win a special prize!");
		} else if (dice1 + dice2 <= 12  && dice1 + dice2 > 7) {
			System.out.println("You win!");
		}
	}
	
	public static void main(String[] args) {
		// calls the random generator methods, remember to add your methods here!
		randomDoubleGenerator(5);
		fifteenTo22Integers(3);
		guessMyNumber();
		diceGame();
	}
}
