
public class Reservation {
	String name;
	int totalPeople;
	float time;
	
	public Reservation(String name, int totalPeople, float time){
		this.name = name;
		this.totalPeople = totalPeople;
		this.time = time;
	}
	String getName(){
		return name;
	}
	int getTotalPeople(){
		return totalPeople;
	}
	Float getTime(){
		return time;
	}
}
