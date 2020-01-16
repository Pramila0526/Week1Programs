package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 *  @author: Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Vending Machine Program.
 * 
 */

public class VendingMachine 
{
   public static void main(String[] args) 
	{
		
		System.out.println("Enter the amount");
		int Amount=Utility.integerInput();
		System.out.println(Utility.vendingMachine(Amount));
	}
}