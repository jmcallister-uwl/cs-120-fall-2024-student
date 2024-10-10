
public class ArrayPassByValue {

	public static void main(String[] args) {
		int[] numbers = new int[80];
		
		for(int i = 0; i < numbers.length; i++) {
//			int temp = numbers[i];
			
			if(i % 2 == 0) {
//				temp = 1;
				numbers[i] = 1;
				
			} else {
//				temp = -1;
				numbers[i] = -1;
				
			}
		}
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.println( "numbers[" + i + "]: " + numbers[i] );
		}
		

	}

}
