package Com.techtalk.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueInterfaceMethodCode {
	public static void main(String[] args) {
		
		 // Creating Queue using the LinkedList class
        Queue<Integer> queue = new LinkedList<>();

        // offer() elements to the Queue
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        System.out.println("Offer insert : " + queue.add(4));
        // add()
        queue.add(5);
        System.out.println("Add insert : " + queue.add(6));
        
        System.out.println("Queue: " + queue);

        // peek() -> Access elements of the Queue
        int accessedNumber = queue.peek();
        System.out.println("Accessed By peek() Element: " + accessedNumber);
        
       // element() -> Access elements of the Queue
        int accessedNumber1 = queue.element();
        System.out.println("Accessed By element() Element: " + accessedNumber1);

        // poll() -> Remove elements from the Queue
        int removedNumber = queue.poll();
        System.out.println("Removed By poll() Element: " + removedNumber);

        System.out.println("Updated After poll() Queue: " + queue);
        
        // poll() -> Remove elements from the Queue
        int removedNumber1 = queue.remove();
        System.out.println("Removed By remove() Element: " + removedNumber1);

        System.out.println("Updated After remove() Queue: " + queue);
		
	}

}
