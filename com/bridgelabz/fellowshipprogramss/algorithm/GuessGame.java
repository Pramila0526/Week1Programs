package com.bridgelabz.fellowshipprogramss.algorithm;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class GuessGame
{
	public static void main(String[] args)
	{
		
	System.out.println("Enter the First Number");
	int low=Utility.integerInput();
	System.out.println("Enter the Second Number");
	int high=Utility.integerInput();
	System.out.println("Guess a number between " +low+ " and " +high);
    
	System.out.println(Utility.guessGame(low, high));
	}
}