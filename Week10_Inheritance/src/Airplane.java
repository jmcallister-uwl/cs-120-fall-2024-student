
public class Airplane extends Vehicle {
	private int maxAltitude;

	public Airplane(int maxAltitude) {
		this.maxAltitude = maxAltitude;
		this.modelYear = 2022;

		System.out.println("Airplane constructor");
	}
}
