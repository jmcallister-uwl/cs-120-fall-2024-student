
public class Car {	
	public String name;
	public String make;
	public String model;
	public int year;
	public int numSeats;
	public int speed; // Notice not initializing in constructor
	
	public Car(String name, String make, String model, int year, int numSeats) {
		this.name = name;
		this.make = make;
		this.model = model;
		this.year = year;
		this.numSeats = numSeats;
	}	

	public void drive(int speed) {		
		this.speed = speed;
	}
	
	public void accelerate(int amount) {
		this.speed += amount;
	}
	
	public void decelerate(int amount) {
		// How could we improve this method?
		this.speed -= amount;
	}
	
	public void stop() {
		this.speed = 0;
	}
	
	public String beep() {
		return "Beep!";
	}
	
	public void reverse() {
		// Using a negative number for the speed to represent
		// going backwards
		this.speed = -4;
		this.beep();
	}
	
//	public boolean addPassenger(Person passenger) {
//		boolean wasAdded = false;
//		
//		return wasAdded;
//	}

	
//	public int addPassengers(Person[] people) {
//						
//		return 0;
//	}
	
//	public void printPassengers() {
//		System.out.println(this.name + " passengers: ");
//		
//	}

}
