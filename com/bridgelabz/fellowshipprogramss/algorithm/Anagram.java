package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Anagram Detection
 * 
 */

public class Anagram {

	public static void main(String[] args)
	{
		System.out.println("Enter first String");
		String first=Utility.stringInput();
		
		System.out.println("Enter second String");
		String second=Utility.stringInput();
		
		System.out.println(Utility.anagram(first,second));

	}

}
