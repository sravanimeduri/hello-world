package javabasics;
class Sample<E>{
	void show(E a) {
		System.out.println(a);
	}
	
}

public class GenericDemo {
	public static void main(String args[]) {
		Sample<Integer> s=new Sample<Integer>();
		s.show(10);
		Sample<Double> p=new Sample<Double>();
		p.show(200.12);
		Sample<Float> q=new Sample<Float>();
		q.show(0.123f);
		Sample<String> r=new Sample<String>();
		r.show("Sruthi");
	}
	

}
