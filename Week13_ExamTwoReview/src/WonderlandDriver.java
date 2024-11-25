
public class WonderlandDriver {

	public static void main(String[] args) {
		Wonderland world = new Wonderland();

		int left = world.alice(3);
		int right = world.madHatter(false, left + 3);
		int sideways = world.wonderland(left, right);

		System.out.println("sideways: " + sideways);
		System.out.println("left: " + left);
		System.out.println("right: " + right);

	}

}
