import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of iterations to perform:");
		int numIterations = input.nextInt();
		
		for(int i = 0; i < numIterations; i++) {
			System.out.println("i: " + i);
			
			if(i == numIterations - 1) {
				System.out.println("Would you like to restart the loop? (yes/no):");
				String answer = input.next();
				
				if(answer.equals("yes")) {
					i = -1;
				}
				
			}
		}
		
		System.out.println("Program Done!");
		input.close();
	}

}
