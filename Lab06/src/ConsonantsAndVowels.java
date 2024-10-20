public class ConsonantsAndVowels {
    public static void main(String[] args) {
        String str = "Hello, world!";
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char curCharacter = Character.toLowerCase(str.charAt(i));
            
            if (curCharacter == 'a' || 
            	curCharacter == 'e' || 
            	curCharacter == 'i' || 
            	curCharacter == 'o' || 
            	curCharacter == 'u') 
            {            	
                vowels++;
                
            } else if (curCharacter >= 'a' && curCharacter <= 'z') {
            	/*
            	 * Characters are just integers under the hood. Each
            	 * character has an ASCII code associated with it so that
            	 * the computer knows which character to print. Here is 
            	 * a link to more about the ASCII table: https://en.wikipedia.org/wiki/ASCII
            	 * Because of this fact, we can perform integer operations on
            	 * characters. If you look at an ASCII table, you'll see that
            	 * the range check above will restrict us to only character codes
            	 * which represent letters. 
            	 * 
            	 * We only need to worry about lower case letters
            	 * because of our call to Character.toLowerCase(str.charAt(i))
            	 * which will give us the lower case representation of the character
            	 * that we are currently looking at.
            	 * 
            	 * */
                consonants++;                
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}