package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Sorting an Array using Insertion Sort.
 * 
 */


public class InsertionSort {

	public static void main(String[] args)
	{
		int i;

		System.out.println("Enter the number of Elements");
		int n=Utility.integerInput();
		int a[]=new int[n];
		System.out.println("Enter the Elements");
		for( i=0;i<n;i++)
		{
			a[i]=Utility.integerInput();
		}
		
		System.out.println(Utility.insertionSort(n,a));
	}

}
