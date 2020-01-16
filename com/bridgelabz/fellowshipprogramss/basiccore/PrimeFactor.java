package com.bridgelabz.fellowshipprogramss.basiccore;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class PrimeFactor 
{

		public static void main(String args[])
		{
			
			System.out.println("Enter the Number");
			int number=Utility.integerInput();
			System.out.println("Prime Factors");
			System.out.println(Utility.primeFactor(number));
		}	

	}

