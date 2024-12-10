public class VehicleDriver {

	public static void main(String[] args) {
//		Jet jetOne = new Jet("fighter", "Class A", 100);
//
//		System.out.println(jetOne.toString());
//
//		jetOne.land();

		System.out.println("=================================");

		Airplane airplane = new Airplane("Boeing 747", "Commercial", 100);
		Jet jet = new Jet("F-16", "Fighter", 5000);

		airplane.drive(10000, 500);
		airplane.stop();
//		System.out.println(airplane);

		jet.drive(15000, 800);
		jet.land();
//		System.out.println(jet);
		System.out.println();

		Airplane[] airplanes = { airplane, jet };

		for(int i = 0; i < airplanes.length; i++) {
			airplanes[i].drive(5000, 300);
			System.out.println("Light intensity: " + airplanes[i].lightIntensity());
			airplanes[i].stop();

			// printing blank new line for formatting
			System.out.println();
//			System.out.println(airplanes[i]);
		}

	}

}