
public class PrintStringBackwards {

	public static void main(String[] args) {
		String phrase = "UWL";
		

		for(int i = phrase.length() - 1; i >= 0; i--) {
			System.out.print(phrase.charAt(i));
		}

		System.out.println("\nProgram Done!");

	}

}
