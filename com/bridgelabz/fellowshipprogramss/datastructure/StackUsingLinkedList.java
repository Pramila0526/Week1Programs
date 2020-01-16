package com.bridgelabz.fellowshipprogramss.datastructure;


import static java.lang.System.exit; 


class StackUsingLinkedlist { 

	Node top; 
	private class Node { 

		int data; 
		Node link; 
	} 

	

	StackUsingLinkedlist() 
	{ 
		this.top = null; 
	} 

	 
	public void push(int x)
	{ 
		
		Node temp = new Node(); 

		if (temp == null) { 
			System.out.print("Heap Overflow"); 
			return; 
		} 

		
		temp.data = x; 

	
		temp.link = top; 

		
		top = temp; 
	} 

	
	public boolean isEmpty() 
	{ 
		return top == null; 
	} 

	
	public int peek() 
	{ 
		
		if (!isEmpty()) { 
			return top.data; 
		} 
		else { 
			System.out.println("Stack is empty"); 
			return -1; 
		} 
	} 

	
	public void pop() 
	{ 
		
		if (top == null) { 
			System.out.print("\nStack Underflow"); 
			return; 
		} 

		
		top = (top).link; 
	} 

	public void display() 
	{ 
		// check for stack underflow 
		if (top == null) { 
			System.out.printf("\nStack Underflow"); 
			exit(1); 
		} 
		else { 
			Node temp = top; 
			while (temp != null) { 

				// print node data 
				System.out.printf("%d->", temp.data); 

				// assign temp link to temp 
				temp = temp.link; 
			} 
		} 
	} 
} 
//main class 
public class StackUsingLinkedList { 
	public static void main(String[] args) 
	{ 
		// create Object of Implementing class 
		StackUsingLinkedlist obj = new StackUsingLinkedlist(); 
		// insert Stack value 
		obj.push(11); 
		obj.push(22); 
		obj.push(33); 
		obj.push(44); 

		// print Stack elements 
		obj.display(); 

		// pritn Top element of Stack 
		System.out.printf("\nTop element is %d\n", obj.peek()); 

		// Delete top element of Stack 
		obj.pop(); 
		obj.pop(); 

		// pritn Stack elements 
		obj.display(); 

		// print Top element of Stack 
		System.out.printf("\nTop element is %d\n", obj.peek()); 
	} 
} 
