
public class Loops {

	public static void main(String[] args) {
		String s = "testing 1.2.3.";
		int y = s.length() - 1;

		while (y > 0) {
			System.out.print("|");
			char c = s.charAt(y);

			if (y % 2 == 0) {
				System.out.print("* " + c);

			} else if (c == '.') {
				System.out.println("#");

			} else {
				System.out.print("/" + c);
			}

			y -= 3;
		}

		System.out.println("!");

	}

}
