
public class ArrayExampleD {

	public static void main(String[] args) {
		String[] words = new String[144];

		for (int i = words.length - 1; i >= 0; i -= 3) {
			System.out.println("words[" + i + "] length: " 
					+ words[i].length());
		}

	}

}
