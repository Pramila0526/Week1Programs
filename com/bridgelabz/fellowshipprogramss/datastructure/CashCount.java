package com.bridgelabz.fellowshipprogramss.datastructure;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526
 *  Date :19/11/2019
 *
 */
public class CashCount 
{
	public static void main(String args[]) 
	{
	
		BankingSimulation q = new BankingSimulation();
		int ch = 0;

		do 
		{

			System.out.println();
			System.out.println("*****Banking Cash Counter*****");
			System.out.println("1.Deposit ");
			System.out.println("2.Withdraw ");
			System.out.println("3.Number of people in the Queue ");
			System.out.println("4.Exit ");
			System.out.println();
			System.out.println("Enter your choice: ");
			int choice = Utility.integerInput();

			switch (choice)
			{
			case 1:
				System.out.println("Enter the amount you want to Deposit");
				int amount = Utility.integerInput();
				q.insert(amount);
				q.display();
				break;

			case 2:
				System.out.println("Enter the amount you want to Withdraw ");
				amount = Utility.integerInput();
				System.out.println(" Your Available Balance is: ");
				int ab = q.peek();
				int available = ab - amount;
				System.out.println(available);
				q.remove();
				break;

			case 3:
				int j = q.getSize();
				System.out.println("The Number of People in Queue is: " + j);
				break;

			case 4:
				System.exit(0);
			default:
				System.out.println("You entered wrong choice");
				break;
			}

		} 
		while (ch <= 5);

	}
}
