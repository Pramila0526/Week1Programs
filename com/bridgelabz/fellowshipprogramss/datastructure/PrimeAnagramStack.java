package com.bridgelabz.fellowshipprogramss.datastructure;
import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public class PrimeAnagramStack {
	public static void main(String[] args) {
		int size = 1000;
		int primeCount=0;
		int count=0;
		while(primeCount<=size) {
			if(Utility.prime(primeCount)) {
				count++;
			}
			primeCount++;
		}
		 System.out.println();
		 System.out.println("Anagram");
		 int[] prime= new int[count];
		 primeCount=1;
		 int loop=0;
		 while(primeCount<=size) {
			 if(Utility.prime(primeCount)) {
				 prime[loop]=primeCount;
				 loop++;
			 }
			 primeCount++;
		 }
		 
		 Utility.primeAnagramLinkedListStack(prime);
	}
}