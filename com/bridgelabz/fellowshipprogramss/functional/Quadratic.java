/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Quadratic Equation.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Quadratic {

	public static void main(String[] args) 
	{
		System.out.println("Enter the value of a b and c");
		double a=Utility.doubleInput();
		double b=Utility.doubleInput();
		double c=Utility.doubleInput();
		System.out.println(Utility.quadratic(a,b,c));

	}

}
