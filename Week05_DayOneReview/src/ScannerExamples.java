import java.util.Scanner;

public class ScannerExamples {

	public static void main(String[] args) {
		/**
		 * Demonstrating common mistakes. Notice that the program seems
		 * to not ask about the dessert even when we say we would like
		 * a "large". Also notice that the program seems to still be
		 * running... Why is this? What is the fix?
		 * 
		 * TODO:
		 * Take a coffee order. Determine what the customer would like for
		 * a size (small, medium, large), and then if the user orders a large, 
		 * ask if they would like a complimentary dessert with their order (yes/no).
		 * 
		 */
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Would you like your coffee to be a: small, medium, or large?");
		
		// Notice name of variable is descriptive
		String coffeeSize = input.next();
		String wantsDessert = input.next();
		
		if(coffeeSize.equalsIgnoreCase("large")) {
			System.out.println("Would you like complimentary dessert? (yes/no)");
			
		}
		
		System.out.println("Thank you for your order!");
		
		input.close();

	}

}
