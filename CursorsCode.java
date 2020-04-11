package Com.techtalk.collection;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

public class CursorsCode {
	public static void main(String[] args) {

		// Enumeration Cursor Example
	/*	Vector<String> v = new Vector<>();
		v.add("Debu");
		v.add("Uttam");
		v.add("Gautam");
		Enumeration<String> en = v.elements();
		while (en.hasMoreElements()) {
			System.out.println("Vector Next Elements : " + en.nextElement());
		}*/

		// Iterator Cursor Example - Applicable for Set , Map as well
	/*	List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		// Generic Type used
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(" List Iterator Next Elements : " + itr.next());

		}*/

		// remove
		/*List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		Iterator<Integer> itr1 = list.iterator();
		while (itr1.hasNext()) {
			if (itr1.next().equals(1))
				itr1.remove();
		}
		System.out.println("After remove in List : " + list);*/
		
		// ListIterator Cursor Example - Only Applicable for List
		/*List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		ListIterator<Integer> itr2 = list.listIterator();
		while (itr2.hasNext()) {
			System.out.println(" List Iterator Next Elements : " + itr2.next());
		}*/

		// For-Each Example
	/*	Set<Integer> set = new HashSet<>();
		set.add(5);
		set.add(3);
		set.add(6);
		set.add(1);
		for (Integer val : set) {
			System.out.println("For-Each Set Val : " + val);
		}*/
		
		// Java Lambda For-each for list
	/*	List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.forEach(v -> System.out.println("Lambda List val is : " +  v));
		
*/
		
		// Java Lambda For-each for map	
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "Debu");
		map.put(3, "Shyam");
		map.put(4, "Uttam");
		map.put(5, "Gautam");
		map.forEach((k,v)-> System.out.println( "Key is : " +  k + " ||  value is : " + v));
	
	
		// Earlier Map Elements Retrieval using for-each over Map.entrySet() 
	/*	Map<Integer, String> map = new HashMap<>();
		map.put(1, "Debu");
		map.put(3, "Shyam");
		map.put(4, "Uttam");
		map.put(5, "Gautam");
        for (Map.Entry<Integer,String> entry : map.entrySet())  
            System.out.println("Key = " + entry.getKey() + 
                             ", Value = " + entry.getValue()); */
		
		// Earlier Map Elements Retrieval using for-each using keySet() & values() 
	/*	Map<Integer, String> map = new HashMap<>();
		map.put(1, "Debu");
		map.put(3, "Shyam");
		map.put(4, "Uttam");
		map.put(5, "Gautam");
		 // using keySet() for iteration over keys 
        for (Integer name : map.keySet())  
            System.out.println("key: " + name); 
          
        // using values() for iteration over values 
        for (String url : map.values())  
            System.out.println("value: " + url);*/ 
        
		//Earlier Map Elements Retrieval using iterators
		/*Map<Integer, String> map = new HashMap<>();
		map.put(1, "Debu");
		map.put(3, "Shyam");
		map.put(4, "Uttam");
		map.put(5, "Gautam"); 
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator(); 
          
        while(itr.hasNext()) 
        { 
             Map.Entry<Integer, String> entry = itr.next(); 
             System.out.println("Key = " + entry.getKey() +  
                                 ", Value = " + entry.getValue()); 
        } 
	*/
	}
}
