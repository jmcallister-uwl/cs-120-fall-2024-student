public class Boat extends Vehicle {
	private double length;
	private boolean inPort = true;
	protected String boatType;

	public Boat(double length, boolean inPort, String boatType) {
		this.length = length;
		this.inPort = inPort;
		this.boatType = boatType;
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

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
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
	    
	    return this.length == other.length;
	}

	
	@Override
	public String toString() {
	    return "Boat {" +
	           "\n\tlength = " + length + "," +
	           "\n\tinPort = " + inPort + "," +
	           "\n\tboatType = '" + boatType + "'," +
	           "\n\tmodelYear = " + modelYear + "," +
	           "\n\tmanufacturer = '" + manufacturer + "'" +
	           "\n}";
	}
}