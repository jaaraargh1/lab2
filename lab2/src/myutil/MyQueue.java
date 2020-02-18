package myutil;

public class MyQueue<E> {
	private int size = 0;
	private Node<E> front, back = null;

	public MyQueue() {

	}

	/*
	 * 
	 * puts an object into the queue, increases the size.
	 * 
	 * @param takes in E datatype
	 */
	public void enqueue(E data) {
		Node<E> temp = new Node<E>(data);
		temp.setNext(back);
		if (isEmpty()) {
			front = temp;
			back = front;
		} else {
			back.setNext(temp);
			back = temp;

		}
		size++;

	}

	/*
	 * kollar om kön är tom.
	 * 
	 * @returnerar T / F.
	 */
	private boolean isEmpty() {
		if (size == 0) {
			return true;
		}
		return false;
	}

	/*
	 * tar bort den första i kön
	 * 
	 * @returnerar den som är först.
	 * 
	 * @kastar StackisEmptyException ifall kön är tom,
	 */
	public E dequeue() throws StackIsEmptyException {
		if (!isEmpty()) {
			E temp = front.getData();
			front = front.getNext();
			size--;
			return temp;

		}
		{
			throw new StackIsEmptyException();
		}
	}

	/*
	 * return the size of the queue.
	 */
	public int getSize() {
		return this.size;
	}

}
