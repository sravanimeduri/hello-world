package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntryex2 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
		hs.put(1023,"Satya");
		hs.put(1021,"ramya");
		hs.put(1022,"Rajesh");
		
		
		
		
		System.out.println(hs);
		Set s=hs.entrySet();
		Iterator it = s.iterator();
		 
	    while(it.hasNext()) {
	    	Map.Entry m=(Map.Entry)it.next();
	      
	      System.out.println(m.getKey()+"  "+m.getValue());	
		}

	}

}
