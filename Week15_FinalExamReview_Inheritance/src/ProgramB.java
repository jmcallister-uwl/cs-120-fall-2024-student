public class ProgramB {
	public static void main(String[] args) {
		Gamma g = new Gamma(4, 5);
		Alpha a = g;

		System.out.println("Value: " + a.getValue());

		a = new Delta(3, 5);

		System.out.println("Value: " + a.getValue());
	}
}