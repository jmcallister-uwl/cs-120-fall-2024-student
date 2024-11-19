
public class Person implements Greetable {
	private String name;

	public Person(String name) {
		this.name = name;
	}

	/*
	 * The class does not provide its own implementation, so the interface's default
	 * Greet() method is used.
	 */
}