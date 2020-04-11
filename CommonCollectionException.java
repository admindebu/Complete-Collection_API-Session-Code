package Com.techtalk.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Hashtable;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;

public class CommonCollectionException {
	
	public static void main(String[] args) {
		
		// Like Hashtable Doesn't allow Null value or Key
		/*Hashtable<String, String> table = new Hashtable<>();
		table.put(null, "Hello");*/
		
		// IndexOutOfBoundsException 
	/*List<String> list = new ArrayList<String>(2);
		list.add("Debu"); // 0
		list.add("Uttam"); // 1
		list.add("Gautam"); // 2
		list.remove(3);*/
		
	/*	// ArrayIndexOutOfBoundsException 
		List<String> list = new ArrayList<String>(2);
		list.add("Debu");
		list.add("Uttam");
		list.add("Gautam");
		list.get(-1);*/
		
		
		// ClassCastException 
		
/*		String[] strArray = new String[] { "John", "Snow" };
		ArrayList<String> strList = (ArrayList<String>) Arrays.asList(strArray);
		System.out.println("String list: " + strList);
		// Solution :: We can simply declare our ArrayList as a List to avoid this exception
		List<String> strList1 = Arrays.asList(strArray);
		
		*/
			
		// IllegalStateException : Queue full
		/*ArrayBlockingQueue<String> abq = new ArrayBlockingQueue<String>(2);
		abq.add("Debu");
		abq.add("Uttam");
		abq.add("Gautam");*/
		
		//UnsupportedOperationException
		List<Integer> list1 = new ArrayList<>();
		list1.add(5);
		list1.add(3);
		list1.add(6);
		list1.add(1);
		System.out.println("Before unmodifiable List " + list1);
		List<Integer> immutableList = Collections.unmodifiableList(list1);
		immutableList.add(10);
		System.out.println("After unmodifiable List " + immutableList);
		
		
		
		
	}

}
