public class Airplane extends Vehicle {
	protected String name;
	protected String model;
	protected int altitude = 0; // All planes will start on ground
	protected int speed = 0; // All planes will start not moving

	public Airplane() {
		this("No name yet", "No model assigned", 20);
	}

	public Airplane(String name, String model) {		
		this(name, model, 20);

	}

	public Airplane(String name, String model, double pilotLights) {
		super(pilotLights);
		this.name = name;
		this.model = model;
	}
	
	@Override
	public void drive(int valOne, int valTwo){
		this.fly(valOne, valTwo);
	}
	
	@Override
	public void stop(){
		this.deployLandingGear();
	}

	@Override
	public double lightIntensity(){
		return super.lightIntensity() * 4;
	}

	public void fly(int alt, int curSpeed) {
		this.altitude = alt;
		this.speed = curSpeed;

	}

	public void deployLandingGear() {
		System.out.println(this.name + " is deploying landing gear!");
	}
	
	@Override
	public String toString() {
	    return "Airplane{" +
	           "name='" + this.name + '\'' +
	           ", model='" + this.model + '\'' +
	           ", altitude=" + this.altitude +
	           ", speed=" + this.speed +
	           ", pilotLights=" + super.lights +
	           '}';
	}
}