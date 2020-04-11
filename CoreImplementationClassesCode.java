package Com.techtalk.collection;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Properties;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;

public class CoreImplementationClassesCode {

	public static void main(String[] args) throws IOException {

		/*
		 * This queue orders elements FIFO (first-in-first-out). It means that
		 * the head of this queue is the oldest element of the elements present
		 * in this queue. The tail of this queue is the newest element of the
		 * elements of this queue. The newly inserted elements are always
		 * inserted at the tail of the queue, and the queue retrieval operations
		 * obtain elements at the head of the queue.
		 */

		// Better To Create HashSet and convert a HashSet to a TreeSet
	/*	HashSet<String> hset = new HashSet<String>();
		hset.add("Debu");
		hset.add("Uttam");
		hset.add("Kuber");
		hset.add("Gautam");
		System.out.println("HashSet contains: " + hset);
		// Creating a TreeSet of HashSet elements
		Set<String> tset = new TreeSet<String>(hset);
		System.out.println("TreeSet contains: " + tset);*/
		
      // PriorityQueue Example
		/*PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>();
		// pQueue.add(null);
		pQueue.add(10);
		pQueue.add(20);
		pQueue.add(15);
		pQueue.add(25);
		// Printing the top element of PriorityQueue
		System.out.println(pQueue.peek());
		// Printing the top element and removing it
		System.out.println(pQueue.poll());
		// Printing the top element again
		System.out.println(pQueue.peek());
		// Removing Java using remove()
		pQueue.remove(20);
		System.out.println(pQueue.peek());
		System.out.println(pQueue);*/

		// Difference Between Queue and BlockingQueue

		/*
		 * A normal Queue will return null when accessed if it is empty, while a
		 * BlockingQueue blocks if the queue is empty until a value is
		 * available.
		 

		// Difference Between priority queue and PriorityBlockingQueue
		
		 * The head of the priority queue is the least element based on the
		 * natural ordering or comparator based ordering. When we poll the
		 * queue, it returns the head object from the queue. If multiple objects
		 * are present of same priority the it can poll any one of them
		 * randomly. PriorityBlockingQueue is thread safe
		 */

		// PriorityBlockingQueue Example
		/*PriorityBlockingQueue<Integer> pBQueue = new PriorityBlockingQueue<Integer>();
		// pBQueue.add(null);
		pBQueue.add(10);
		pBQueue.add(20);
		pBQueue.add(15);
		pBQueue.add(25);
		// Printing the top element of PriorityQueue
		System.out.println(pBQueue.peek());
		// Printing the top element and removing it
		System.out.println(pBQueue.poll());
		// Printing the top element again
		System.out.println(pBQueue.peek());
		// Removing Java using remove()
		pBQueue.remove(20);
		System.out.println(pBQueue.peek());
		System.out.println(pBQueue);*/

	/*	
		 * Bounded Means -> it means that the size of the Queue is fixed. Once
		 * created, the capacity cannot be changed. That is mean you have to
		 * give the size while initialize the constructor
		 * 
		 
*/
		// Example of ArrayBlockingQueue

		// define capacity of ArrayBlockingQueue
/*		int capacity = 15;
		// using ArrayBlockingQueue(int initialCapacity) constructor
		ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<Integer>(capacity);
		abq.add(5);
		abq.add(6);
		abq.add(7);
		abq.add(8);
		System.out.println("ArrayBlockingQueue:" + abq);

		// using ArrayBlockingQueue(int initialCapacity) constructor
		ArrayBlockingQueue<String> abqs = new ArrayBlockingQueue<String>(capacity);
		abqs.add("A");
		abqs.add("B");
		abqs.add("C");
		abqs.add("D");
		System.out.println("ArrayBlockingQueue:" + abqs);
*/
		
/*		// Example of HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("Debu", 1);
		map.put("Uttam", 2);
		map.put("Gautam", 3);
		map.put(null, 2);
		map.put("", 6); // But this is interesting , It will allow
		// map.put("Gautam", 4);
		// map.putIfAbsent("Gautam", 4);

		System.out.println("Size of HashMap is:- " + map.size());
		System.out.println(map);*/

		// Example of LinkedHashMap
	/*	Map<String, Integer> lMap = new LinkedHashMap<String, Integer>();
		lMap.put("Debu", 1);
		lMap.put("Uttam", 2);
		lMap.put("Gautam", 3);
		lMap.put(null, 6);
		// map.put("Gautam", 4);

		System.out.println("Size of LinkedHashMap is:- " + lMap.size());
		System.out.println(lMap);*/

		
	/*	// Example of TreeMap
		Map<String, Integer> tMap = new TreeMap<String, Integer>();
		tMap.put("Debu", 1);
		tMap.put("Uttam", 2);
		tMap.put("Gautam", 3);
		// tMap.put(null, 2);
		// tmap.put("Gautam", 4);

		System.out.println("Size of TreeMap is:- " + tMap.size());
		System.out.println(tMap);
*/
		/*	
		 * The built-in synchronization prevents problems when two threads call
		 * put at the same time for example. ConcurrentModification Exception
		 * You might also want to look into ConcurrentHashMap
		 
*/
	/*	// Example of HashTable
		Hashtable<String, Integer> hMap = new Hashtable<String, Integer>();
		hMap.put("Debu", 1);
		hMap.put("Uttam", 2);
		hMap.put("Gautam", 3);
		hMap.put("", 3); // But this is interesting , It will allow
		//hMap.put(null, 2); // Doesn't allow key
		// hMap.put("Sumo", null); // Doesn't allow value

		System.out.println("Size of Hashtable is:- " + hMap.size());
		System.out.println(hMap);*/

	/*	// Example of Properties
		Properties prop = new Properties();
		Set URL;
		String str;
		prop.put("organization", "org.techtalk.debu");
		prop.put("website", "http.hello.world");
		prop.put("tech", "java.com.collection");
		// checking what's in table
		URL = prop.keySet();
		Iterator itr = URL.iterator();
		while (itr.hasNext()) {
			str = (String) itr.next();
			System.out.println("The URL for " + str + " is " + prop.getProperty(str));
		}
		System.out.println();
		// looking for URL that not in list
		str = prop.getProperty("article", "not found");
		System.out.println("The URL for article is " + str);
*/
		// Real Use of Properties for read
		/*FileReader reader = new FileReader("resource//db.properties");
		Properties p = new Properties();
		p.load(reader);
		System.out.println(p.getProperty("user"));
		System.out.println(p.getProperty("password"));
		
		// Real Use of Properties for write
		Properties pw = new Properties();
		pw.setProperty("name","Debu paul");  
		pw.setProperty("email","debu.paul.cse@gmail.com");    
		pw.store(new FileWriter("resource//info.properties"),"Techtalk Properties Example");
		*/
	

		// Example of ConcurrentHashMaps
		ConcurrentHashMap<Integer,String> cMap = new ConcurrentHashMap<Integer,String>(); 
		cMap.put(1, "Debu"); 
		cMap.put(2, "Uttam"); 
		cMap.put(3, "Gautam"); 
		cMap.put(3, "Debu"); 
        // Here we cant add Hello because 101 key 
        // is already present in ConcurrentHashMap object 
		cMap.putIfAbsent(2, "TOM"); 
		System.out.println(cMap);
    /*    // We can remove entry because 101 key 
        // is associated with For value 
		cMap.remove(2, "Uttam"); 
        // Now we can add Hello 
		cMap.putIfAbsent(5, "Marlo"); 
        // We cant replace Hello with For 
		cMap.replace(2, "Uttam", "Tom"); 
        System.out.println(cMap);*/
	}

}
