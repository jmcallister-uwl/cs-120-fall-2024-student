
public class Intro {

	public static void main(String[] args) {
		System.out.println("======================= AIRPLANES ===========================");
		// Creating instances of Airplane
		Airplane airplaneOne = new Airplane("Delta", 35000, 2);
		Airplane airplaneTwo = new Airplane("American Airlines", 38000, 4);
		Airplane airplaneThree = new Airplane("Southwest", 36000, 2);

		// Accessing some methods for Airplane instances
		airplaneOne.drive();
		airplaneTwo.deployLandingGear();
		airplaneThree.engineCheck();

		System.out.println("======================= AUTOMOBILES ===========================");

		// Creating instances of Automobile
		Automobile carOne = new Automobile("ABC123", 5, true);
		Automobile carTwo = new Automobile("XYZ789", 7, false);
		Automobile carThree = new Automobile("LMN456", 4, true);

		// Accessing some methods for Automobile instances
		carOne.drive();
		carTwo.honk();
		carThree.batteryCheck();

		System.out.println("======================= BOATS ===========================");

		// Creating instances of Boat
		Boat boatOne = new Boat(30.5, true, "Yacht");
		Boat boatTwo = new Boat(20.0, false, "Fishing Boat");
		Boat boatThree = new Boat(15.5, true, "Sailboat");

		// Accessing some methods for Boat instances
		boatOne.drive();
		boatTwo.anchor();
		boatThree.sailCheck();

	}

}
