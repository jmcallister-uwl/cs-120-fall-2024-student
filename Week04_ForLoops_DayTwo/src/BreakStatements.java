
public class BreakStatements {

	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if (i == 9) {
				break;
			}
			
			System.out.println("i: " + i);
		}

		System.out.println("Program Done!");

	}

}
