package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntryex1 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
		hs.put(401,"Chaitanya");
		hs.put(466,"Sravani");
		hs.put(472,"Triveni");
		hs.put(459,"Anusha");
		hs.put(496,"Sudha");
		hs.put(481,"Priya");
		
		
		
		System.out.println(hs);
		Set s=hs.entrySet();
		Iterator it = s.iterator();
		 
	    while(it.hasNext()) {
	    	Map.Entry m=(Map.Entry)it.next();
	      
	      System.out.println(m.getKey()+"  "+m.getValue());	
		}

	}

}
