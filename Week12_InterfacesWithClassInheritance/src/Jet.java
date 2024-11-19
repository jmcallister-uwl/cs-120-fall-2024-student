
public class Jet extends Airplane {
	
	public Jet(String jetName) {
		super(jetName);
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + " THE JET has its jets firing!");
	}
	
	public void fireJets() {
		System.out.println("Firing jets!");
	}
	
}
