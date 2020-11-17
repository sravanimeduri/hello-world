package javabasics;

class Nothreadex2{
	public void show() {
		for(int i=0;i<=10;i++) {
			System.out.println("i value is ="+ i);
		}
	}
}
public class withoutthread1 {

	public static void main(String[] args) {
		Nothreadex2 nt=new Nothreadex2();
		nt.show();
		for(int x=0;x<=10;x++) {
			System.out.println("x value is ="+ x);
		}
		

	}

}
