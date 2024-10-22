
public class Demo {

	public static void main(String[] args) {
		Airplane planeOne = new Airplane("Boeing", 100);
		Airplane planeTwo = new Airplane("Delta", 100);
		
				
		System.out.println("Total Airplane instances created: " + Airplane.getNumAirplanesCreated());

	}

}
