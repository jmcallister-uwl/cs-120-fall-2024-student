
public class Bird implements Flyable {

	@Override
	public void fly() {
		System.out.println("Bird is flying!");
	}

	public void tweet() {
		System.out.println("Bird is tweeting!");
	}
}
