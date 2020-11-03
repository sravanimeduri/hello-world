package nestedclasess;

abstract class Bike{
	abstract void cost();
	abstract void milage();
	
}

public class Anonomusex2 {

	public static void main(String[] args) {
		Bike honda=new Bike() {
		void cost() {
				System.out.println("Honda Cost is 2lakhs");
			}

			@Override
			void milage() {
				System.out.println("Honda Milage is 10km");
				
			}
		};
		honda.cost();
		honda.milage();
		

	}

}
