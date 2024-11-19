
public class Computer implements Loggable {
	
//	@Override
//	public static void log() {
//		System.out.println("Computer logging!");
//	}
	
	@Override
	public void displayMessage(String message) {
		System.out.println("Message: " + message);
	}

}
