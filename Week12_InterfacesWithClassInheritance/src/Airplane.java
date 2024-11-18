
public class Airplane implements Flyable {

	public String name;
	private String model;

	public Airplane() {
		this("No name yet", "No model assigned");
	}

	public Airplane(String name) {
		this(name, "No model assigned");

	}

	public Airplane(String name, String model) {
		this.name = name;
		this.model = model;
	}

	@Override
	public void fly() {
		System.out.println(this.name + " has its jets firing!");

	}

	@Override
	public void land() {
		this.deployLandingGear();
	}

	public void deployLandingGear() {
		System.out.println(this.name + " is deploying landing gear!");
	}

	public void turnOnLights() {
		System.out.println("Lights on!");
	}

}
