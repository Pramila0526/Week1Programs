package com.bridgelabz.fellowshipprogramss.datastructure;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class Queue 
{
	int MAX=5;
	int a[]=new int[MAX];
	int front=-1;
	int rear=-1;
	
 int eneque()
	{
		
		if(rear==MAX-1)
		{
			System.out.println("OverFlow");
		}
		else
		{
			if(front==-1)
			{
				front=0;
			}
		}
		System.out.println("Enter Element");
		int element=Utility.integerInput();
		rear++;
		return a[rear]=element;
	}

	void dequeue()
	{
		if(front==-1 || front>rear)
		{
			System.out.println("UnderFlow");
		}
		else
		{
			System.out.println("Delete Element" +a[front]);
			front++;
		}
	}
	void display()
	{
		int i;
		if(front==-1)
		{
			System.out.println("Array is Empty");
		}
		else
		{
			System.out.println("Elements are");
			for( i=front;i<=rear;i++)
			{
				System.out.println(a[i]);
			}
				
		}
	}
	
	public static void main(String args[])
	{
		
     //   int arrival;
		boolean flag=true;
		Queue q=new Queue();
		
		System.out.println("1. Deposit Money");
		System.out.println("2. Withdraw Money");
		System.out.println("3. Display");
		while(flag)
		{
			System.out.println("Enter Choice");
			int ch=Utility.integerInput();
			
			switch(ch)
			{
			case 1: q.eneque();
			break;
			case 2: q.dequeue();
			break;
		    case 3: q.display();
			break;
			case 4: flag=false;
			break;
			default : 
				System.out.println("Invalid Choice");
			break;
			}
		}
	}
}



