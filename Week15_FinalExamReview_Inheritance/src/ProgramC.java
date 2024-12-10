public class ProgramC {
	public static void main(String[] args) {
		Beta b = new Gamma(9, 8);
		Alpha a = b;
		System.out.println("Value: " + a.getValue());
	}
}