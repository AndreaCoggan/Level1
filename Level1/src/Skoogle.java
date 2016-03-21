
public class Skoogle {
	static int ctr = 0;

	public static void main(String[] args) {

		new Skoogle();

	}

	public Skoogle() {
		ctr++;
		System.out.println(ctr);
		System.out.println("skoogle created");
		Skoogle s = new Skoogle();

	}

}
