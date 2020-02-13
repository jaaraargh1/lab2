package testpaket;

import myutil.*;

public class Test1 {

	public void ListTt() {
		MySingleLinkedList list = new MySingleLinkedList();
		if (list.isEmpty() == true) {
			System.out.println("Listan är tom");
		} else {
			System.out.println("Listna är inte tom.");
		}
		list.add(1);
		if (list.isEmpty() == true) {
			System.out.println("Listan är tom");
		} else {
			System.out.println("Listna är inte tom.");
		}

		list.add(2);
		list.add(6);
		list.add(15);
		list.add(12);
		list.add(162);

		list.add(125);

		list.add(122);

		list.add(17);
		System.out.println("KLARAS FIND ELEMENT LUL letar på plats 5 som är 12. find E : " + list.findElement(5));
		System.out.println("Längden på listan är: " + list.getSize());
		list.printList();

//  	System.out.println(list.size);

		// BEHÖVER SKApA INSERT FUNKTION TILL LISTAN?????
	}

public static void main(String[] args) {
/TestStackList<Integer> Stack = new TestStackList<Integer>();
//Mystack.push();
/*

*/
	
}

}