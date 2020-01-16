package com.bridgelabz.fellowshipprogramss.datastructure;

/**
 * @author Pramila0526 Date :19/11/2019
 *
 */

public class DequeueForPalindrome<E> {

	public class Deque<E> 
	{
		public E data;
		public Deque<E> next;
		public Deque<E> previous;

		public Deque() { 
			this.next = null;
			this.previous = null;
		}

		public Deque(E val) {
			this.data = val;
			this.next = null;
			this.previous = null;
		}
	}

	Deque<E> front;
	Deque<E> rear;
	int size = 0;
	private Deque<E> Node;


	public void addFront(E c) 
	{
		if (front == null) 
		{
			front.data = c;
			rear = front;
		} else 
		{
			Node = null;
			Node.data = c;
			Node.next = front;
			front.previous = Node;
			front = Node;
		}
		size++;
	}

	
	public void addRear(E c) 
	{
		if (front == null) 
		{
			Deque<E> Node = new Deque<E>(c);
			front = Node;
			rear = front;
		} else 
		{
			Deque<E> tNode = new Deque<E>(c);
			rear.next = tNode;
			tNode.previous = rear;
			rear = tNode;
		}
		size++;
	}

	// remove front
	public E removeFront() {
		E val = null;
		if (front == null) {
			System.out.println("No elements to delete");
		} else {
			val = front.data;
			front = front.next;
		}
		size--;
		return val;
	}

	// remove rear
	public E removeRear() 
	{
		E val = null;
		if (front == null) 
		{
			System.out.println("No element to delete");
		} else 
		{
			val = rear.data;
			rear = rear.previous;
			rear.next = null;
		}
		size--;
		return val;
	}

	// to remove
	public boolean isEmpty() {
		if (front == null)
			return true;
		else
			return false;
	}

	// return size of dequeue
	public int size() {
		return size;
	}
}
