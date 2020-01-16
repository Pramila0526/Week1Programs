/**
 *  @author: Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Program to Calculate Monthly Payment.
 * 
 */

package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter Principle");
		double Principle=Utility.doubleInput();
		System.out.println("Enter Years");
		int Years=Utility.integerInput();
		System.out.println("Enter Rate");
		double Rate=Utility.doubleInput();
	    
		System.out.println(Utility.monthlyPayment(Principle,Years,Rate));

	}

}
