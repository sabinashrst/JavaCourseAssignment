//Assignment: 4.2
//Author: Sabina Shrestha

import java.util.LinkedList;

public class GenericQueue<E> {

	private LinkedList<E> list = new LinkedList<E>();

	//method named enqueue with a generic argument named item that adds the item to the list using the addFirst method
	public void enqueue(E item) {
		list.addFirst(item);
	}

	//method named dequeue with a generic return type that removes the first object in the queue using the removeFirst method. 
	public E dequeue() {
		return list.removeFirst();
	}

	//method named size with a data return type of integer that specifies the size of the list using the size method
	public int size() {
		return list.size();
	}

}
