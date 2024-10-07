
public class Examples {

	public static void main(String[] args) {
		String phrase = "Hello World";
		
		System.out.println("============= charAt() Example =================");
		
		int indexOfChar = 0;
		char targetChar = phrase.charAt(indexOfChar);
		
		System.out.println("Character at index " + indexOfChar + ": " + targetChar);
		
		System.out.println("==============================\n");
		
		System.out.println("============= indexOf() Example =================");

		String subString = "Wor";
		int subStringIndex = phrase.indexOf(subString);
		System.out.println("Index of " + subString + ": " + subStringIndex);
		
		System.out.println("==============================");
		char firstTarget = 'l';
		char indexOfFirstTarget = firstTarget;
		
		System.out.println("Index of " + subString + ": " + subStringIndex);
		
		System.out.println("==============================");
		
		
		

	}

}
