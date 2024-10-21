
public class Car {
	public String name;
	public String make;
	public String model;
	public int year;
	public int numSeats;
	public int speed; // Notice not initializing in constructor
	public Person[] passengers;

	public Car(String name, String make, String model, int year, int numSeats) {
		this.name = name;
		this.make = make;
		this.model = model;
		this.year = year;
		this.numSeats = numSeats;
		this.passengers = new Person[numSeats];
//		 int[] x = new int[3];
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

	public void reverse() {
		// Using a negative number for the speed to represent
		// going backwards
		this.speed = -4;
		this.beep();
	}

	public void beep() {
		System.out.println("Beep!");
	}

	public boolean addPassenger(Person person) {
		boolean wasAdded = false;
		for (int i = 0; i < this.passengers.length; i++) {
			if (this.passengers[i] == null) {
				// empty seat
				this.passengers[i] = person;
				wasAdded = true;

				break;
			}
		}

		return wasAdded;
	}

	/**
	 * 
	 * @param people An array of Person objects to add to this Car
	 * @return The number of passengers added.
	 */
	public int addPassengers(Person[] people) {
		int numAdded = 0;
		for(int i= 0; i < people.length; i++) {
			if(this.addPassenger(people[i])) {
				numAdded++;
			}
			
		}
		
		return numAdded;
	}

	public void printPassengers() {
		System.out.println(this.name + " passengers: ");
		
		if(this.passengers[0] == null) {
			System.out.println(this.name + " has no passengers.");
			return;
		}
		
		// go through array & print out every person's name in there
		for (int i = 0; i < this.passengers.length; i++) {			
			if(this.passengers[i] == null) {
				break;
			}
			
//			Person curPassenger = this.passengers[i];
			System.out.println(this.passengers[i].name);
		}
	}

}
