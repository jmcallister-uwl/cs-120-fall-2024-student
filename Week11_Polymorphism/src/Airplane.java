public class Airplane extends Vehicle {
	private String airline;
	private int maxAltitude;
	protected int numEngines;

	public Airplane(String airline, int maxAltitude, int numEngines) {
		this.airline = airline;
		this.maxAltitude = maxAltitude;
		this.numEngines = numEngines;
	}

	@Override
	public void drive() {
		System.out.println("Airplane is flying");
	}

	@Override
	public void stop() {
		System.out.println("Airplane is landing");
		this.deployLandingGear();
	}

	public void deployLandingGear() {
		System.out.println("Deploying landing gear");
	}

	protected void engineCheck() {
		System.out.println("Checking " + numEngines + " engines");
	}

	public String getAirline() {
		return this.airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public int getMaxAltitude() {
		return this.maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

	public int getNumEngines() {
		return this.numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}

}