public class AnimalDriver {

	public static void main(String[] args) {
		Animal someAnimal = new Animal();
		Dog dogOne = new Dog("Peter");
		Dog dogTwo = new Dog("Hank");

		Bird birdOne = new Bird(40);
		Bird birdTwo = new Bird(20);

		Animal[] animalArr = { someAnimal, dogOne, dogTwo, birdOne, birdTwo };

		for (int i = 0; i < animalArr.length; i++) {
			animalArr[i].move(32);

		}

	}

}