public class Bird extends Animal {
	private int topSpeed;

	public Bird(int givenTopSpeed) {
		this.topSpeed = givenTopSpeed;
	}

	@Override
	public void move(int speed) {
		if (speed <= this.topSpeed) {
			System.out.println("This bird is flying at " + speed + " mph!");

		} else {
			System.out.println("That is too fast for this bird!");

		}
	}

	@Override
	public void sayName() {
		System.out.println("I am a wild bird!");
	}

}