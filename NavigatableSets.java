package treeset;

import java.util.TreeSet;

public class NavigatableSets {
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
		System.out.println(hs.headSet("K",true));
		System.out.println(hs.tailSet("K",false));
		System.out.println(hs.subSet("A","Gsss"));
		

	}
}
