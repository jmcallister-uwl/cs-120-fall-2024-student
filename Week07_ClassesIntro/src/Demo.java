
public class Demo {

	public static void main(String[] args) {
		String phrase = new String("Hello World!");
		
		Car carOne = new Car("Dorthy", "Tan", 4);
		Car carTwo = new Car("Tommy", "Blue", 8);
		
//		System.out.println("carOne prop: " + carOne.name );
//		System.out.println("carTwo prop: " + carTwo.name );
		
		carOne.drive();
		carTwo.drive();
	}

}
