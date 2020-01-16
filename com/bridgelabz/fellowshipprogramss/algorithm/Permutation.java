package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class Permutation {

	public static void main(String[] args) 
	{
		
		System.out.println("Enter the String");
		String s = Utility.stringInput();
		System.out.println(Utility.permutationusingrecusrion(s, 0, s.length()));
	}
}
