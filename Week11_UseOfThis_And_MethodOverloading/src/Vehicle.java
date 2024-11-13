public class Vehicle {
	protected String name;
	protected String manufacturer;
	protected int modelYear;

	public Vehicle(String name, String manufacturer, int modelYear) {
		this.name = name;
		this.manufacturer = manufacturer;
		this.modelYear = modelYear;
	}

	public Vehicle(String name, int modelYear) {
		this(name, "Default Manufacturer", modelYear);
	}

	public Vehicle(String name) {
		this(name, "Default manufacturer", 2024);
	}

	public void drive() {
		System.out.println("Vehicle is moving");
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

	@Override
	public boolean equals(Object obj) {
		// If we are comparing to itself
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vehicle)) {
			return false;
		}

		Vehicle other = (Vehicle) obj;

		return this.modelYear == other.modelYear;
	}

	@Override
	public String toString() {
		return "Vehicle {" + "\n\tname = '" + name + "'," + "\n\tmodelYear = " + modelYear + ","
				+ "\n\tmanufacturer = '" + manufacturer + "\n}";
	}
}