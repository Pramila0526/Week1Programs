/**
 *  @author: Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: WindChill Program.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class WindChill 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the value of t and v");
		double t=Utility.doubleInput();
		double v=Utility.doubleInput();
		System.out.println(Utility.windChill(t,v));

	}

}
