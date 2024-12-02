
public class PropellerPlane extends Airplane{
	
	public PropellerPlane(String propPlaneName) {
		super(propPlaneName);
	}
	
	@Override
	public void fly() {
		System.out.println(this.name + " THE PROPELLER PLANE has its propellors spinning!");

	}
	
	public void propellerRotationRate() {
		System.out.println("The rate of rotation is fast!");
	}
	
}
