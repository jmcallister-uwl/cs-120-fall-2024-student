import java.util.Scanner;

public class LoopControl {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the number of iterations to perform:");
		int numIterations = input.nextInt();
		
		for(int i = 0; i < numIterations; i++) {
			System.out.println("i: " + i);
			
			if(i == numIterations - 1) {
				System.out.println("Restart loop?");
				String answer = input.next();
				if(answer.equalsIgnoreCase("yes")) {
					// restart loop
					i = -1;
					
				}
			}
			
		}
		
		
		System.out.println("Program Done!");
		input.close();
	}

}
