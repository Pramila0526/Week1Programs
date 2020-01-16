package com.bridgelabz.fellowshipprogramss.datastructure;

import java.util.NoSuchElementException;

/**
 * @author Pramila0526 
 * Date :19/11/2019
 *
 */
public class BankingSimulation 
{
	public Node front, rear;
	public int size;

	class Node 
	{
		protected int data;
		protected Node link;

		/* Constructor */
		public Node() 
		{
			link = null;
			data = 0;
		}

		/* Parameterized Constructor */
		public Node(int d, Node n) 
		{
			data = d;
			link = n;
		}

		/* Function to set data to current Node */
		public void setData(int d)
		{
			data = d;
		}

		/* Function to get link to next node */
		public Node getLink() 
		{
			return link;
		}

		/* Function to set link to next Node */
		public void setLink(Node n) 
		{
			link = n;
		}

		/* Function to get data from current Node */
		public int getData() 
		{
			return data;
		}
	}

	/* Constructor */
	public BankingSimulation() 
	{
		front = null;
		rear = null;
		size = 0;
	}

	/* Function to check if queue is empty */
	public boolean isEmpty() 
	{
		return front == null;
	}

	/* Function to get the size of the queue */
	public int getSize() 
	{
		return size;
	}

	/* Function to insert an element to the queue */
	public void insert(int data) 
	{
		Node node = new Node(data, null);
		if (rear == null) 
		{
			front = node;
			rear = node;
		} 
		else 
		{
			rear.setLink(node);
			rear = rear.getLink();
		}
		size++;
	}

	/* Function to remove front element from the queue */
	public int remove()
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		Node temp = front;
		front = temp.getLink();
		if (front == null) 
		{
			rear = null;
			size--;
		}
		return temp.getData();

	}

	/* Function to check the front element of the queue */
	public int peek() 
	{
		if (isEmpty()) 
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		return front.getData();
	}

	/* Function to display the status of the queue */

	public void display() 
	{
		int temp = 0;
		System.out.print("Available Balance = ");
		if (size == 0) 
		{
			System.out.print("Empty");
			return;
		}
		Node temp1 = front;

		while (temp1 != rear.getLink()) 
		{
			temp = temp + temp1.getData();
			System.out.println(temp1);
			temp1 = temp1.getLink();
		}
		
		System.out.println();
	}
}
