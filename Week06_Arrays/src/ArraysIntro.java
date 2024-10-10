
public class ArraysIntro {

	public static void main(String[] args) {
		int[] numbers = new int[100];
		
//		numbers[0] = 8;
//		numbers[1] = 2;
//		numbers[2] = 4;
		
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i * 2;
			
			System.out.println( "numbers[" + i + "]: " + numbers[i] );
		}
		
		System.out.println("OUTSIDE numbers[" + 99 + "]: " + numbers[99]);
		
		
		
		
		

	}

}
