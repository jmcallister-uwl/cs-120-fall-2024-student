import java.util.Scanner;

public class StringCompareDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String guess;
		String passphrase = "java";
		
		System.out.println("Enter the passphrase: ");
		guess = input.nextLine();
		System.out.println("You entered: " + guess);
				
		if(guess.equalsIgnoreCase(passphrase) ) {
			System.out.println("CORRECT!");
			
		} else {
			System.out.println("WRONG!");
			
		} 

	}

}
