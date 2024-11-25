
public interface Greetable {

	// A default implementation of the method.
    default void greet() {
        System.out.println("Hello from the interface!");
    }

}
