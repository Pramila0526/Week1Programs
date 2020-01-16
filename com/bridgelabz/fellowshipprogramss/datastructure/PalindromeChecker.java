package com.bridgelabz.fellowshipprogramss.datastructure;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526 
 * Date :19/11/2019
 *
 */
public class PalindromeChecker 
{
	public static void main(String[] args) 
	{
		//Utility u = new Utility();
		DequeueForPalindrome<Character> dq = new DequeueForPalindrome<Character>();
		System.out.println("Enter a String: ");
		String s = Utility.stringInput();

//adding each character to the rear of the deque
		for (int i = 0; i < s.length(); i++) 
		{
			char c = s.charAt(i);
			dq.addRear(c);
		}
		int flag = 0;

		while (dq.size() > 1) 
		{
			if (dq.removeFront() != dq.removeRear())
			{
				flag = 1;
				break;
			}
		}

		if (flag == 0)
		{
			System.out.println("String is palindrome");
		} 
		else 
		{
			System.out.println("String is not palindrome");
		}
	}
}
