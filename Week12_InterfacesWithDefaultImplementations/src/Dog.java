
public class Dog implements Greetable {
	private String name;

	public Dog(String name) {
		this.name = name;
	}

	/*
	 * The class provides its own implementation, which overrides the interface's
	 * default.
	 */
	@Override
	public void greet() {
		System.out.println("Woof!");
	}
}
