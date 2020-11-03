package map;

import java.util.TreeSet;

public class Foreachloopex2 {

	public static void main(String[] args) {
		TreeSet<String> hs=new TreeSet<String>();
		hs.add("K");
		hs.add("G");
		hs.add("O");
		hs.add("T");
		hs.add(" ");
		hs.add("A");
		hs.add("D");
		hs.add("S");
		hs.add(" ");
		
		System.out.println(hs);
		for(String x:hs) {
			System.out.println(x);
		}

	}

}
