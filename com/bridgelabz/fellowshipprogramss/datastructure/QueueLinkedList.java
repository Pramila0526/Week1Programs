package com.bridgelabz.fellowshipprogramss.datastructure;

public class QueueLinkedList<T> {
	public MyNode<T> front, rear;
	public int size = 0;

//Constuctor
	public QueueLinkedList() {
		front = null;
		rear = null;
		size = 0;
	}

	/**
	 * Purpose : Function to check is Queue is empty
	 * 
	 * @return null value
	 */
	public boolean isQueueEmpty() {
		return front == null;
	}

	/**
	 *
	 * @return Size
	 */
	public int getsize() {
		return size;
	}

	/**
	 * Purpose : function to Insert data into Queue
	 * 
	 * @param : Passing data as an argument
	 */
	public void insert(T data) {
		MyNode<T> node = new MyNode<T>(data, null);
		if (front == null) {
			front = node;
			rear = node;
		} else {
			rear.setNextRef(node);
			rear = rear.getNextRef();
		}
		size++;
	}

	/**
	 * Purpose : Function to remove data into Queue
	 * 
	 * @return Current value
	 */
	public T remove() {
		if (isQueueEmpty()) {
			System.out.println("UnderFlow");
		}
		MyNode<T> current = front;
		front = current.getNextRef();
		if (front == null) {
			rear = null;
			size--;
		}
		return current.getValue();
	}

	/**
	 * Purpose to Print the data
	 */
	public void display() {
		if (isQueueEmpty()) {
			System.out.println("Queue is Empty");
			return;
		} else {
			MyNode<T> temp = front;
			while (temp != null) {
				System.out.print(temp.getValue() + " ");
				temp = temp.getNextRef();
			}
		}
	}
}
