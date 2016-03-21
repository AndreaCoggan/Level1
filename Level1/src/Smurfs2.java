
public class Smurfs2 {
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("handySmurf");
		handySmurf.eat();
		handySmurf.getName();
		Smurf papaSmurf = new Smurf("papaSmurf");
		papaSmurf.getName();
		System.out.println(papaSmurf.getHatColor());
		Smurf smurfette = new Smurf("smurfette");
		smurfette.getName();
		System.out.println(smurfette.getHatColor());
		System.out.println(papaSmurf.isGirlOrBoy());
		System.out.println(smurfette.isGirlOrBoy());

	}

}
