package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Printing the numbers which are Prime and Palindrome too .
 * 
 */

public class PrimePalindrome 
{
	public static void main(String[] args)
	{
		 System.out.println("Enter the Limit");
		 int limit=Utility.integerInput();
		 System.out.println(Utility.primePalindrome(limit));
	}

}
