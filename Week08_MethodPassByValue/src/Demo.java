
public class Demo {

	public static void main(String[] args) {
		
		
		System.out.println("\n========= Example 1: Pass-by-value with primitives ====================\n");
		
		int firstHeight = 12;
		int secondHeight = 2;
		
		System.out.println("firstHeight: " + firstHeight);
		System.out.println("secondHeight: " + secondHeight);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("int result = ChairChanger.addMeasurements(firstHeight, secondHeight);");
		int result = ChairChanger.addMeasurements(firstHeight, secondHeight);
		System.out.println("--------------------------------------------------\n");
		
		
		System.out.println("result: " + result);
		System.out.println("firstHeight AFTER addMeasurements: " + firstHeight);
		
		System.out.println("\n==================================================================");

		
		System.out.println("\n========= Example 2: Pass-by-value with object references ====================\n");
		
		Chair officeChair = new Chair("metal", "orange", 12);
		
		System.out.println("Original material of officeChair: " + officeChair.material);
		
		System.out.println("\n--------------------------------------------------");
		System.out.println("ChairChanger.changeMaterial(officeChair, \"wood\");");
		ChairChanger.changeMaterial(officeChair, "wood");
		System.out.println("--------------------------------------------------\n");
		
		System.out.println("Material of officeChair after changeMaterial: " + officeChair.material);	
		
		System.out.println("\n==================================================================");
		
//		
		System.out.println("\n========= Example 3: Method scope and local variables ====================\n");
		
		String matOne = "copper";
		System.out.println("matOne: " + matOne);
//	
		System.out.println("\n--------------------------------------------------");
		System.out.println("ChairChanger.materialTest(matOne);");
		ChairChanger.materialTest(matOne);
		System.out.println("--------------------------------------------------\n");		
//		
		System.out.println("matOne after materialTest: " + matOne);
//		
		System.out.println("\n==================================================================");
////		
		System.out.println("\n========= Example 4: Reference comparison ====================\n");

		Chair testChair = officeChair;
		System.out.println("Do 'officeChair' and 'testChair' refer to the same object?... \n(officeChair == testChair) => " + (officeChair == testChair));
//		
		System.out.println("\nofficeChair material: " + officeChair.material);
		System.out.println("testChair material: " + testChair.material);
		
		System.out.println("\n----------------------------------------------------");
		System.out.println("ChairChanger.changeMaterial(officeChair, \"bronze\");");
		ChairChanger.changeMaterial(officeChair, "bronze");
		System.out.println("----------------------------------------------------\n");
		System.out.println("'officeChair' material AFTER changeMaterial(): " + officeChair.material);
		System.out.println("'testChair' material: AFTER changeMaterial(): " + testChair.material);
		
		System.out.println("\n==================================================================");
	}

}
