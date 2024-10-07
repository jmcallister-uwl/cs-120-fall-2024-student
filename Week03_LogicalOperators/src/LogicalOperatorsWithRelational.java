
public class LogicalOperatorsWithRelational {

	public static void main(String[] args) {
		int x = 8;
		int y = 4;

		int z = 8;
		int a = 3;

		boolean resultOne = (x > y) && (x == z);

		boolean resultTwo = (x < y) && (x == z);
		boolean resultThree = (x == z) && (x < y);

		/**************************************
		**************************************/

		boolean resultFour = (x < y) || (x == z);
		boolean resultFive = (x == z) || (x < y);
		boolean resultSix = !(x > a);
		boolean resultSeven = x != a;
		
		/**************************************
		**************************************/
		boolean resultEight = (x == z) || (x > a) && (y < a);
		boolean resultNine = ( (x == z) || (x > a) ) && (y < a);
		

		System.out.println(String.format("resultOne: (%d > %d) && (%d == %d) => %b\n===========================", x, y, x, z, resultOne));
        System.out.println(String.format("resultTwo: (%d < %d) && (%d == %d) => %b\n===========================", x, y, x, z, resultTwo));
        System.out.println(String.format("resultThree: (%d == %d) && (%d < %d) => %b\n===========================", x, z, x, y, resultThree));
        System.out.println(String.format("resultFour: (%d < %d) || (%d == %d) => %b\n===========================", x, y, x, z, resultFour));
        System.out.println(String.format("resultFive: (%d == %d) || (%d < %d) => %b\n===========================", x, z, x, y, resultFive));
        System.out.println(String.format("resultSix: !(%d > %d) => %b\n===========================", x, a, resultSix));
        System.out.println(String.format("resultSeven: %d != %d => %b\n===========================", x, a, resultSeven));
        System.out.println("\n/*************************\n"
        		+ "On next two, notice how the *parenthesis* placement changes the result!\n"
        		+ "This is because of && having higher precedence than ||.\n"
        		+ "*************************\n");
        System.out.println(String.format("resultEight: (%d == %d) || (%d > %d) && (%d < %d) => %b\n===========================", x, z, x, a, y, a, resultEight));
        System.out.println(String.format("resultNine: ( (%d == %d) || (%d > %d) ) && (%d < %d) => %b\n===========================", x, z, x, a, y, a, resultNine));
	}

}
