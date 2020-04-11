package Com.techtalk.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class FewTrickyCode {
	
	public static void main(String[] args) {
		// By Default  TreeSet , TreeMap order is Ascending 
		// How to Change it Descending order For TreeSet
		
		TreeSet<Object> treeSet = new TreeSet<Object>();
	      treeSet.add(45);
	      treeSet.add(15);
	      treeSet.add(99);
	      treeSet.add(70);
	      treeSet.add(65);
	      treeSet.add(30);
	      treeSet.add(10);
	      System.out.println("TreeSet Ascending order : " + treeSet);
	      NavigableSet<Object> res = treeSet.descendingSet();
	      System.out.println("TreeSet after Descending order" + res);
	      
	   // How to Change it Descending order For TreeMap
	      TreeMap<Object,Object> treeMap = new TreeMap<Object,Object>();
	      treeMap.put(1,"A");
	      treeMap.put(5,"B");
	      treeMap.put(3,"C");
	      treeMap.put(7,"F");
	      treeMap.put(2,"G");
	      System.out.println("TreeMap Ascending order : " + treeMap);
	      NavigableMap<Object,Object> result = treeMap.descendingMap();
	      System.out.println("TreeMap after Descending order" + result);
	      
	      // Covert HashSet or List to Array
	      HashSet<String> hset = new HashSet<String>();
	      hset.add("Element1");
	      hset.add("Element2");
	      hset.add("Element3");
	      hset.add("Element4");
	      // Displaying HashSet elements
	      System.out.println("HashSet contains: "+ hset);  
	      // Creating an Array
	      String[] array = new String[hset.size()];
	      hset.toArray(array);
	      // Displaying Array elements
	      System.out.println("Array elements: ");
	      for(String temp : array){
	         System.out.println(temp);
	      }
	      
	      // HashMap Creation with Load Factor 
	      Map<String, String> hmapFac = new HashMap<>(12,0.95f);
	      hmapFac.put("1", "Debu");
	      hmapFac.put("2", "Debu");
	      hmapFac.put("3", "Shyam");
	      hmapFac.put("4", "Uttam");
	      hmapFac.put("5", "Gautam");
	      System.out.println("Created with Load Factor " + hmapFac);
	      
	  
	      
	      //how to copy one hashmap content to another hashmap
	      Map<String, String> hmap1 = new HashMap<>();
	      hmap1.put("1", "Debu");
	      hmap1.put("2", "Debu");
	      hmap1.put("3", "Shyam");
	      hmap1.put("4", "Uttam");
	      hmap1.put("5", "Gautam");
	      // Create another HashMap
	      HashMap<String, String> hmap2 = new HashMap<String, String>();
	      // Adding elements to the recently created HashMap
	      hmap2.put("7", "Jerry");
	      hmap2.put("8", "Tom");
	      // Copying one HashMap "hmap" to another HashMap "hmap2"
	      hmap2.putAll(hmap1);
	      System.out.println("After Copy in The HashMap " + hmap2);
	      
	    // Map containsKey(), containsValue and get() method
	      // get() by index for List and similar contains available for List , Set
	      
	      Map<String, String> map = new HashMap<>();
			map.put("1", "Debu");
			map.put("2", "Debu");
			map.put("3", "Shyam");
			map.put("4", "Uttam");
			map.put("5", "Gautam");
			System.out.println("Map containsKey() : " + map.containsKey("2"));
			System.out.println("Map containsValue() : " + map.containsValue("Debu"));
			System.out.println("Map get() : " + map.get("4"));
			
			
		   // Few Common Collection Method ========
			List<Integer> list = new ArrayList<>();
			list.add(5);
			list.add(3);
			list.add(6);
			list.add(1);
			// size()
			System.out.println("List Size() : " + list.size());
			// contains() , Similar containsAll() take all collection Object
			System.out.println("List Contains() : " + list.contains(1));
			// remove() - Here by object of element , also can be happen by index 
			// Similar removeAll() take all collection Object
			System.out.println("List Before remove : " + list);
			System.out.println("List remove() : " + list.remove(3));
			System.out.println("List After remove : " + list);
			
			// isEmpty()
			System.out.println("List isEmpty() : " + list.isEmpty());
			// retainAll() - matching
			list.add(1);
			list.add(8);
			List<Integer> list1 = new ArrayList<>();
			list1.add(8);
			list1.add(3);
			System.out.println("List Before retainAll() : " +list );
			list.retainAll(list1);
			System.out.println("List AFter retainAll() : " +list );
			
			// clear()
			System.out.println("List Before clear() : " +list );
			
			list.clear();
			System.out.println("List AFter clear() : " + list );
			// Below line compile time error
			//System.out.println("List AFter clear() : " + list.clear() );
			list.add(1);
			list.add(3);
			list.add(6);
			System.out.println("List AFter Adding() : " +list );
			
			
	}
}
