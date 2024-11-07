
public class Airplane extends Vehicle {
	private int maxAltitude;
	
	
	public Airplane(int maxAltitude) {
		this.maxAltitude = maxAltitude;
		this.modelYear = 2022;
//		System.out.println("Airplane constructor!");
	}
	
	public Airplane(String name, int maxAltitude) {
		super(name);
		this.maxAltitude = maxAltitude;
//		System.out.println("Airplane constructor!");
	}

	@Override
	public void drive(int speed) {	
		System.out.println("Airplane is FLYING at " + speed + " mph");
	}

	
}






