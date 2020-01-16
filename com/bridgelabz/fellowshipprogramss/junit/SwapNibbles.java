package com.bridgelabz.fellowshipprogramss.junit;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526 
 * Date :21/11/2019
 *
 */
public class SwapNibbles
{
	public int swapNibbles(int x)
	{
		return((x & 0X0F)<<4 | (x & 0XF0)>>4);
	}
	
	public static void main(String[] args)
	{
	    System.out.println("Enter the number");
	    int number=Utility.integerInput();
		System.out.println(number);
		SwapNibbles sn=new SwapNibbles();
		int result=sn.swapNibbles(number);
		System.out.println("Result = " +result);
		int cnt=0;
		for(int i=0;i<=10;i++)
		{
			if(result==Math.pow(2, i))
			{
				cnt=cnt+1;

			}
        }
		if(cnt==1)
		{
			System.out.println(result+" is power of 2");
		}
		else
		{
			System.out.println(result+" is not the power of 2");
		}

	}
}