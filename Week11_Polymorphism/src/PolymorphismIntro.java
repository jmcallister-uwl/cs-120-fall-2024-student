
public class PolymorphismIntro {

	public static void main(String[] args) {

		System.out.println("====================== POLYMORPHISM IDEAS ========================");

		Vehicle tester = new Airplane("United", 38000, 4);
		
		tester.drive();

//		System.out.println(tester.getAirline());

		System.out.println("====================== CHECK INSTANCE TYPE ========================");
//		 Using instanceof to check type at runtime
        if (tester instanceof Airplane) {
            System.out.println("The object is an instance of Airplane.");
        }
        
        if (tester instanceof Vehicle) {
            System.out.println("The object is an instance of Vehicle.");
        }

        // Using getClass() to get the exact runtime type
        System.out.println("Runtime type of tester is: " + tester.getClass().getName());

        
        System.out.println("====================== CASTING ========================");
        
		// Can cast to allow us to us the runtime type of Airplane.
		System.out.println(((Airplane) tester).getAirline());

		// Can cast and place into "container" for more specific Vehicle
		Airplane testerAsPlane = (Airplane) tester;

		testerAsPlane.deployLandingGear();

		// Notice no compilation errors.
//		((Boat)tester).anchor();

		tester = new Boat(32, true, "Yacht");
		((Boat) tester).anchor();

		System.out.println("====================== POLYMORPHISM ========================");

	}

}
