
public class Demo {

	public static void main(String[] args) {
        // Calling the static method on the interface.
        Loggable.log("This is a log message.");

        // Creating an instance of Computer and calling its method.
        Computer comp = new Computer();
        comp.displayMessage("This is a display message.");
    }

}
