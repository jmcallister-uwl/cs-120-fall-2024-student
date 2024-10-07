
public class PassByValue {

	public static void main(String[] args) {

		System.out.println("============= Initialization ===============");

		int x = 8;
		int y = 4;

		System.out.println("x => " + x);
		System.out.println("y => " + y);

		System.out.println("============= Re-Assignment ===============");

		x = y;

		y = 20;

		System.out.println("x => " + x);
		System.out.println("y => " + y);

	}

}
