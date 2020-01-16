package com.bridgelabz.fellowshipprogramss.datastructure;

/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class LinkedStack<T> 
{
	public class Node<T>
	{
		public Node<T> next;
		public T data;
		public Integer key;
		public Node(T data) 
		{
			this.data=data;
		}
		public Node(Integer key, T data) 
		{
			this.key=key;
			this.data=data;
		}

	}
	
	Node<T> head;
	
	public void add(T data)
   {
		Node<T> n = new Node<T>(data);
		if(head==null)
			head=n;
		else 
		{
			n.next=head;
			head=n;
		}
	}
	
	public void display()
	{
		Node<T> t=head;
		while(t!=null) 
		{
			System.out.println(t.data);
			t=t.next;
		}
	}
	
	public void remove() 
	{
		Node<T> t=head;
		head = t.next;
	}
	public Integer pop()
	{
		Node<T> t=head;
		Integer temp = (Integer) t.data;
		head = t.next;
		return temp;
	}
	
	public static void main(String[] args) 
	{
		LinkedStack<Integer> l = new LinkedStack<Integer>();
		l.add(2);
		l.add(10);
		l.add(5);
		l.display();
		System.out.println("==");
		l.display();
	}
	
}