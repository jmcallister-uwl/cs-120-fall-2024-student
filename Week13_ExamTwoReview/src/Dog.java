public class Dog extends Animal {
	private String name;

	public Dog(String dogName) {
		this.name = dogName;
	}

	@Override
	public void move(int feetToMove) {
		if (feetToMove >= 30) {
			System.out.println(this.name + " is going for a walk!");

		} else {
			System.out.println(this.name + " is moving " + feetToMove + " feet!");

		}

	}

	@Override
	public void sayName() {
		System.out.println("I am a dog named " + this.name);
	}

}