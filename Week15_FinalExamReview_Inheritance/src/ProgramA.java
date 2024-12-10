public class ProgramA {
	public static void main(String[] args) {
		Alpha a = new Alpha(7);
		Beta b = a;
		System.out.println("Value: " + b.getValue());
	}
}