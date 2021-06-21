import java.util.Scanner;

public class MultiplicationTable {
	 public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the size of the multiplication table: ");
	        int table = scanner.nextInt();
	        int[][] multipliList = new int[table+1][table+1];
	        for(int i = 1; i<=table; i++) {
	            for(int j = 1; j<=table; j++) {
	                multipliList[i][j] = i*j;
	                if(j != table) {
	                    System.out.print(multipliList[i][j]+"\t");
	                } else if(j == table) {
	                    System.out.println(multipliList[i][j]+"\t");
	                } else {
	                    System.out.println("");
	                }
	            }
	        }
	    }
}
