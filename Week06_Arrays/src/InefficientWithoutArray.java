import java.util.Scanner;

public class InefficientWithoutArray {

	public static void main(String[] args) {
		double quizOne, quizTwo, quizThree, quizFour;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 4 quiz scores:");

		System.out.println("Enter score 1: ");
		quizOne = input.nextDouble();

		System.out.println("Enter score 2: ");
		quizTwo = input.nextDouble();

		System.out.println("Enter score 3: ");
		quizThree = input.nextDouble();

		System.out.println("Enter score 4: ");
		quizFour = input.nextDouble();
		
		// Print the scores
		System.out.println("Quiz scores entered:");
		System.out.println("Quiz score 1: " + quizOne);
		System.out.println("Quiz score 2: " + quizTwo);
		System.out.println("Quiz score 3: " + quizThree);
		System.out.println("Quiz score 4: " + quizFour);
		
		input.close();

	}

}
