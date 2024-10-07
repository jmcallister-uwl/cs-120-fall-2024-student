import java.util.Scanner;

public class ForLoopsRepeatedGreeting {

	public static void main(String[] args) {
		/**
		 * Demonstrating common mistakes.
		 * 
		 * TODO:
		 * 
		 * 1. Create a `Scanner` object to read user input. 
		 * 2. Ask the user to input a greeting message (e.g., `"Hello World!"`). 
		 * 3. Ask the user to input the number of times they want the greeting message to be displayed. 
		 * 4. Use a for-loop to print the greeting message that many times.
		 * 
		 */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a greeting:");
		String greeting = input.nextLine();
		
		System.out.println("How many times would you like the greeting repeated?:");
		int numTimes = input.nextInt();
		
		for(int i = 0; i < numTimes; i++) {
			System.out.println(greeting);
		}

	}

}
