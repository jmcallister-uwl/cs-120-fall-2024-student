public class Delta extends Alpha {
	protected int z;

	public Delta(int val1, int val2) {
		super(val1);
		this.z = val2;
	}

	public int getValue() {		
		return this.z * super.getValue();
	}
}