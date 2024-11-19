import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		/*
		* Printing colored text in terminal references if interested:
		* 
		* https://www.tutorialspoint.com/how-to-print-colored-text-in-java-console
		* https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println
		* 
		* */

		String CYAN = "\u001B[36m";
		String GREEN = "\u001B[32m";
		String RESET = "\u001B[0m";

		String[] words = {"apple", "blueberry", "cherry", "date"};
				
		System.out.println(CYAN + "Array before removal:" + RESET);
		System.out.println(Arrays.toString(words));
		System.out.println("\n==================================\n");
				
		// The index we wish to remove an element from
		int indexToRemove = 1;

		// Get the String that we are removing out of the array
		// before setting that index to null
		String removedWord = words[indexToRemove];

		// Clear the index we are removing something from
		words[indexToRemove] = null;

		// Now shift all the elements so that we do not have a gap
		// in the array.
		for(int i = indexToRemove; i < words.length - 1; i++) {
			words[i] = words[i + 1];
		}

		// Set the last index to null.
		words[words.length - 1] = null;

		// Printing out the contents of the array so that
		// we can see that our removal worked
		System.out.println(GREEN + "Array after removal:" + RESET);
		System.out.println(Arrays.toString(words));

	}

}
