package myutil;

//import myutil.Node;

public class MyStack<E> {
	private int stackSize = 0;
	private Node<E> top = null;

	public MyStack() {

	}

	/*
	 * 
	 * pushar in en datatyp till topepn på stacken.
	 * 
	 */

	public void push(E data) {
		stackSize++;
		Node<E> temp = new Node<E>(data);
		temp.setNext(top);
		top = temp;

	}

	/*
	 * tar bort toppen av stacken
	 */
	public E pop() throws CantPopException {
		stackSize--;
		if (!this.isEmpty()) {
			E i = top.getData();
			top = top.getNext();
			return i;
		}
		{
			throw new CantPopException();
		}
	}

	/*
	 * hämtar toppen av stacken
	 */
	public Node<E> getTop() {
		return top;

	}

	/*
	 * kollar storleken
	 */
	public int getStackSize() {
		return stackSize;
	}

	/*
	 * kollar på toppen vad som finns där kastar ett exception om stacken är tom
	 */
	public E peek() throws StackIsEmptyException {
		if (!this.isEmpty()) {
			return this.getTop().getData();

		} else
			throw new StackIsEmptyException();
	}

	/*
	 * bool som kollar ifall stacken är tom eller ej
	 * 
	 * @ return T / F
	 */
	private boolean isEmpty() {
		if (top == null) {
			return true;
		}
		return false;
	}

}
