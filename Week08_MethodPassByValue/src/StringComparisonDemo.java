import java.util.Scanner;

public class StringComparisonDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String strOne = null;
		String strTwo = null;
		
		System.out.println("You will be asked for two Strings.");
		System.out.println("Enter your first String:");
		strOne = input.nextLine();
		
		System.out.println("Enter your second String:");
		strTwo = input.nextLine();
		
		boolean result = strOne == strTwo;
//		boolean result = strOne.equalsIgnoreCase(strTwo);
		
		System.out.println("Does '" + strOne + "' == '" + strTwo + "' ? ==> " + result);
		
		input.close();

	}

}
