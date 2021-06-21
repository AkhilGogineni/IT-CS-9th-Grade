import java.util.Scanner;

public class StringBasics {

	/* Given a name, return a greeting.
	 * Input: Matt
	 * Output: Hello Matt! Have a nice day!
	 */
	public static String greet(String name) {
		System.out.println("Hello " + name + "! Have a nice day!");
		return ""; 
	}
	
	/* Given a String, return the word/sentence reversed
	 * Input: Hello!
	 * Output: !olleH
	 */
	public static String reverse(String s) {
		char[] word = s.toCharArray();
		String filler = "";
		 for (int i = 0; i < s.length(); i++) {
	            if (i == s.length() - 1)
	                filler = word[i] + filler;
	            else
	                filler = "" + word[i] + filler;
	     }
		System.out.println(filler);
		return ""; 
	}
	
	/* Given a full name return it in the format Last, First
	 * Input: Wayde Byard
	 * Output: Byard, Wayde
	 */
	public static String lastFirst(String fullName) {
		int index1 = fullName.indexOf(' ');
		String firstName = fullName.substring(0,index1);
		int index2 = fullName.lastIndexOf(' ');
		String lastName = fullName.substring(index2+1);
		System.out.println(lastName + ", " + firstName);
		
		return ""; 
	}
	
	/* Given a full name return the proper initials
	 * Input: Albus Percival Wulfric Brian Dumbledore
	 * Output: APWBD
	 */
	public static String initials(String fullName) {
		String[] myName = fullName.split(" ");
		for (int i = 0; i < myName.length; i++) {
		    String s = myName[i];
		    System.out.print(s.charAt(0));
		}
		
		System.out.println(" ");
		return ""; 
	}
	
	/* Given a String, return the number of vowels it contains (AEIOU)
	 * Hint: convert the String to upper or lower case first because a != A
	 * Input: Hello
	 * Output: 2
	 */
	public static int countVowels(String s) {
		int counter  = 0;
		s = s.toLowerCase();
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
				counter = counter + 1;
			}
		}
		System.out.println(counter);
		return counter; 
	}
	
	public static void main(String[] args) {
		/* Ask the user to enter a name via Scanner
		 * Run all of your methods with that name and print the results
		 * Repeat the above until the user enters "quit"		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter your Full Name!");
		String name = scan.nextLine();
		
		String next;
		String quit = "quit";
				
				next = scan.nextLine();
			
			for(int i = 0; i<6; i++) {
				if(!next.equals(quit)) {
					greet(name);
					
				} else {
					break;
				}
				next = scan.nextLine();
				if(!next.equals(quit)) {
					reverse(name);
				} else {
					break;
				}
				next = scan.nextLine();
				if(!next.equals(quit)) {
					lastFirst(name);
				} else {
					break;
				}
				next = scan.nextLine();
				if(!next.equals(quit)) {
					initials(name);
				} else {
					break;
				}
				next = scan.nextLine();
				if(!next.equals(quit)) {
					countVowels(name);
				} else {
					break;
				}
			}
		

	}

}