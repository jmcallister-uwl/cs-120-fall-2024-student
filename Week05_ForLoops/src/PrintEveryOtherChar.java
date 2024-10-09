
public class PrintEveryOtherChar {

	public static void main(String[] args) {

		String phrase = "Hello World";

		for (int i = 0; i < phrase.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(phrase.charAt(i));
			}
		}

		System.out.println("================== Another Approach: =================");

		for (int i = 0; i < phrase.length(); i += 2) {

			System.out.println(phrase.charAt(i));

		}

	}

}
