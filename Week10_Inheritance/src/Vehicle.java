
public class Vehicle {
	protected String name = "Default";
	protected int modelYear = 2024;
	protected String manufacturer = "Delta";
	
	public Vehicle() {
		
	}

	public Vehicle(String name) {		
		this.name = name;
//		System.out.println("Vehicle constructor: " + this.name);
	}

	public void drive(int value) {
		System.out.println("Vehicle is moving at " + value + " mph");
	}

	public void stop() {
		System.out.println("Vehicle has stopped");
	}

	private void maintenanceCheck() {
		System.out.println("Performing maintenance check");
	}

	protected void displayManufacturer() {
		System.out.println("Manufacturer: " + manufacturer);
	}

	public int getModelYear() {
		return this.modelYear;
	}

	public void setModelYear(int modelYear) {

		this.modelYear = modelYear;
	}
}
