package com.bridgelabz.fellowshipprogramss.datastructure;

import com.bridgelabz.fellowshipprogramss.utility.Utility;

public class CalenderStack 
{
	

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter year");
			int year=Utility.integerInput();
			
			System.out.println("please enter \n 1.Jan \n 2.Feb \n 3.Mar  \n 4.apr \n 5.may"
					+ "\n 6.jun \n 7.jul \n 8.aug \n 9.sept  \n 10.oct  \n 11.nov  \n 12.dec");
			System.out.println("Enter Month");
			int month=Utility.integerInput();
			String[] months = {""," Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sept","Oct","Nov","Dec"};
			int[] days= { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			
			if(month==2 && Utility.isLeapYear(year))
			{
				days[month]=29;
			}
			
			System.out.println(" "+months[month]+" ");
			System.out.println("S	M	T	W	Th	F	S");
			
			int d=Utility.dayOfWeek1(month,1, year);
			StackLinkedList<StackLinkedList<Integer>>stack=new StackLinkedList<>();
			StackLinkedList<Integer>refstack=new StackLinkedList<>();
			
			for(int i=1;i<days[month];i++)
			{
				refstack.push(i);
				if((i+d)%7==0 || i==days[month])
				{
					stack.push(refstack);
					refstack=new StackLinkedList<Integer>();
					continue;
				}
			}
			
			for(int i=0;i<d;i++)
			{
				System.out.print("	");
			}
			
			for(int i=1;i<days[month];i++)
			{
				System.out.print(i+"\t");

				if(((i+d)%7==0) ||( i==days[month]))
				{
					System.out.println();
				}
			}
		}

	

}