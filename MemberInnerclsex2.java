package nestedclasess;

class Car{
	void cost() {
		System.out.println("Audi Car Cost is 50 laks");
		Milage cse=new Milage();
		cse.millage();
	}
	class Milage{
		void millage() {
			System.out.println("Audi millage is 15km");
		}
	}
}

public class MemberInnerclsex2 {

	public static void main(String[] args) {
		Car audi=new Car();
		audi.cost();
		

	}

}
