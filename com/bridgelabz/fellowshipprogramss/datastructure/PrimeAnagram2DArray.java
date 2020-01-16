package com.bridgelabz.fellowshipprogramss.datastructure;
import com.bridgelabz.fellowshipprogramss.utility.Utility;
/**
 * @author Pramila0526 
 * Date :19/11/2019
 *
 */
public class PrimeAnagram2DArray 
{
	public static void main(String[] args)
	{
		int size = 1000;
		int primeCount=1;
		int count=0;
		 while(primeCount<=size)
		 {
			if(Utility.prime(primeCount)) 
			{
				count++;
			}
			primeCount++;
		}
		 System.out.println();
		 System.out.println("Anagram");
		 int[] prime= new int[count];
		 primeCount=1;
		 int i=0;
		 while(primeCount<=size) 
		 {
			 if(Utility.prime(primeCount)) 
			 {
				 prime[i]=primeCount;
				 i++;
			 }
			 primeCount++;
		 }
		Utility.primeAnagram2DArray(prime);
	}
}