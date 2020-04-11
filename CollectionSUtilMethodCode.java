package Com.techtalk.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionSUtilMethodCode {
	public static void main(String[] args) {

		// Example Array to convert as List
		String a[] = new String[] { "A", "B", "C", "D" };
		// getting the list view of Array
		List<String> listArr = Arrays.asList(a);
		// printing the list
		System.out.println("The list is: " + listArr);

		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		System.out.println("Simple List " + list);

		// addAll Example
		List<Integer> listAddAll = new ArrayList<>();
		Collections.addAll(listAddAll, 1, 5, 2, 3, 6); // Return boolean
		System.out.println("AddAll :: " + listAddAll);

		// binarSearch Example
		Integer result = Collections.binarySearch(list, 3);
		System.out.println("BinarySearch :: " + result); // Return the index

		// copy example
		List<String> srclst = new ArrayList<String>(3);
		List<String> destlst = new ArrayList<String>(3);
		// Adding element to srclst
		srclst.add("Debu");
		srclst.add("Uttam");
		srclst.add("Gautam");

		// Adding element to destlst
		destlst.add("1");
		destlst.add("2");
		destlst.add("3");

		// copy element into destlst
		Collections.copy(destlst, srclst);
		// printing the srclst
		System.out.println("Value of source list: " + srclst);
		// printing the destlst
		System.out.println("Value of destination list: " + destlst);

		// max example
		System.out.println("Max of list : " + Collections.max(list));

		// min example
		System.out.println("Min of list : " + Collections.min(list));

		// sort example
		Collections.sort(list);
		System.out.println("sort of list : " + list);

		// reverse example
		Collections.reverse(list);
		System.out.println("resverse of list : " + list);

		// Suffle example
		Collections.shuffle(list);
		System.out.println("Shuffle of list : " + list);
		
		// Synchronized example
		
		// List
		Collections.synchronizedList(list);
		// Map
		Map<String,String> map = new HashMap<>();
		Collections.synchronizedMap(map);
		// Set
		Set<String> set = new HashSet<>();
		Collections.synchronizedSet(set);
				
		// unmodifiable example
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		list1.add(6);
		list1.add(1);
		System.out.println("Before unmodifiable List " + list1);
		List<Integer> immutableList = Collections.unmodifiableList(list1);
		immutableList.add(10);
		System.out.println("After unmodifiable List " + immutableList);
		// Similar We can use for other collection Object like : Map, Set , etc
		
		
	}

}
