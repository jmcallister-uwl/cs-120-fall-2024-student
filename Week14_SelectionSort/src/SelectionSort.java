public class SelectionSort {

	// Having one constructor and making it private is Java's way
	// of creating a static class.
	private SelectionSort() {
		
	}

	/*
	 * Explanation of algorithm: https://www.geeksforgeeks.org/selection-sort/
	 */

	public static void sort(int arr[]) {

		// One by one move boundary of unsorted subarray
		for (int i = 0; i < arr.length - 1; i++) {
			/*
			 * Must find the minimum element in unsorted array. Assume initially that it is
			 * the element we are looking at with i. If we find a smaller element, we will
			 * update minIndex accordingly.
			 */
			int minIndex = i;

			/*
			 * Starting j at i + 1, because we will be comparing the value at j to the value
			 * at minIndex - which is initially starting at i, as we can see with the above
			 * line.
			 */
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			/*
			 * Now that we have completed the inner loop and found the index with the
			 * minimum element, we can swap the found minimum element with the first
			 * element.
			 */
			int temp = arr[minIndex];
			arr[minIndex] = arr[i];
			arr[i] = temp;
		}
	}
}