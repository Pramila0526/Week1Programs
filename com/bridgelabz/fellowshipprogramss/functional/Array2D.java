/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Printing 2D Array.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class Array2D
{
	public static void main(String[] args) 
	{
	    
		/*
		 * int a; 
		 * a=Utility.Array2D();
		 */
		 System.out.println("Enter number of rows"); 
		 int row=Utility.integerInput();
		 System.out.println("Enter number of columns"); 
		 int column=Utility.integerInput();
		 int arr[][]=new int[row][column];
		 
		System.out.println("enter " +row*column+ " Elements to store in an array");
	     
		System.out.println(Utility.array2D(row,column,arr));
	}
}