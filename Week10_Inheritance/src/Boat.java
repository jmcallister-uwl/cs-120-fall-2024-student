
public class Boat extends Vehicle {
	private double length;
	private boolean inPort = true;
	protected String boatType;

	public Boat(double length, boolean inPort, String boatType) {
		this.length = length;
		this.inPort = inPort;
		this.boatType = boatType;
	}
}
