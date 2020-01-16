/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Program to Multiply 2 Matrix.
 * 
 */

package com.bridgelabz.fellowshipprogramss.functional;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class MatrixMultiplication 
{
	public static void main(String[] args) 
	{
		int i;
		System.out.println("Enter the number of rows");
		int rows=Utility.integerInput();
		System.out.println("Enter the number of columns");
		int columns=Utility.integerInput();;
		int arr1[][]=new int[rows][columns];
		int arr2[][]=new int[rows][columns];
		int result[][]=new int[rows][columns];
		System.out.println("Enter the Elements in the first array");
		
		for( i=0;i<rows;i++)
			 {
			 for(int  j=0;j<columns;j++)
			 {
				 arr1[i][j]=Utility.integerInput();
			 }
			 }
		System.out.println("Enter the Elements in the Second array");
		for( i=0;i<rows;i++)
			 {
			 for(int j=0;j<columns;j++)
			 {
				 arr2[i][j]=Utility.integerInput();
			 }
			
			 
		 }
		System.out.println(Utility.matrixMultiplication(rows,columns,arr1,arr2,result));
		

	}


}
