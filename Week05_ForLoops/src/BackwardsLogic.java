import java.util.Scanner;

public class BackwardsLogic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number to count down from:");
		int start = input.nextInt();

		for(int i = 0; i <= start; i--) {
		    System.out.println(i);
		}

	}

}
