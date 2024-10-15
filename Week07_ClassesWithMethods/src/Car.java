
public class Car {
	public String name;
	public String color;
	public int numWheels;

	public Car(String givenName, String givenColor, int givenNumWheels) {
		this.name = givenName;
		this.color = givenColor;
		this.numWheels = givenNumWheels;
	}

	public String drive() {		
		String retString = this.name + " is driving!";
		
		if(this.numWheels > 4) {
//			System.out.println(this.name + " HAS A LOT OF WHEELS!");
			String wheelsPhrase = this.name + " HAS A LOT OF WHEELS!";
			
			return wheelsPhrase;			
		}
		
		System.out.println("ALMOST DONE!!!");
		return retString;
	}

}
