public class Boat extends Vehicle {
	private boolean inPort = true;
	protected String boatType;

	public Boat(String name, int modelYear, boolean inPort, String boatType) {
		super(name, modelYear);
		this.inPort = inPort;
		this.boatType = boatType;
	}

	public Boat(String name, boolean inPort, String boatType) {
		this(name, 2020, inPort, boatType);
	}
	
	public Boat(boolean inPort, String boatType) {
		this("Default Boat", 2020, inPort, boatType);		
	}
	

	@Override
	public void drive() {
		System.out.println("Boat is sailing");
	}

	@Override
	public void stop() {
		this.anchor();
	}

	public void anchor() {
		System.out.println("Dropping the anchor");
	}

	protected void sailCheck() {
		if (inPort) {
			System.out.println("Docked");
		}
	}

	public boolean isInPort() {
		return this.inPort;
	}

	public void setInPort(boolean inPort) {
		this.inPort = inPort;
	}

	public String getBoatType() {
		return this.boatType;
	}

	public void setBoatType(String boatType) {
		this.boatType = boatType;
	}

	@Override
	public boolean equals(Object obj) {
		// If we are comparing to itself
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Boat)) {
			return false;
		}

		Boat other = (Boat) obj;

		return this.boatType == other.boatType;
	}

	@Override
	public String toString() {
		return "Boat {" + "\n\tinPort = " + inPort + "," + "\n\tboatType = '" + boatType + "'," + "\n\tmodelYear = "
				+ modelYear + "," + "\n\tmanufacturer = '" + manufacturer + "'" + "\n}";
	}
}