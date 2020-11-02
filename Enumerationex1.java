package list;

import java.util.Enumeration;

import java.util.Vector;

public class Enumerationex1 {
	public static void main(String[] args) {
		
		
		Vector<String> hs = new Vector<String>();
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
	    Enumeration<String> ee=hs.elements();
	 
	    while(ee.hasMoreElements()) {
	      
	      System.out.println(ee.nextElement());

	}
		
	}
	
}
