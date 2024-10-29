
public class House {
	public String name;
	public String color;
	public int numDoors;
	
	public House(String name, String color, int numDoors) {
		this.name = name;
		this.color = color;
		this.numDoors = numDoors;
	}
	
	public void knockOnDoor() {
		System.out.println("Knocking on door of " + this.name);
	}
	
}
