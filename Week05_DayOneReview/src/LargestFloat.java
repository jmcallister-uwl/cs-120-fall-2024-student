
public class LargestFloat {

	public static void main(String[] args) {
		/**
		 * 
		 * Objective: Write a program that finds the largest among three float numbers.
		 * 
		 * 
		 * 1) Declare three int variables.
		 * 2) Initialize them with values. 
		 * 3) Determine and print out the largest number with a 
		 * 		message saying, "The largest number is: X."
		 */

		int x = 400;
		int y = 400;
		int z = 400;

		if (x >= y && x >= z) {
			// x is greatest
			System.out.println("Largest: " + x);

		} else if (y >= x && y >= z) {
			// y is greatest
			System.out.println("Largest: " + y);

		} else {
			// z is greatest
			System.out.println("Largest: " + z);
		}

	}

}
