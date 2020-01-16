
package com.bridgelabz.fellowshipprogramss.datastructure;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

/**
 * @author Pramila0526
 * Date   :19/11/2019
 *
 */
public  class BalanceParenthesis
	{
	
	    int MAX = 10; 
	    int top=-1; 
	    

	 char a[] = new char[MAX]; 
	    
	public  void push(char x) 
	   { 
			if (top == MAX-1) 
			
				System.out.println("Stack full"); 
			
			else
		
				a[++top] =   x; 
			
			
		
		} 

	char pop() 
		{ 
			if (top == -1) 
			{ 
				System.out.println("Underflow error"); 
				return 0 ; 
			} 
			else
			{ 
				char element = a[top]; 
				top--; 
				return element; 
			}
			
		} 
	
			public void display()
			{
				
				if(top>=0)
				{
					System.out.println("Elements are");
					for(int i=0;i>=top;i--)
					{
						System.out.println(a[i]+ "\t");
					}
				}
			}
			
			public boolean isEmpty()
			{
				return (top==-1)? true :false;
			}

 static boolean matchedParenthesis(char character1,char  character2)
{
	if(character1=='(' && character2== ')')
		return true;
	else if(character1=='{' && character2== '}')
		return true;
	else if(character1=='[' && character2== ']')
		return true;
	else
		return false;
}


	  static boolean matchingPair(char a2[])
	{
		BalanceParenthesis br=new BalanceParenthesis();
		for(int i=0;i<a2.length;i++)
		{
			if(a2[i]=='{' || a2[i]=='(' || a2[i]=='[') 
				br.push(a2[i]);
			
			if(a2[i]=='}' || a2[i]==')' || a2[i]==']')
			{
				if(br.isEmpty())
				{
					return false;
				}
				else if(!matchedParenthesis(br.pop(),a2[i]))
		        {
			
					return false;
		        }
			}
	}
				if(br.isEmpty())
				{	
					return true;
				}		
					else
					{
					return false;
				    }
}
					

public static void main(String[] args)
{
	System.out.println("Enter the String");
	String s=Utility.stringInput();
	char a2[]=s.toCharArray();
	if(matchingPair(a2))
		System.out.println("Balanced Parenthesis");
	else
		System.out.println("Not Balanced Parenthesis");
	
	}
}

