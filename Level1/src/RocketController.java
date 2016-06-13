
public class RocketController {

	public static void main(String[] args) {
		Rocket apollo = new Rocket(7, "rocket1");
		apollo.Launch();
		apollo.refuel(10);
		System.out.println(apollo.canMakeIt(20));
	}

}
