public class Automobile extends Vehicle {
	private String licensePlate;
	protected boolean isElectric;

	public Automobile(String name, int modelYear, String licensePlate, boolean isElectric) {
		super(name, modelYear);
		this.licensePlate = licensePlate;
		this.isElectric = isElectric;
	}

	public Automobile(String name, String licensePlate, boolean isElectric) {
		this(name, 2019, licensePlate, isElectric);
	}

	public Automobile(String licensePlate, boolean isElectric) {
		this("Default Automobile", 2019, licensePlate, isElectric);
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
	    return "Automobile {" +
	           "\n\tlicensePlate = '" + licensePlate + "," +
	           "\n\tisElectric = " + isElectric + "," +
	           "\n\tmodelYear = " + modelYear + "," +
	           "\n\tmanufacturer = '" + manufacturer + "'" +
	           "\n}";
	}

}