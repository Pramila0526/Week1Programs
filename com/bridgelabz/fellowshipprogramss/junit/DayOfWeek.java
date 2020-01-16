/**
 *  @author: Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Program to get the day of the given date.
 * 
 */

package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class DayOfWeek 
{

	public static void main(String[] args) 
	{

		System.out.println("Enter the Date");
		int Date=Utility.integerInput();
		System.out.println("Enter the Month");
		int Month=Utility.integerInput();
		System.out.println("Enter the Year");
		int Year=Utility.integerInput();
		// TODO Auto-generated method stub
System.out.println(Utility.dayOfWeek(Date,Month,Year));
	}

}
