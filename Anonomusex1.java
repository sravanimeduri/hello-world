package nestedclasess;

abstract class Person{
	abstract void eat();	
}

public class Anonomusex1 {

	public static void main(String[] args) {
		new Person() {
			void eat() {
				System.out.println("Eating Ice cream");
			}
		}.eat();

	}

}
