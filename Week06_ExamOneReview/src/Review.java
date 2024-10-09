
public class Review {

	public static void main(String[] args) {		
		int x = 6;
		int y = 3;
		int z = 4;

		if (x < 10) {

			if (x < 5) {
				y += x;
				System.out.println("abc: " + y);

			} else {
				y = x / y;
				System.out.println("def: " + y);
			}
		}

		if (x < 20) {
			z = (3 * x) - y;
			System.out.println("ghi: " + z);

		} else if (x < 30) {
			z *= x;
			System.out.println("jkl: " + z);
		}

	}

}
