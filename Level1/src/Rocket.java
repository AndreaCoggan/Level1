
public class Rocket {
	int fuel;
	String name;

	public Rocket(int fuel, String name) {
		this.fuel = fuel;
		this.name = name;
		System.out.println("Constructing Rocket");
	}

	public void Launch() {
		for (int i = fuel; i >= 0; i--) {
			System.out.println(i);
			if (i == 0) {
				System.out.println("Out of fuel");
			}
		}
	}

	void refuel(int fuel) {
		this.fuel = fuel;
	}

	boolean canMakeIt(int distance) {
		if (distance > fuel) {
			return false;
		} else
			return true;

	}

}
