public class Wonderland {

	public Wonderland() {
	}

	public int alice(int abc) {
		if (abc < 10) {
			System.out.print("Java ");
			abc = 10;

		} else if (abc > 10) {
			System.out.print("programming ");
			abc -= 3;

		} else {
			System.out.print("unknown ");
			abc *= 4;
		}

		return abc;
	}

	public int madHatter(boolean tea, int cup) {
		if (tea) {
			return cup / 10;
		}

		return cup % 10;
	}

	public int wonderland(int left, int right) {
		if (left < 5) {
			System.out.print("is ");
			left += 5;

			return right;

		} else {
			System.out.print("isn’t ");
			right -= 2;

			return madHatter(true, left - right);
		}

	}
}