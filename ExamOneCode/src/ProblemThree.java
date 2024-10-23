
public class ProblemThree {

	public static void main(String[] args) {
		int x = 20;
		int y = 4;
		int z = 7;

		if (x >= 10) {

			if (x > 25) {
				y *= x;
				System.out.println("abc: " + y);

			} else {
				y = x / y;
				System.out.println("def: " + y);

			}

		}

		if (x <= 30) {
			z = (3 * x) - y;
			System.out.println("ghi: " + z);

		} else if (x <= 40) {
			z += x;
			System.out.println("jkl: " + z);
			
		}

	}

}
