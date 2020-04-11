package Com.techtalk.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class CoreInteerfaceCode {

	public static void main(String[] args) {
		
	/*
			List<String> list = new ArrayList<String>();
			list.add(null);
			list.add(null);
			list.add("Debu");
			list.add("Debu");
	
			System.out.println(list);*/

		/*Set<String> set = new HashSet<>();
		set.add(null);
		set.add(null);
		set.add("Debu");
		set.add("Debu");
		set.add("Shyam");
		set.add("Gautam");
		set.add("Uttam");

		System.out.println(set);*/

		/*SortedSet<String> set = new TreeSet<>(); // set.add(null);
		set.add("Debu");
		set.add("Debu");
		set.add("Shyam");
		set.add("Gautam");
		set.add("Uttam");
		

		System.out.println(set);*/

		/*NavigableSet<String> set = new TreeSet<>(); // set.add(null);
		set.add("Debu");
		set.add("Debu");
		set.add("Shyam");
		set.add("Gautam");
		set.add("Uttam");

		System.out.println(set);*/
/*		
		add()- This method is used to add elements at the tail of queue. More specifically, at the last of linked-list if it is used, or according to the priority in case of priority queue implementation.
		peek()- This method is used to view the head of queue without removing it. It returns Null if the queue is empty.
		element()- This method is similar to peek(). It throws NoSuchElementException when the queue is empty.
		remove()- This method removes and returns the head of the queue. It throws NoSuchElementException when the queue is empty.
		poll()- This method removes and returns the head of the queue. It returns null if the queue is empty.
		size()- This method return the no. of elements in the queue.
*/
	/*	Queue<String> queue = new PriorityQueue<>();
		//queue.add(null);
		queue.add("Debu");
		queue.add("Debu");
		queue.add("Shyam");
		queue.add("Gautam");
		queue.add("Uttam");
		
		System.out.println(queue);*/
		

		/*Map<String, String> map = new HashMap<>();
		map.put("null", "null");
		//map.put("null", "2");
		map.put("1", "Debu");
		map.put("1", "Tom");
		map.put("3", "Shyam");
		map.put("4", "Uttam");
		map.put("5", "Gautam");

		System.out.println(map);*/

		/*Map<String, String> map = new TreeMap<>();
		map.put("null", "null");
		map.put("null", "2");
		map.put("1", "Debu");
		map.put("7", "Debu");
		map.put("3", "Shyam");
		map.put("4", "Uttam");
		map.put("5", "Gautam");

		System.out.println(map);*/

		NavigableMap<String, Integer> nm = new TreeMap<String, Integer>();
		nm.put("C", 888);
		nm.put("Y", 999);
		nm.put("A", 444);
		nm.put("T", 555);
		nm.put("B", 666);
		nm.put("A", 555);

		System.out.println(nm);

		System.out.printf("Floor Entry  : %s%n", nm.floorEntry("L"));
		System.out.printf("Cieling Entry  : %s%n", nm.ceilingEntry("L"));
		System.out.printf("Original Map : %s%n", nm);
		System.out.printf("Reverse Map : %s%n", nm.descendingMap());

		NavigableMap<Integer, String> nmmp = new TreeMap<>();

		// assigning the values in the NavigableMap
		// using put()
		nmmp.put(2, "two");
		nmmp.put(7, "seven");
		nmmp.put(3, "three");
		nmmp.put(10, "Ten");

		System.out.println("View of map with key less than" + " or equal to 7 : " + nmmp.headMap(7));

	}

}
