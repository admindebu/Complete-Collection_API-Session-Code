package Com.techtalk.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class ConcurrentModificationExceptionReplicate {

	public static void main(String args[]) {

		/*
		 * its clear that the concurrent modification exception is coming when
		 * we call iterator next() function. If you are wondering how Iterator
		 * checks for the modification, its implementation is present in
		 * AbstractList class where an int variable modCount is defined.
		 * modCount provides the number of times list size has been changed.
		 * modCount value is used in every next() call to check for any
		 * modifications in a function checkForComodification().
		 */
		List<String> list = new ArrayList<String>();

		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");

		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println("List Value:" + value);
			if (value.equals("3"))
				list.remove(value);
		}

		/*
		 * Since we are updating the existing key value in the myMap, its size
		 * has not been changed and we are not getting
		 * ConcurrentModificationException. Note that the output may differ in
		 * your system because HashMap keyset is not ordered like a List. If you
		 * will uncomment the statement where I am adding a new key-value in the
		 * HashMap, it will cause ConcurrentModificationException.
		 */
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("1", "1");
		myMap.put("2", "2");
		myMap.put("3", "3");

		Iterator<String> it1 = myMap.keySet().iterator();
		while (it1.hasNext()) {
			String key = it1.next();
			System.out.println("Map Value:" + myMap.get(key));
			if (key.equals("2")) {
				myMap.put("1", "4");
				// myMap.put("4", "4");
			}
		}
		/*
		 * You can convert the list to an array and then iterate on the array.
		 * This approach works well for small or medium size list but if the
		 * list is large then it will affect the performance a lot.
		 * 
		 * You can lock the list while iterating by putting it in a synchronized block. This
		 * approach is not recommended because it will cease the benefits of
		 * multithreading. 
		 * 
		 * If you are using JDK1.5 or higher then you can use
		 * ConcurrentHashMap and CopyOnWriteArrayList classes. This is the
		 * recommended approach to avoid concurrent modification exception.
		 */

	}

}
