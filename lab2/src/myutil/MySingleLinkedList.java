package myutil;

public class MySingleLinkedList<E> extends OurAbstractList {
	private Node<E> node = null;
	private Node<E> head = null;
	private int size;

	public MySingleLinkedList() {

	}
	/*
	 * 
	 * 
	 * returns true if it is empty, else false.
	 */

	public boolean isEmpty() {
		if (this.head == null) {
			return true;
		} else {
			return false;
		}
	}

	/*
	 * returns length of the list.
	 * 
	 */
	public int getSize() {
		return this.size;
	}
	/*
	 * 
	 * 
	 *  prints the entire list, will stop when the next node is null.
	 */
		public void printList() {
			Node<E> node = head;

			while (node.getNext() != null) {

				System.out.println(node.getData());
				node = node.getNext();
			}
			System.out.println(node.getData());
		}
	/*
	 * 
	 * 
	 * search for a specific element in the list, if the length of the List is less
	 * than the search key it will throw an out of reach error.
	 * 
	 * @Returns the number at the index.
	 * @parameter int searchkey 
	 * @throws OutOfReachError
	 */

	public E findElement(int searchKey) throws OutOfReachException {
		if (!this.isEmpty() && (searchKey < getSize())) {

			Node<E> current = head;
			for (int i = 1; i < searchKey; ++i) {
				current = current.getNext();
			}
			return current.getData();

		} else {
			throw new OutOfReachException();
		}

	}

	/*
	 * 
	 * Checks whether the list is empty or not then proceeds to insert it at the
	 * head if it is. else it loops until it finds an empty spot that got the value
	 * null. Also count size++.
	 * @param takes in an Element data
	 */
	
	
	public void add(E data) {

		Node<E> temp = new Node<E>(data);
		Node<E> current = head;

		if (head == null) {

			this.head = temp;
			current = head;
			size++;
			return;

		}

		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(temp);
		size++;

	}

}
