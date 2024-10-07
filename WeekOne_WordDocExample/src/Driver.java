
public class Driver {

	public static void main(String[] args) {
		// There is an integer, called x, which has a value of 8.
		int x = 8;
		
		int y = 16;
		
		int sum = x + y;
		
		System.out.println("Sum: " + sum);
		
		sum = sum / 4;
				
		if (sum < 2) {
			System.out.println("Sum is less than 2!");
			
		} else {
			System.out.println("Sum is NOT less than 2!");
			System.out.println("Sum: " + sum);
		}

	}

}
