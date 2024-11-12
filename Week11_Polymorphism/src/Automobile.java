public class Automobile extends Vehicle {
	private String licensePlate;
	private int seatingCapacity;
	protected boolean isElectric;

	public Automobile(String licensePlate, int seatingCapacity, boolean isElectric) {
		this.licensePlate = licensePlate;
		this.seatingCapacity = seatingCapacity;
		this.isElectric = isElectric;
	}

	@Override
	public void drive() {
		System.out.println("Automobile is driving");
	}

	@Override
	public void stop() {
		System.out.println("Automobile has parked");
	}

	public void honk() {
		System.out.println("Honking the horn");
	}

	protected void batteryCheck() {
		if (isElectric) {
			System.out.println("Checking battery level");
		}
	}

	public String getLicensePlate() {
		return this.licensePlate;
	}

	public void setLicensePlate(String licensePlate) {
		this.licensePlate = licensePlate;
	}

	public int getSeatingCapacity() {
		return this.seatingCapacity;
	}

	public void setSeatingCapacity(int seatingCapacity) {
		this.seatingCapacity = seatingCapacity;
	}

	public boolean isElectric() {
		return this.isElectric;
	}

	public void setElectric(boolean isElectric) {
		this.isElectric = isElectric;
	}
	
	@Override
	public boolean equals(Object obj) {
		// If we are comparing to itself
	    if (this == obj) {
	        return true;
	    }
	    
	    if (!(obj instanceof Automobile)) {
	        return false;
	    }
	    
	    Automobile other = (Automobile) obj;
	    
	    return this.licensePlate.equals(other.licensePlate);
	}

	
	@Override
	public String toString() {
	    return "Automobile{" +
	           "licensePlate='" + licensePlate + '\'' +
	           ", seatingCapacity=" + seatingCapacity +
	           ", isElectric=" + isElectric +
	           ", modelYear=" + modelYear +
	           ", manufacturer='" + manufacturer + '\'' +
	           '}';
	}

}