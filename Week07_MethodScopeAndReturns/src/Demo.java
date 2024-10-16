
public class Demo {

	public static void main(String[] args) {
		Person personOne = new Person("Bob");
		Person personTwo = new Person("Tom");
		Person personThree = new Person("Sally");
		Person personFour = new Person("Alice");
		Person personFive = new Person("Tyler");
		Person personSix = new Person("Hunter");
		
		Person[] people = {personOne, personTwo, personThree, personFour};
		
		Car carOne = new Car("Dorthy", "Ford", "Explorer", 2024, 2);
		
		int result = carOne.addPassengers(people);
		
		System.out.println("result: " + result);
		
		carOne.printPassengers();
		
		
	}

}
