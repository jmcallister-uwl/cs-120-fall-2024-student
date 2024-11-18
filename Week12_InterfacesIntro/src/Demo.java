
public class Demo {

	public static void main(String[] args) {
		
		Flyable bird = new Bird(); // bird variable is of type Flyable
		bird.fly(); // Calls Bird's implementation of Fly		
		
		Flyable airplane = new Airplane(); // airplane variable is of type Flyable
		airplane.fly(); // Calls Airplane's implementation of Fly

	}

}
