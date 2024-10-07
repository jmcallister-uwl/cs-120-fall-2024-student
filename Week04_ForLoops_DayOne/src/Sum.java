
public class Sum {

	public static void main(String[] args) {
		int sum = 0;
		int start = 1;
		int end = 101;

        // For loop to sum all numbers from 1 to 100
        for (int i = start; i < end; i++) {
            sum += i; // Notice the use of the += operator as well
        }

        // Print the result
        System.out.println("The sum of numbers from " + start + " to " + end + " is: " + sum);

	}

}
