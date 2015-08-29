public class Methods2 {
	public static void main(String[] args) {
		Methods2 methods = new Methods2();
		methods.iRock();
		methods.rocker("Andrea");
		methods.truth("Justin Bieber");
		methods.echo("Andrea");
		methods.addTwoNums(5, 5);
		methods.number(8);
		methods.number(9);

	}

	void iRock() {
		System.out.println("Andrea is cool");
	}

	void rocker(String name1) {
		System.out.println(name1 + " rocks");
	}

	void truth(String name2) {
		if (name2.equals("Justin Bieber"))
			System.out.println("sucks");
		else if (name2.equals("Lana Del Rey"))
			System.out.println("is a good singer");
	}

	void echo(String name3) {
		System.out.println(name3 + " " + name3);
	}

	void addTwoNums(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}

	void number(int num) {
		if (num % 2 == 0)
			System.out.println("even");
		else
			System.out.println("odd");
	}
}
