package Com.techtalk.collection;

import java.util.Stack;

public class StackClassMethodCode {
	
	public static void main(String[] args) {
		

		Stack<String> stack = new  Stack<>();
		// push() method
		stack.push("Debu");
		stack.push("Uttam");
		stack.push("Gautam");
		// add() method
		stack.add("Tom");
		System.out.println("Stack Data : " + stack);
		
		// peek() method
		System.out.println("Stack Data peek() : " + stack.peek());
		
		// pop() method
		stack.pop();
		System.out.println("Stack Data after pop : " + stack);
		
		// empty() method
		System.out.println("Stack empty : " + stack.empty());
		
		// search() method
		System.out.println("Stack Serch Not present : Debu = " + stack.search(""));
		System.out.println("Stack Serch Present : Debu = " + stack.search("Debu"));
		
	}


}
