package com.bridgelabz.fellowshipprogramss.algorithm;
/**
 * @author : Pramila0526
 *  Date   : 9/11/2019
 *  Purpose: Sorting an Array using Merge Sort.
 * 
 */

public class MergeSort 
	{
	 static int array[];
	 static int tempMergeArray[];
	 int length;
		
	  public static void main(String[] args) 
		{
		
		 int inputArr[]= {48,36,13,52,19,94,21};
		 MergeSort ms=new MergeSort();
		 ms.sort(inputArr);
		 for(int i:inputArr)
		 {
			 System.out.println(+i+ " ");
		 }
		 
		}
	
	  public  void sort(int inputArr[])
	  {
        array=inputArr;
	  	length=inputArr.length;
	 
		tempMergeArray=new int[length];
	  	divideArray(0,length-1);
	 
	  	
	  } 
	    public static void divideArray(int lowerIndex,int higherIndex)
	  {
	   if(lowerIndex<higherIndex)
	   {
	  	 int middle=(lowerIndex+higherIndex)/2;
	  	 divideArray(lowerIndex,middle);
	  	 divideArray(middle+1,higherIndex);
	  	 mergeArray(lowerIndex,middle,higherIndex);
	  }
	  }
	   public static  void mergeArray(int lowerIndex,int middle,int higherIndex)
	   {
	  for(int i=lowerIndex;i<=higherIndex;i++)
	   {
	  	 tempMergeArray[i]=array[i];
	   }
	   int i=lowerIndex;
	  
	  int j=middle+1;
	   int k=lowerIndex;
	   while(i<=middle && j<=higherIndex)
	   {
	  	 if(tempMergeArray[i]<=tempMergeArray[j])
	  	 {
	  		 array[k]=tempMergeArray[i];
	  		 i++;
	  	 }
	  	 else
	  	 {
	  		 array[k]=tempMergeArray[j];
	  		 j++;
	  	 }
	  	 k++;
	   }
	   while(i<=middle)
	   {
	  	 array[k]=tempMergeArray[i];
	  	 k++;
	  	 i++;
	   }

	  }

	}	
