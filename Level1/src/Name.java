import javax.swing.JOptionPane;

public class Name {
	public static void main(String[]args){
		Name n = new Name();
		
	}
	void myName(){
		System.out.println("andrea");
		
	}
	public Name() {
		//myName();
		printNames(4);
		Print("hello");
		System.out.println(Difference(7,4));
		
	}
	void printNames(int num){
		for (int i = 0; i < num; i++) {
			System.out.println("andrea");
		}
		
	}
	void Print(String word){
		System.out.println(word);
	}
	int Difference(int num1 , int num2){
		int number = num1 - num2;
		return number;
	}
	 String Word(int x){
		return "word";
	}
	 
	

}
