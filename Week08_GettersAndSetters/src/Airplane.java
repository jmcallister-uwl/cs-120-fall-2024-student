public class Airplane {
	// Think about why this would be important to be
	// private and also only have a getter method.
	private static int numAirplanesCreated = 0;
	
    private String model;
    private int capacity;
    private double fuelLevel = 100;
    private boolean inFlight = false;

    public Airplane(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        Airplane.numAirplanesCreated++;
//        this.fuelLevel = 100;
//        this.inFlight = false; 
    }
    
    public static int getNumAirplanesCreated() {
    	return Airplane.numAirplanesCreated;
    }
    
    private static void setNumAirplanesCreated(int num) {
    	Airplane.numAirplanesCreated = num;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getFuelLevel() {
        return this.fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        if(fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
            
        } else {
            System.out.println("Fuel level must be between 0 and 100.");
            
        }
    }

    public boolean isInFlight() {
        return this.inFlight;
    }

    public void setInFlight(boolean inFlight) {
        this.inFlight = inFlight;
    }

    public void takeOff() {
        if (fuelLevel > 0 && !inFlight) {
            inFlight = true;
            System.out.println("The airplane is taking off!");
            
        } else if (inFlight) {
            System.out.println("The airplane is already in flight.");
            
        } else {
            System.out.println("Not enough fuel to take off.");
            
        }
    }

    public void land() {
        if (inFlight) {
            inFlight = false;
            System.out.println("The airplane is landing.");
            
        } else {
            System.out.println("The airplane is already on the ground.");
            
        }
    }

    public void refuel(double fuelAmount) {
        this.setFuelLevel(fuelLevel + fuelAmount);
        System.out.println("The airplane has been refueled. Current fuel level: " + fuelLevel + "%.");
        
    }
}
