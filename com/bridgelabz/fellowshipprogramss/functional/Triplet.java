/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: To get the target value from array by adding.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Triplet 
{
   public static void main(String[] args)
	{
		System.out.println("enter the number of elements");
		int n=Utility.integerInput();
		int a[]=new int[n];
		System.out.println("Enter the Elements in an array");
		for(int i=0;i<n;i++)
		{
		a[i]=Utility.integerInput();
		}
		System.out.println("enter your target");
		int target=Utility.integerInput();
		System.out.println(Utility.triplet(n,a,target));
		
	}

}
