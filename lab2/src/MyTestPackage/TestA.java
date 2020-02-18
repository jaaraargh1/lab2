package MyTestPackage;

import myutil.*;

public class TestA{

	public static void main(String[] args) {

		Node<Integer> node = new Node<Integer>(null);		
		node.setData(3);
		System.out.println("printa första noden. " + node.getData());

		node.setNext(new Node<Integer>(51));
		System.out.println("abndra noden " + node.getNext().getData());

		node.getNext().setNext(new Node<Integer>(53));

		System.out.println("tredje noden: " + node.getNext().getNext().getData());
	}

}
