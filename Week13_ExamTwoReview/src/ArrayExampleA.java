
public class ArrayExampleA {

	public static void main(String[] args) {
		int[] numbers = { 25, 35, 5, 15, 65, 45, 75, 55 };

		for (int i = 0; i <= numbers.length; i += 3) {
			if (i < numbers.length) {
				System.out.println(numbers[i]);
			}
		}

	}

}
