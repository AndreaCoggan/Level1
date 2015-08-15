public class Person {
	String name;
	String superPower;

	Person(String name, String superPower) {
		this.name = name;
		this.superPower = superPower;

	}

	public static void main(String[] args) {
		Person Andrea = new Person("Andrea", "flying");

	}

	void setname(String name1) {
		this.name = name1;

	}

	void setsuperPower(String superPower1) {
		this.superPower = superPower1;
	}

	String getname() {
		return name;
	}

	String getsuperPower() {
		return superPower;
	}

	public String toString() {
		return name + superPower;
	}
}
