package MyTestPackage;

import myutil.*;

public class Test3 {

	public static void main(String[] args) {
/*
 * creates a stack of integer for testing
 */
		MyQueue<Integer> stackTest = new MyQueue<Integer>();
		System.out.println("Kollar stacksize " + stackTest.getSize());

		stackTest.enqueue(2);
		stackTest.enqueue(21);
		stackTest.enqueue(13);
		stackTest.enqueue(165);
		stackTest.enqueue(12);

		System.out.println(stackTest.dequeue());
		System.out.println(stackTest.dequeue());
		System.out.println(stackTest.dequeue());
		System.out.println(stackTest.dequeue());
		System.out.println(stackTest.dequeue());
		System.out.println(stackTest.getSize());
//		System.out.println("Gör en sista dequeue för att testa exception.");
//		stackTest.dequeue();

	}
}
