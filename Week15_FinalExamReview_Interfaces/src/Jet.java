public class Jet extends Airplane {
	private double fuelCapacity;

	public Jet(int fuelCap) {
		this("Defualt Name", "Default Model", fuelCap);		
	}

	public Jet(String name, String model, int fuelCap) {
		super(name, model);
		this.fuelCapacity = fuelCap;
	}

	public void land() {
		super.deployLandingGear();
	}

	@Override
	public String toString() {
	    return "Jet{" +
	           "name='" + super.name + '\'' +
	           ", model='" + super.model + '\'' +
	           ", fuelCapacity=" + this.fuelCapacity +
	           '}';
	}

}