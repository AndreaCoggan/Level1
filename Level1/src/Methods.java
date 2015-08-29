import org.teachingextensions.logo.Tortoise;

public class Methods {
	public static void main(String[] args) {
		Methods methods = new Methods();
		methods.food("Strawberries");
		methods.truth(1);
		methods.jump(27);
		methods.jump("piggy");
		methods.drawLine();

	}

	void food(String fruit) {

		System.out.println("I like " + fruit);
	}

	void truth(int x) {
		if (x > 5)
			System.out.println("Geeks rule");
		else
			System.out.println("Nerds rule");
	}
	void drawLine() {
		for (int i = 0; i < 4; i++) {
			Tortoise.move(100);
			Tortoise.turn(90);
		}
		
	}

	void jump(int height) {
		if (height > 100)
			System.out.println("The mouse jumped over the moon.");
		if (height > 50)
			System.out.println("The mouse jumped over the broom.");
		if (height > 5)
			System.out.println("The mouse jumped over the candlestick.");
	}

	void jump(String obstacle) {
		System.out.println("The mouse jumped over the " + obstacle);
	}

}
