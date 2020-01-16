package com.bridgelabz.fellowshipprogramss.basiccore;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Program to replace <<username>> with the given String.
 * 
 */
public class Uinput 
{
   public static void main(String[] args) 
	{
	     System.out.println("Enter the username");
		 String UserName=Utility.stringInput();
		 int n=UserName.length();
		 System.out.println(Utility.uInput(UserName,n));

    }
}