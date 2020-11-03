package nestedclasess;

class Cars{
	void cost() {
		System.out.println("Audi Car Cost is 50 laks");
		class Milage{
			void millage() {
				System.out.println("Audi millage is 15km");
			}
		}
		Milage cse=new Milage();
		cse.millage();
	}
}

public class Localinnerclsex2 {

	public static void main(String[] args) {
		Cars audi=new Cars();
		audi.cost();	

	}

}
