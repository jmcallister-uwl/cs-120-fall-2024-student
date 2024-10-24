
public class Demo {

	public static void main(String[] args) {
		
		
		System.out.println("\n========= Example 1: Pass-by-value with primitives ====================\n");

		int firstHeight = 12;
		int secondHeight = 2;

		System.out.println("firstHeight: " + firstHeight);
		System.out.println("secondHeight: " + secondHeight);

		System.out.println("\n--------------------------------------------------");
		System.out.println("int result = HouseChanger.addMeasurements(firstHeight, secondHeight);");
		int result = HouseChanger.addMeasurements(firstHeight, secondHeight);
		System.out.println("--------------------------------------------------\n");

		System.out.println("result: " + result);
		System.out.println("firstHeight AFTER addMeasurements: " + firstHeight);

		System.out.println("\n==================================================================");

		
		System.out.println("\n========= Example 2: Pass-by-value with object references ====================\n");
		
		House houseOne = new House("Root Note", "green", 2);
		
		System.out.println("Color of 'houseOne': " + houseOne.color);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("HouseChanger.paintHouse(houseOne, \"red\");");
		HouseChanger.paintHouse(houseOne, "red");
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Color of 'houseOne' after paintHouse(): " + houseOne.color);	
		
		System.out.println("\n==================================================================");
		
//		
		System.out.println("\n========= Example 3: Method scope and local variables ====================\n");
		
		String materialOne = "wood";
		System.out.println("materialOne: " + materialOne);
	
		System.out.println("\n--------------------------------------------------");
		System.out.println("HouseChanger.materialTest(materialOne);");
		HouseChanger.materialTest(materialOne);
		System.out.println("--------------------------------------------------\n");		
		
		System.out.println("materialOne after materialTest: " + materialOne);
		
		System.out.println("\n==================================================================");
//		
		System.out.println("\n========= Example 4: Reference comparison ====================\n");

		House houseTwo = houseOne;
		System.out.println("Do 'houseOne' and 'houseTwo' refer to the same object?... \n(houseOne == houseTwo) => " + (houseOne == houseTwo));
		
		System.out.println("\n'houseOne' color: " + houseOne.color);
		System.out.println("'houseTwo' color: " + houseTwo.color);
	
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("HouseChanger.paintHouse(houseOne, \"blue\");");
		HouseChanger.paintHouse(houseOne, "blue");
		System.out.println("----------------------------------------------------\n");
		System.out.println("'houseOne' color AFTER paintHouse(): " + houseOne.color);
		System.out.println("'houseTwo' color: AFTER paintHouse(): " + houseTwo.color);
		
		System.out.println("\n==================================================================");

	}

}
