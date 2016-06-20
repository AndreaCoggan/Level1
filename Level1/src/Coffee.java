
public class Coffee {
	int temperature;
	public static void main(String[]args){
		Coffee java = new Coffee(110);
		java.Brew();
	}
	Coffee(int temperature){
		this.temperature = temperature;
	}
	void Brew(){
		temperature = 110;
		System.out.println("the coffee is ready at " + temperature + " degrees");
	}

}
