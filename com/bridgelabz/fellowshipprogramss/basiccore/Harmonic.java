package com.bridgelabz.fellowshipprogramss.basiccore;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526
 * Date   :21/11/2019
 *
 */
public class Harmonic 
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter the limit");
		int n=Utility.integerInput();
		
	    float harmonic=(float) 0.0;
		while(n>0)
		{
			harmonic= harmonic+ (float) 1/n;
			n--;
			System.out.print(harmonic +"  ");
        }
      System.out.println("");
      System.out.println("Output of Harmonic Series is "+harmonic);
		
	}

}
	/**	float harmonic=1;
		for(int i=2;i<=n;i++)
		{
			harmonic += (float) 1/i;
		}
	      System.out.println(harmonic);
	}
}*/

