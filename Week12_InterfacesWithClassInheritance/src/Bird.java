
public class Bird implements Flyable {
	private String name;
	
	public Bird() {
		this("No name yet");
	}
	
	public Bird(String name) {
		this.name = name;
	}
	
	@Override
	public void fly() {
		System.out.println("Bird flying!");
		
	}
	
	@Override
	public void land() {
		System.out.println("Bird landing!");
	}
	
	public void birdTest() {
		System.out.println("Bird test!");
	}

}
