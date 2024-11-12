
public class ObjectOverrideExamples {

	public static void main(String[] args) {
		Airplane airplaneOne = new Airplane("Delta", 35000, 2);
		Airplane airplaneTwo = new Airplane("American Airlines", 38000, 2);


		boolean result = airplaneOne.equals(airplaneTwo);
		
		System.out.println("result: " + result);

	}

}
