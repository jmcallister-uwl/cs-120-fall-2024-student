public class Airplane extends Vehicle {
	private String airline;
	protected int numEngines;
	
	public Airplane() {		
		System.out.println("AIRPLANE CONSTRUCTOR");
	}
	
	
	public Airplane(String name, int modelYear, String airline, int numEngines) {
		super(name, modelYear);
		this.airline = airline;		
		this.numEngines = numEngines;
	}
	
	public Airplane(String name, String airline, int numEngines) {
		this(name, 2022, airline, numEngines);
	}
	
	public Airplane(String airline, int numEngines) {
		this("Default Plane", 2022, airline, numEngines);
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

	public int getNumEngines() {
		return this.numEngines;
	}

	public void setNumEngines(int numEngines) {
		this.numEngines = numEngines;
	}
	
	@Override
	public boolean equals(Object obj) {
		// If we are comparing to itself
	    if (this == obj) {
	        return true;
	    }
	    
	    if (!(obj instanceof Airplane)) {
	        return false;
	    }
	    
	    Airplane other = (Airplane) obj;
	    
	    return this.numEngines == other.numEngines;
	}

	
	@Override
	public String toString() {
	    return "Airplane {" +
	           "\n\tAirline = '" + airline + "'," +
	           "\n\tnumEngines = " + numEngines + "," +
	           "\n\tmodelYear = " + modelYear + "," +
	           "\n\tmanufacturer = '" + manufacturer + "'" +
	           "\n}";
	}

}