package list;




import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Iteratorex1 {

	public static void main(String[] args) {
		Set<String> names = new TreeSet<String>();
	    names.add("Chaitanya");
	    names.add("Steve");
	    names.add("Jack");
	 
	    Iterator<String> it = names.iterator();
	 
	    while(it.hasNext()) {
	      
	      System.out.println(it.next());	
		}

	}

}
