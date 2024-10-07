import java.util.Scanner;

public class Counting {

	public static void main(String[] args) {
		long start = 0;
		long end = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter in an integer to start out count with:");
		start = input.nextLong();
		System.out.println("Enter in an integer (which larger than the previous one) to count up to:");
		end = input.nextLong();
		
		// Notice that we can have "i" be a long data type
		for(long i = start; i <= end; i++) {
			System.out.println(i);
		}
		
		input.close();
	}

}
