public class Vehicle implements Drivable {
	protected double lights;

	public Vehicle(double vehicleLights) {
		this.lights = vehicleLights;
	}
	
	@Override
	public void drive(int valOne, int valTwo) {
		System.out.println("Vehicle driving!");
	}

	@Override
	public void stop() {
		System.out.println("Vehicle stopping!");
	}
	
	@Override
	public double lightIntensity() {
		return lights;
	}

}