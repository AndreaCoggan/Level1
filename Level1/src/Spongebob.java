
public class Spongebob {
	public static void main(String[] args) {
		SeaCreature spongebob = new SeaCreature("spongebob");
		spongebob.eat();
		spongebob.laugh();
		SeaCreature squidward = new SeaCreature("squidward");
		SeaCreature patrick = new SeaCreature("patrick");
		squidward.getName();
		patrick.getName();
		squidward.eat();
		squidward.laugh();
		patrick.eat();
		patrick.laugh();
	}

}
