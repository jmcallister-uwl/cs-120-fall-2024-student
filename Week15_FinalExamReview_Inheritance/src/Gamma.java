public class Gamma extends Beta {
	protected int y;

	public Gamma(int val1, int val2) {
		super(val1);
		this.y = val2;
	}

	public int getValue() {
		/* 
			Note that even though the instance variable x belongs to
			the class Alpha, we can still say this.x here. This is because
			Gamma extends Beta, and Beta extends Alpha. We can think of this
			in a more concrete sense if we were to think of Alpha as being
			a Vehicle class, Beta being an Automobile class, and Gamma being
			a Car class. When we create a Car, we are creating a Vehicle because
			of how the inheritance is setup. So Car is a Vehicle and therefore
			inherits all public and protected properties and methods from Vehicle
			as its own.
		*/ 
		return this.x + this.y;
	}
}