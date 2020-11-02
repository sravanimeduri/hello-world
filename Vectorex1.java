package list;


import java.util.Vector;

public class Vectorex1 {
	public static void main(String[] args) {
		Vector<Integer> vec=new Vector<Integer>();
		vec.add(45);
		vec.add(32);
		vec.add(0);
		vec.add(25);
		vec.add(11);
		vec.add(0);
		vec.add(7);
		
		
		System.out.println(vec);
		vec.set(5,57);
		System.out.println(vec);
		

	}
}
