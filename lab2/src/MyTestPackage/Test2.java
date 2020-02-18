package MyTestPackage;

import myutil.*;

public class Test2 {

	public static void main(String[] args) {

		MyStack<Integer> stackTest = new MyStack<Integer>();

		stackTest.push(2);
		stackTest.push(21);
		stackTest.push(13);
		stackTest.push(165);
		stackTest.push(12);
		stackTest.push(22);
		System.out.println("Har pushat in 2,21,13,165,12,22 i stacken. Kommer nu poppa alla.");
		System.out.println(stackTest.peek());

		stackTest.pop();
		
		System.out.println(stackTest.peek());
		stackTest.pop();
		System.out.println(stackTest.peek());
		stackTest.pop();
		System.out.println(stackTest.peek());
		stackTest.pop();
		System.out.println(stackTest.peek());
		stackTest.pop();
		System.out.println(stackTest.peek());


	}

}