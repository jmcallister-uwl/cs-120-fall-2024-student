
public class Demo {

	public static void main(String[] args) {
		Person personOne = new Person("Bob");
		Person personTwo = new Person("Tom");
		Person personThree = new Person("Sally");
		Person personFour = new Person("Alice");
		Person personFive = new Person("Tyler");
		Person personSix = new Person("Hunter");
		Person personSeven = new Person("Tony");
		Person personEight = new Person("Jack");
//		
		Car carOne = new Car("Bucky", "Ford", "Explorer", 2024, 4);
		carOne.addPassenger(personOne);
		carOne.addPassenger(personTwo);
		
		carOne.printPassengers();

	}

}
