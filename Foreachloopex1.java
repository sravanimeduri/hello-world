package map;

import java.util.Vector;

public class Foreachloopex1 {

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
		for(int x:vec) {
			System.out.println(x);
		}

	}

}
