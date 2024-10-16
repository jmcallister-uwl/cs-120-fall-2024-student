
public class Car {	
	public String name;
	public String make;
	public String model;
	public int year;
	public int numSeats;
	public Person[] passengers;
	public int speed; // Notice not initializing in constructor

	/**
	 * TODO:
	 * Create an instance variable for storing passengers.
	 * What data type should it be?
	 * */ 
	
	public Car(String name, String make, String model, int year, int numSeats) {
		this.name = name;
		this.make = make;
		this.model = model;
		this.year = year;
		this.numSeats = numSeats;
		this.passengers = new Person[this.numSeats];
	}	

	public void drive(int speed) {		
		this.speed = speed;
	}
	
	public void accelerate(int amount) {
		this.speed += amount;
	}
	
	public void decelerate(int amount) {
		this.speed -= amount;
	}
	
	public void stop() {
		this.speed = 0;
	}
	
	public String beep() {
		return "Beep!";
	}
	
	public void reverse() {
		this.speed = -4;
		this.beep();
	}
	
	public boolean addPassenger(Person passenger) {
		boolean wasAdded = false;
		for(int i = 0; i < this.passengers.length; i++) {
			if(this.passengers[i] == null) {
				// empty seat
				this.passengers[i] = passenger;
				wasAdded = true;
				
				break;
			}
		}
		
		return wasAdded;
	}

	
	public int addPassengers(Person[] people) {
		int peopleAdded = 0;		
		
		for(int i = 0; i < people.length; i++) {
			boolean wasAdded = this.addPassenger(people[i]);
			
			if(wasAdded) {
				peopleAdded++;
				
			} else {
				// no more room
				break;
			}
		}
		
		return peopleAdded;
	}
	
	public void printPassengers() {
		System.out.println(this.name + " passengers: ");
		for(int i = 0; i < this.passengers.length; i++) {
			if(this.passengers[i] == null) {
				break;
			}
			
			System.out.println(this.passengers[i].name);
		}
	}

}
