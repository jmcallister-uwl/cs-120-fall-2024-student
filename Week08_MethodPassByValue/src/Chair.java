
public class Chair {
	public String material;
	public String color;
	public int height;

	public Chair(String chairMaterial, String chairColor, int chairHeight) {
		this.material = chairMaterial;
		this.color = chairColor;
		this.height = chairHeight;
	}

	public void roll() {
		System.out.println("I'm rolling!");
	}

	public int adjustHeight(boolean direction) {
		if (direction) {
			this.height += 5;
		} else {
			this.height -= 5;
		}

		return this.height;
	}

	public int swivel(int force) {
		return force * 3;
	}

}
