
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
				y = x / y; // y = 20 / 4 = 5 
				System.out.println("def: " + y);

			}

		}

		if (x <= 30) {
			z = (3 * x) - y; // z = (3 * 20) - 5 = 60 - 5 = 55
			System.out.println("ghi: " + z);

		} else if (x <= 40) {
			z += x;
			System.out.println("jkl: " + z);
			
		}

	}

}
