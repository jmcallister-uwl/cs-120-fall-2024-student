
public class Car {
	public String name;
	public String color;
	public int numWheels;
	
	public Car(String givenName, String givenColor, int givenNumWheels) {
		this.name = givenName;
		this.color = givenColor;
		this.numWheels = givenNumWheels;
	}
	
	public void drive() {
		System.out.println(this.name + " is driving!");
	}

}
