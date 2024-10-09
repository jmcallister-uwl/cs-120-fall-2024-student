import java.util.Scanner;

public class EfficientWithArray {

	public static void main(String[] args) {
		double[] quizScores = new double[4];
		Scanner input = new Scanner(System.in);

		for(int i = 0; i < quizScores.length; i++) {
			System.out.println("Enter quiz score " + (i + 1) + ": ");
			quizScores[i] = input.nextDouble(); 
		}

		for(int i = 0; i < quizScores.length; i++) {
			System.out.println("Quiz score " + (i + 1) + ": " + quizScores[i]);
		}

		input.close();
	}

}
