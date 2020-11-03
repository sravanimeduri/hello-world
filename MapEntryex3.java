package map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MapEntryex3 {

	public static void main(String[] args) {
		TreeMap<Integer,String> hs=new TreeMap<Integer,String>();
		hs.put(401,"Chaitanya");
		hs.put(466,"Sravani");
		hs.put(472,"Triveni");
		hs.put(459,"Anusha");
		hs.put(496,"Sudha");
		hs.put(481,"Priya");
		
		System.out.println(hs);
		
		Set<Map.Entry<Integer, String>> s=hs.entrySet(); 
	    
	            	
	      
	      for(Map.Entry<Integer, String> x:s) {
	    	  System.out.println(x.getKey()+"  "+x.getValue());
			}
		}

	}


