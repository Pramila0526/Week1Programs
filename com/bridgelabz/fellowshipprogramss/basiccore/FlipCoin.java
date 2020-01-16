package com.bridgelabz.fellowshipprogramss.basiccore;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Program to Flip a Coin.
 * 
 */
public class FlipCoin 
{
   public static void main(String[] args) 
	{
	System.out.println("How many times you want to flip the coin ?");
	int flips=Utility.integerInput();	
	
    System.out.println(Utility.flipCoin(flips));
	}

}
