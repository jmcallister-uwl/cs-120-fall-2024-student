
public class Demo {

	public static void main(String[] args) {
		Flyable testFlyer = new Airplane();
		Bird birdOne = new Bird("Tweety");

		Airplane airplaneOne = new Jet("Jeff");
		Airplane airplaneTwo = new PropellerPlane("Peter");

		airplaneOne.fly();

		
		
		
		
		
		
		
//		Flyable[] fliers = { testFlyer, birdOne, airplaneOne, airplaneTwo };
//		
//		for(int i = 0; i < fliers.length; i++) {
//			fliers[i].fly();
//		}

	}

}
