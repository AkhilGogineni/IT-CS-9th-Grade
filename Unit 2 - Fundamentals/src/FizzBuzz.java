
public class FizzBuzz {

	public static void main(String[] args) {
		for(int i = 0; i<100; i++) {
			int mofT = i%3;
			int mofF = i%5;
			if(mofT == 0 && mofF == 0) {
				System.out.println("FizzBuzz");
			} else if(mofT == 0) {
				System.out.println("Fizz");
			} else if(mofF == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
			
		}

	}

}
