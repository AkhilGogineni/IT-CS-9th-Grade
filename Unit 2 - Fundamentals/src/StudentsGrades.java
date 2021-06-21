import java.util.ArrayList;
import java.util.Scanner;

public class StudentsGrades {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayList<Integer> studentGrades = new ArrayList<Integer>();
		double avg = 0;
		int counter = 0;
		double total = 0;

		
		while(1 == 1) {
			System.out.println("Enter a grade or '-1' to quit: ");
			int grade = scan.nextInt();
			studentGrades.add(grade);
			if(grade == -1) {
				studentGrades.remove(studentGrades.size()-1);
				break;
			} 
			
		}
		
		System.out.println(studentGrades);
		for(int i = 0; i<studentGrades.size(); i++) {
			int temp = studentGrades.get(i); 
			total = temp + total;
			avg = total/studentGrades.size();
		}
		
		System.out.println(avg);
		
		for(int i = 0; i<studentGrades.size(); i++) {
			if(studentGrades.get(i) > avg) {
				counter++;
			}
		}
		System.out.println("There are "  + counter + " higher than the average score.");
	}

}
