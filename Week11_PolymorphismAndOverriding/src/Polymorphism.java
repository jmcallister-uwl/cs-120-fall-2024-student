
public class Polymorphism {

	public static void main(String[] args) {
		// Creating instance of Vehicle
		Vehicle vehicleOne = new Vehicle();
		
		// Creating instances of Airplane
		Airplane airplaneOne = new Airplane("Delta", 35000, 2);
		Airplane airplaneTwo = new Airplane("American Airlines", 38000, 4);
		Airplane airplaneThree = new Airplane("Southwest", 36000, 2);

		// Creating instances of Automobile
		Automobile carOne = new Automobile("ABC123", 5, true);
		Automobile carTwo = new Automobile("XYZ789", 7, false);
		Automobile carThree = new Automobile("LMN456", 4, true);

		// Creating instances of Boat
		Boat boatOne = new Boat(30.5, true, "Yacht");
		Boat boatTwo = new Boat(20.0, false, "Fishing Boat");
		Boat boatThree = new Boat(15.5, true, "Sailboat");
		
		
		Vehicle[] vehicleList = { vehicleOne, airplaneOne, carOne, boatOne };
		
		for(int i = 0; i < vehicleList.length; i++) {
			Vehicle curVehicle = vehicleList[i];
			
			// Can call drive() because drive() is defined for all Vehicles
			curVehicle.drive();
		}

	}

}
