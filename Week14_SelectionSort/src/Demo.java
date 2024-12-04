import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		/*
		 * Printing colored text in terminal references if interested:
		 * 
		 * https://www.tutorialspoint.com/how-to-print-colored-text-in-java-console
		 * https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-
		 * using-system-out-println
		 * 
		 */

		String CYAN = "\u001B[36m";
		String GREEN = "\u001B[32m";
		String RESET = "\u001B[0m";

		int arr[] = { 64, 25, 12, 22, 11 };

		System.out.println(CYAN + "Array before sorting:" + RESET);
		System.out.println(Arrays.toString(arr));
		System.out.println("\n==================================\n");

		/*
		 * Explanation of algorithm: https://www.geeksforgeeks.org/selection-sort/
		 */
		SelectionSort.sort(arr);

		// Printing contents of array
		System.out.println(GREEN + "Array after sorting:" + RESET);
		System.out.println(Arrays.toString(arr));

	}

}
