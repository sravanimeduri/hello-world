package list;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Iteratorex2 {

	public static void main(String[] args) {
		Set<String> hs = new TreeSet<String>();
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
	    Iterator<String> it = hs.iterator();
	 
	    while(it.hasNext()) {
	      
	      System.out.println(it.next());

	}

	}
}
