//ITCS - Array Practice

//TODO: Complete each method and test
public class ArrayPractice {

	/* TODO:
	 * Traverse through the given array, nums
	 * Use System.out.print() to print each element of the array separated by a space
	 * Remember to use System.out.println() once at the very end to ready the console for new output
	 * Sample Output:
	 * 2 4 6 8 10 11 12
	 */
	private static void printArray(int[] nums) {
		for(int i = 0; i < nums.length; i++) {
			System.out.print(nums[i] + " ");
		}	
	}
	
	/* TODO:
	 * Given an array, nums, swap the position of the first and last element
	 * Ex.
	 * {2, 4, 6, 8} --> {8, 4, 6, 2}
	 * 
	 * Call printArray() passing in nums to verify that your code is correct
	 */
	private static void swapFirstLast(int[] nums) {
		int firstNumber = nums[0];
		int lastNumber = nums[nums.length-1];
		
		nums[nums.length-1] = firstNumber;
		nums[0] = lastNumber; 
		
		printArray(nums);
	}
	
	/*TODO:
	 * Given an array, nums, calculate and print the average of the values in the array
	 * Ex.
	 * {84, 92, 61, 89, 99, 74} --> 83
	 */
	private static void findAverage(int[] nums) {
		int total = 0;
		for(int i = 0; i < nums.length; i++) {
			total = total + nums[i];
		}
		double average1 = total/nums.length+1;
		System.out.println(average1);
	}
	
	/* TODO:
	 * Given an array, nums, find and return the INDEX OF
	 * the smallest number in the array
	 * Ex.
	 * {84, 92, 61, 89, 99, 74} --> 2
	 */
	private static void findSmallest(int[] nums) {
		int smallestNumber = 0;
		for(int i = 1; i < nums.length; i++) {
			if(nums[i] < nums[smallestNumber]) {
				smallestNumber = i;
			} 
		}
		
		System.out.println(smallestNumber);
	}
	
	
	/* TODO:
	 * Extension
	 * Given an array, nums, print "In Order" if the elements of the array are in ascending order.
	 * Print "Not In Order" otherwise. 
	 * Ex.
	 * {1, 5, 9, 9, 10, 50} -> In order
	 * {9, 3, 5, 10, 50, 25} -> Not In Order
	 * 
	 * Note: you may need to create your own array in main to test this
	 * 		 as the given array will very rarely be in order. 
	 */	
	public static void isInOrder(int[] nums) {
		int InOrder = 1;
			for(int i = 1; i < nums.length; i++) {
				if(nums[i] < nums[i-1]) {
					InOrder = 0;
					break;
				} else {
					InOrder = 1;
				}
			}
		
		if(InOrder == 0) {
			System.out.println("f");
		} else {
			System.out.println("t");
		}
	}
	
	//Creates two test arrays
	//TODO: Call your methods to test them
	public static void main(String[] args) {
		//Generates a test array of variable size and values. 
		int[] testArray = new int[(int) (Math.random() * 7 + 3)];
		for (int i = 0; i < testArray.length; i++) {
			testArray[i] = (int) (Math.random() * 25);
		}
		
		int[] testingArray = {1, 10, 100, 439, 4321, 12312};
		
		// TODO: call your methods here
		// Start by printing the array so we can see what values are in it
		System.out.println("Printed Array: ");
		printArray(testArray);
		System.out.println(" ");
		
		System.out.println("First and Last are swapped: ");
		swapFirstLast(testArray);
		System.out.println(" ");
		
		System.out.println("The average: ");
		findAverage(testArray);
		System.out.println(" ");
		
		System.out.println("Smallest index: ");
		findSmallest(testArray);
		System.out.println(" ");
		
		isInOrder(testingArray);
		
		
	}

}