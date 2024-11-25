
public class ArrayExampleC {

	public static void main(String[] args) {
		String[] values = { "apple", "null", "cherry", "date", "elderberry", "fig", "grape", "honeydew", "kiwi",
				"lemon", "mango", "nectarine" };

		for (int i = 3; i <= values.length; i += 3) {
			System.out.println(values[i]);
		}

	}

}
