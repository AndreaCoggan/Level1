public class GetFriends {

	public static void main(String[] args) {
		// 3. Create an instance of Classmate for each person in your class.
		Classmate andrea = new Classmate();
		andrea.setDescription("i have blue eyes");
		Classmate dylan = new Classmate();
		dylan.setDescription("dylan has a twin");
		// 4. set descriptions for each Classmate

		// 5. Use your getter to print out each description

	}

}

class Classmate {
	String description;
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDescription() {
		return description;
	}
	// 1. create a setter that sets a description for this person

	// 2. create a getter that gets a description of this person

}
